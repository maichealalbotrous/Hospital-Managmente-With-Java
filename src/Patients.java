import java.util.List;

public class Patients {
    private int ID;
    private int patient_ID;
    private String patient_name;
    private String patient_address;
    private String patient_birthday;
    private List<Internal_Treatment> internal_Treatment_list;

    public Patients() {}

    public Patients(int ID, int patient_ID, String patient_name, String patient_address, String patient_birthday, List<Internal_Treatment> internal_Treatment_list) {
        this.ID = ID;
        this.patient_ID = patient_ID;
        this.patient_name = patient_name;
        this.patient_address = patient_address;
        this.patient_birthday = patient_birthday;
        this.internal_Treatment_list = internal_Treatment_list;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPatient_ID() {
        return patient_ID;
    }

    public void setPatient_ID(int patient_ID) {
        this.patient_ID = patient_ID;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getPatient_address() {
        return patient_address;
    }

    public void setPatient_address(String patient_address) {
        this.patient_address = patient_address;
    }

    public String getPatient_birthday() {
        return patient_birthday;
    }

    public void setPatient_birthday(String patient_birthday) {
        this.patient_birthday = patient_birthday;
    }

    public List<Internal_Treatment> getInternal_Treatment_list() {
        return internal_Treatment_list;
    }

    public void setInternal_Treatment_list(List<Internal_Treatment> internal_Treatment_list) {
        this.internal_Treatment_list = internal_Treatment_list;
    }
}
