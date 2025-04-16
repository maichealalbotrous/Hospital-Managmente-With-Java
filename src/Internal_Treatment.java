import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Internal_Treatment {
    int ID;
    int section_number;
    int patient_ID;
    Date Treatment_date;
    int Treatment_number;
    int cost;
    List<Integer> monitoring_Doctors; // the doctors who are responsible for this Treatment
    int external_Treatment_ID;
    boolean is_exited;
    Date exit_Date;
    int departement_number;
    String departement_name;

    public Internal_Treatment() {}

    public Internal_Treatment(int ID, int section_number, int patient_ID, Date Treatment_date, int Treatment_number, int cost, int external_Treatment_ID, boolean is_exited, Date exit_Date, List<Integer> monitoring_Doctors) {
        this.ID = ID;
        this.section_number = section_number;
        this.patient_ID = patient_ID;
        this.Treatment_date = Treatment_date;
        this.Treatment_number = Treatment_number;
        this.cost = cost;
        this.external_Treatment_ID = external_Treatment_ID;
        this.is_exited = is_exited;
        this.exit_Date = exit_Date;
        this.monitoring_Doctors = monitoring_Doctors;
    }

    public int getID() {
        return ID;
    }

    public int getSection_number() {
        return section_number;
    }

    public int getPatient_ID() {
        return patient_ID;
    }

    public Date getTreatment_date() {
        return Treatment_date;
    }

    public int getTreatment_number() {
        return Treatment_number;
    }

    public int getCost() {
        return cost;
    }

    public List<Integer> getMonitoring_Doctors() {
        return monitoring_Doctors;
    }

    public int getExternal_Treatment_ID() {
        return external_Treatment_ID;
    }

    public boolean isExited() {
        return is_exited;
    }

    public Date getExit_Date() {
        return exit_Date;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSection_number(int section_number) {
        this.section_number = section_number;
    }

    public void setPatient_ID(int patient_ID) {
        this.patient_ID = patient_ID;
    }

    public void setTreatment_date(Date Treatment_date) {
        this.Treatment_date = Treatment_date;
    }

    public void setTreatment_number(int Treatment_number) {
        this.Treatment_number = Treatment_number;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setMonitoring_Doctors(List<Integer> monitoring_Doctors) {
        this.monitoring_Doctors = monitoring_Doctors;
    }

    public void setExternal_Treatment_ID(int external_Treatment_ID) {
        this.external_Treatment_ID = external_Treatment_ID;
    }

    public void setExited(boolean is_exited) {
        this.is_exited = is_exited;
    }

    public void setExit_Date(Date exit_Date) {
        this.exit_Date = exit_Date;
    }

    public boolean isIs_exited() {
        return is_exited;
    }

    public void setIs_exited(boolean is_exited) {
        this.is_exited = is_exited;
    }

    public int getDepartement_number() {
        return departement_number;
    }

    public void setDepartement_number(int departement_number) {
        this.departement_number = departement_number;
    }

    public String getDepartement_name() {
        return departement_name;
    }

    public void setDepartement_name(String departement_name) {
        this.departement_name = departement_name;
    }
}
