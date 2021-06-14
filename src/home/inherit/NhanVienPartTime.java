package home.inherit;

public class NhanVienPartTime extends NhanVien {
    private int workingHours;

    public NhanVienPartTime() {
    }

    public NhanVienPartTime(int workingHours) {
        this.workingHours = workingHours;
    }

    public NhanVienPartTime(int ID, String fullName, int age, String phoneNumber, String email, int workingHours) {
        super(ID, fullName, age, phoneNumber, email);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return super.toString() + " Part-time: " + this.getNetWage();
    }

    public double getNetWage() {
        return this.getWorkingHours() * 100000;
    }
}
