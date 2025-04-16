import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Hospital {
    class Department {
        int dep_number;
        String dep_Name;
    }

    class Clinic {
        int cli_number;
        String cli_Name;
    }

    List<Department> department_list;
    List<Clinic> clinic_list;
    List<Doctors> doctors_list;
    List<Patients> patients_list;

    public Hospital() {
        department_list = new ArrayList<>();
        clinic_list = new ArrayList<>();
        doctors_list = new ArrayList<>();
        patients_list = new ArrayList<>();
        initiating_information();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public void initiating_information() {
        Department dep1 = new Department();
        dep1.dep_number = 1;
        dep1.dep_Name = "Emergency Department";
        department_list.add(dep1);

        Department dep2 = new Department();
        dep2.dep_number = 2;
        dep2.dep_Name = "Ophthalmology Department";
        department_list.add(dep2);

        Department dep3 = new Department();
        dep3.dep_number = 3;
        dep3.dep_Name = "Chest Department";
        department_list.add(dep3);

        Department dep4 = new Department();
        dep4.dep_number = 4;
        dep4.dep_Name = "Department of General Surgery";
        department_list.add(dep4);

        Clinic cli1 = new Clinic();
        cli1.cli_number = 1;
        cli1.cli_Name = "Emergency Clinic";
        clinic_list.add(cli1);

        Clinic cli2 = new Clinic();
        cli2.cli_number = 2;
        cli2.cli_Name = "Ophthalmology Clinic";
        clinic_list.add(cli2);

        Clinic cli3 = new Clinic();
        cli3.cli_number = 3;
        cli3.cli_Name = "Chest Clinic";
        clinic_list.add(cli3);

        Clinic cli4 = new Clinic();
        cli4.cli_number = 4;
        cli4.cli_Name = "General Surgery Clinic";
        clinic_list.add(cli4);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public void AddNew_Doctor() {
        Scanner sc = new Scanner(System.in);
        int number = doctors_list.size() + 1;

        System.out.println("Please enter doctor name:");
        String name = sc.nextLine();

        System.out.println("Please enter doctor birthday (yyyy-mm-dd):");
        String birthdateStr = sc.nextLine();

        System.out.println("Please enter doctor address:");
        String address = sc.nextLine();

        System.out.println("Please enter department number:");
        int department_number = sc.nextInt();

        System.out.println("Please enter doctor type (1 for fixed, 2 for training, 3 for contracted):");
        int type = sc.nextInt();

        System.out.println("Please enter doctor salary:");
        float salary = sc.nextFloat();

        Doctors doc = new Doctors();
        doc.doctor_ID = number;
        doc.doctor_name = name;
        doc.doctor_birthday = birthdateStr;
        doc.doctor_address = address;
        doc.department_number = department_number;
        doc.doctor_type = type;
        doc.salary = salary;
        // Initialize other fields as necessary

        doctors_list.add(doc);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public void Delete_Doctor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter doctor name:");
        String name = sc.next();
        for (int i = 0; i < doctors_list.size(); i++) {
            if (doctors_list.get(i).doctor_name.equals(name)) {
                doctors_list.remove(i);
                System.out.println("Doctor deleted successfully");
                return;
            }else {
                System.out.println("Doctor not found to delete");
                return;
            }
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public float getFixedDoctorSalary() {
        for (Doctors doctors : doctors_list) {
            if (doctors.doctor_type == 1) {
                return doctors.salary;
            }
        }
        return 0;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public void ChangeDoctorType(String name) {
        for (Doctors doctors : doctors_list) {
            if (doctors.doctor_name.equals(name)) {
                if (doctors.doctor_type == 2) {
                    Date firstDate = doctors.start_date;
                    Date secondDate = new Date();

                    long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
                    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

                    
                    if (diff <= 365 ||diff>365&& diff<=730) {
                        doctors.salary *= 2;
                        doctors.doctor_type = 1;
                    } else if (diff>730){
                        float sal = getFixedDoctorSalary();
                        doctors.salary += (float) (sal * 0.25);
                        doctors.doctor_type = 1;
                    }
                }
            }
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public int numberOfContractedDoctor() {
        int count = 0;
        for (Doctors doctors : doctors_list) {
            if (doctors.doctor_type == 3) {
                count++;
            }
        }
        return count;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public void showAllDoctorsWithinACertainPeriod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first date (YYYY-MM-DD):");
        String first = sc.next();
        Date startdat = parseDate(first);

        System.out.println("Please enter the second date (YYYY-MM-DD):");
        String second = sc.next();
        Date enddat = parseDate(second);

        for (Doctors doctors : doctors_list) {
            Date startdate = doctors.getstart_date();
            Date enddate = doctors.getend_date();
            if ((startdate.after(startdat) || startdate.equals(startdat)) && ((enddate == null) || enddate.before(enddat) || enddate.equals(enddat))) {
                System.out.println(doctors.getdoctor_name());
            }
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    private Date parseDate(String dateString) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            return sdf.parse(dateString);
        } catch (ParseException e) {
            System.err.println("Please enter the date in the format YYYY-MM-DD.");
            return null;
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public void Patient_Recepants() {
        Scanner sc = new Scanner(System.in);
        Patients patient = new Patients();

        System.out.println("Please enter the patient number:");
        int number = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.println("Please enter the patient name:");
        String name = sc.nextLine();

        System.out.println("Please enter the patient address:");
        String address = sc.nextLine();

        System.out.println("Please enter the patient birthday (YYYY-MM-DD):");
        String birthday = sc.nextLine();

        patient.setPatient_ID(number);
        patient.setPatient_name(name);
        patient.setPatient_address(address);
        patient.setPatient_birthday(birthday);

        patients_list.add(patient);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean exit_patient(int ID) {
        for (int i = 0; i < patients_list.size(); i++) {
            if (patients_list.get(i).getPatient_ID() == ID) {
                patients_list.remove(i);
                return true;
            }
        }
        return false;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public void addingATreatmentToAPatientRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the patient number to add a treatment to:");
        int number = sc.nextInt();

        for (Patients patient : patients_list) {
            if (number == patient.getID()) {
                Internal_Treatment internal_treatment = new Internal_Treatment();

                System.out.println("Please enter the department number:");
                int department_number = sc.nextInt();
                internal_treatment.setDepartement_number(department_number);

                System.out.println("Please enter the department name:");
                String department_name = sc.next();
                internal_treatment.setDepartement_name(department_name);

                patient.getInternal_Treatment_list().add(internal_treatment);
                return;
            }
        }
        System.out.println("Patient number is incorrect.");
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public void showPatientsTreatedInPeriod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the start date (YYYY-MM-DD):");
        String startDateStr = sc.next();
        Date startDate = parseDate(startDateStr);

        System.out.println("Please enter the end date (YYYY-MM-DD):");
        String endDateStr = sc.next();
        Date endDate = parseDate(endDateStr);

        if (startDate == null || endDate == null) {
            System.out.println("Invalid date range provided.");
            return;
        }

        for (Patients patient : patients_list) {
            boolean treatedInPeriod = false;
            for (Internal_Treatment treatment : patient.getInternal_Treatment_list()) {
                Date treatmentDate = treatment.getTreatment_date();
                if ((treatmentDate.after(startDate) || treatmentDate.equals(startDate)) && (treatmentDate.before(endDate) || treatmentDate.equals(endDate))) {
                    treatedInPeriod = true;
                    break;
                }
            }
            if (treatedInPeriod) {
                System.out.println("Patient ID: " + patient.getPatient_ID());
                System.out.println("Patient Name: " + patient.getPatient_name());
                System.out.println("Patient Address: " + patient.getPatient_address());
                System.out.println("Patient Birthday: " + patient.getPatient_birthday());
                System.out.println("Treatments in the specified period:");
                for (Internal_Treatment treatment : patient.getInternal_Treatment_list()) {
                    Date treatmentDate = treatment.getTreatment_date();
                    if ((treatmentDate.after(startDate) || treatmentDate.equals(startDate)) && (treatmentDate.before(endDate) || treatmentDate.equals(endDate))) {
                        System.out.println("\tDepartment Number: " + treatment.getDepartement_number());
                        System.out.println("\tDepartment Name: " + treatment.getDepartement_name());
                        System.out.println("\tTreatment Date: " + treatment.getTreatment_date());
                    }
                }
                System.out.println("----------------------------------------------------");
            }
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public void showAllTreatmentsOfPatient(int patientID) {
        for (Patients patient : patients_list) {
            if (patient.getPatient_ID() == patientID) {
                System.out.println("Patient ID: " + patient.getPatient_ID());
                System.out.println("Patient Name: " + patient.getPatient_name());
                System.out.println("Patient Address: " + patient.getPatient_address());
                System.out.println("Patient Birthday: " + patient.getPatient_birthday());
                System.out.println("Treatments:");
                for (Internal_Treatment treatment : patient.getInternal_Treatment_list()) {
                    System.out.println("\tTreatment ID: " + treatment.getID());
                    System.out.println("\tDepartment Number: " + treatment.getSection_number());
                    System.out.println("\tTreatment Date: " + treatment.getTreatment_date());
                    System.out.println("\tCost: " + treatment.getCost());
                    System.out.println("\tIs Exited: " + treatment.isIs_exited());
                    if (treatment.isIs_exited()) {
                        System.out.println("\tExit Date: " + treatment.getExit_Date());
                    }
                    System.out.println("\tMonitoring Doctors: " + treatment.getMonitoring_Doctors());
                    System.out.println("----------------------------------------------------");
                }
                return;
            }
        }
        System.out.println("Patient with ID " + patientID + " not found.");
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public void countPatientsInDepartmentInPeriod(int departmentNumber) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter the start date (yyyy-MM-dd):");
        Date startDate = parseDate(scanner.nextLine());

        System.out.println("Enter the end date (yyyy-MM-dd):");
        Date endDate = parseDate(scanner.nextLine());

        if (startDate == null || endDate == null) {
            System.out.println("Invalid input");
            return;
        }

        for (Patients patient : patients_list) {
            for (Internal_Treatment treatment : patient.getInternal_Treatment_list()) {
                if (treatment.getDepartement_number() == departmentNumber) {
                    Date treatmentDate = treatment.getTreatment_date();
                    if ((treatmentDate.after(startDate) || treatmentDate.equals(startDate)) &&
                            (treatmentDate.before(endDate) || treatmentDate.equals(endDate))) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public boolean dischargePatient(int patientID) {
        for (Patients patient : patients_list) {
            if (patient.getPatient_ID() == patientID) {
                patients_list.remove(patient);
                return true; // Patient discharged successfully
            }
        }
        return false; // Patient not found
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////

}
