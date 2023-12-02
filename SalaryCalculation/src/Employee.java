public class Employee {
    String nameSurname;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String nameSurname, int salary, int workHours, int hireYear) {
        this.nameSurname = nameSurname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){
        double tax = 0.03;

        if (this.salary > 1000) {
            return this.salary * (tax);

        }else {
            return 0;
        }
    }
    public int bonus(){
        int overtimePay = 30;

        if(this.workHours > 40){
            return (this.workHours - 40) * overtimePay;

        }else {
            return 0;
        }
    }
    public double raiseSalary(){
        int year = 2023;
        if((year - this.hireYear) < 10) {
            return this.salary * (0.05);

        } else if ((year - this.hireYear) > 9 && (year - this.hireYear) < 20) {
            return this.salary * (0.10);

        } else {
            return this.salary * (0.15);
        }
    }
    public double totalSalary(){
        return this.salary + bonus() + raiseSalary() - tax();
    }
    public void toInformation() {
        System.out.println("Name and Surname: " + this.nameSurname);
        System.out.println("Salary: " + this.salary);
        System.out.println("Working Hours: " + this.workHours);
        System.out.println("Hire Year: " + this.hireYear);
        System.out.println("Tax Of The Salary: " + tax());
        System.out.println("Overtime Pay: " + bonus());
        System.out.println("Salary Raise: " + raiseSalary());
        System.out.println("Total Salary: " + totalSalary());
        System.out.println("----------------------------------------");
    }



}
