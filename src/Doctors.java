import java.util.Date;

public class Doctors {
    int ID;
    int doctor_ID;
    String doctor_name;
    String doctor_birthday;
    String doctor_address;
    int doctor_type; // 1: fixed - 2: training - 3: contracted
    float salary;
    Date start_date;
    Date end_date;
    int department_number;

    public Doctors(){}

    public Doctors(int ID, int doctor_ID, String doctor_name, String doctor_birthday, String doctor_address, int doctor_type, float salary, Date start_date, Date end_date, int department_number) {
        this.ID = ID;
        this.doctor_ID = doctor_ID;
        this.doctor_name = doctor_name;
        this.doctor_birthday = doctor_birthday;
        this.doctor_address = doctor_address;
        this.doctor_type = doctor_type;
        this.salary = salary;
        this.start_date = start_date;
        this.end_date = end_date;
        this.department_number = department_number;
    }

    public int getID() {
        return ID;
    }

    public int getdoctor_ID() {
        return doctor_ID;
    }

    public String getdoctor_name() {
        return doctor_name;
    }

    public String getdoctor_birthday() {
        return doctor_birthday;
    }

    public String getdoctor_address() {
        return doctor_address;
    }

    public int getdoctor_type() {
        return doctor_type;
    }

    public float getsalary() {
        return salary;
    }

    public Date getstart_date() {
        return start_date;
    }

    public Date getend_date() {
        return end_date;
    }

    public int getdeparment_number() {
        return department_number;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setdoctor_ID(int doctor_ID) {
        this.doctor_ID = doctor_ID;
    }

    public void setdoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public void setdoctor_birthday(String doctor_birthday) {
        this.doctor_birthday = doctor_birthday;
    }

    public void setdoctor_address(String doctor_address) {
        this.doctor_address = doctor_address;
    }

    public void setdoctor_type(int doctor_type) {
        this.doctor_type = doctor_type;
    }

    public void setsalary(float salary) {
        this.salary = salary;
    }

    public void setstart_date(Date start_date) {
        this.start_date = start_date;
    }

    public void setend_date(Date end_date) {
        this.end_date = end_date;
    }

    public void setdepartment_number(int department_number) {
        this.department_number = department_number;
    }
}
