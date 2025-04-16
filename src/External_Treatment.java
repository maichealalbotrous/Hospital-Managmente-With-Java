import java.util.Date;

public class External_Treatment {
    int ID;
    int clinic_number;
    int Treatment_number;
    int patient_ID;
    int doctor_ID;
    String doctor_name;
    boolean is_accepted;
    Date accepted_date;
    int cost;

    public External_Treatment() {}

    public External_Treatment(int ID, int clinic_number, int Treatment_number, int patient_ID, int doctor_ID, String doctor_name, boolean is_accepted, Date accepted_date, int cost) {
        this.ID = ID;
        this.clinic_number = clinic_number;
        this.Treatment_number = Treatment_number;
        this.patient_ID = patient_ID;
        this.doctor_ID = doctor_ID;
        this.doctor_name = doctor_name;
        this.is_accepted = is_accepted;
        this.accepted_date = accepted_date;
        this.cost = cost;
    }

    public int getID() {
        return ID;
    }

    public int getClinic_number() {
        return clinic_number;
    }

    public int getTreatment_number() {
        return Treatment_number;
    }

    public int getPatient_ID() {
        return patient_ID;
    }

    public int getDoctor_ID() {
        return doctor_ID;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public boolean isAccepted() {
        return is_accepted;
    }

    public Date getAccepted_date() {
        return accepted_date;
    }

    public int getCost() {
        return cost;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setClinic_number(int clinic_number) {
        this.clinic_number = clinic_number;
    }

    public void setTreatment_number(int Treatment_number) {
        this.Treatment_number = Treatment_number;
    }

    public void setPatient_ID(int patient_ID) {
        this.patient_ID = patient_ID;
    }

    public void setDoctor_ID(int doctor_ID) {
        this.doctor_ID = doctor_ID;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public void setAccepted(boolean is_accepted) {
        this.is_accepted = is_accepted;
    }

    public void setAccepted_date(Date accepted_date) {
        this.accepted_date = accepted_date;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
