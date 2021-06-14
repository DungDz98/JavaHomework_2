package home.inherit;

class NhanVienFullTime extends NhanVien{
    private double bonusMoney;
    private double penaltyMoney;
    private double salary;

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(double bonusMoney, double penaltyMoney, double salary) {
        this.bonusMoney = bonusMoney;
        this.penaltyMoney = penaltyMoney;
        this.salary = salary;
    }

    public NhanVienFullTime(int ID, String fullName, int age, String phoneNumber, String email, double bonusMoney, double penaltyMoney, double salary) {
        super(ID, fullName, age, phoneNumber, email);
        this.bonusMoney = bonusMoney;
        this.penaltyMoney = penaltyMoney;
        this.salary = salary;
    }

    public double getBonusMoney() {
        return bonusMoney;
    }

    public void setBonusMoney(double bonusMoney) {
        this.bonusMoney = bonusMoney;
    }

    public double getPenaltyMoney() {
        return penaltyMoney;
    }

    public void setPenaltyMoney(double penaltyMoney) {
        this.penaltyMoney = penaltyMoney;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " Full-time: " + this.getNetWage();
    }

    public double getNetWage() {
        return this.getSalary() + (this.getBonusMoney() - this.penaltyMoney);
    }

}
