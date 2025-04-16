import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class App{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Hospital hos = new Hospital();
            int choice;
            do{
                System.out.println("Choose from the following options:");
                System.out.println( " Enter 1  to get: A way to add a doctor’s record to the hospital");
                System.out.println(" Enter 2  to get :  A way to delete a doctor’s record from the hospital");
                System.out.println("Enter 3 to get :A way to install a doctor within the hospital ");
                System.out.println(" Enter 4 to get :  A way to show all the doctors in the hospital during a certain period ");
                System.out.println(" Enter 5 to get :  A way to add a patient record ");
                System.out.println(" Enter 6 to get : A way to add a treatment to a patient’s record ");
                System.out.println(" Enter 7 to get : A way to discharge a patient");
                System.out.println(" Enter 8 to get :   A way to display all patient records in all hospital departments during a specific period ");
                System.out.println(" Enter 9 to get :  A way to show all the treatments that a patient has undergone");
                System.out.println(" Enter 10 to get : A method of counting the number of patients present in a department during a certain period ");
                System.out.println("Enter 11 to get : A way to calculated doctors within in the hospital ");
                System.out.println(" Enter 12 to exit");
                 choice= sc.nextInt();
                switch (choice)
                {
                    case 1: hos.AddNew_Doctor();
                        break;
                    case 2 :
                        hos.Delete_Doctor();
                        break;
                    case 3 :
                        System.out.println("Enter doctor name:");
                        String name = sc.next();
                        hos.ChangeDoctorType( name);
                        break;
                    case 4:
                        hos.showAllDoctorsWithinACertainPeriod();
                        break;
                    case 5:
                        hos.Patient_Recepants();
                        break;
                    case 6:
                        hos.addingATreatmentToAPatientRecord();
                        break;
                    case 7:
                        System.out.println("Enter patient number:");
                        int number = sc.nextInt();
                        hos.dischargePatient(number);
                        break;
                    case 8:
                        hos.showPatientsTreatedInPeriod();
                        break;
                    case 9:
                        System.out.println("Enter patient number:");
                        int number1 = sc.nextInt();
                        hos.showAllTreatmentsOfPatient(number1);
                        break;
                    case 10:
                        System.out.println(" Enter the number of deparetement");
                        int dep = sc.nextInt();
                        hos.countPatientsInDepartmentInPeriod(dep);
                        break;
                    case 11:
                        hos.numberOfContractedDoctor();
                        break;

                    case 12:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");


                }


            }while ( choice!=12);


        }


    }



