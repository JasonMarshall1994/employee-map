import java.text.NumberFormat;

public class Employee {

    private byte number;
    private String name;
    private double salary;

    public Employee(){
        this.number = 0;
        this.name = "";
        this.salary = 0f;
    }

    public Employee(byte number, String name, double salary) throws Exception{
        setNumber(number);
        setName(name);
        setSalary(salary);
    }

    public byte getNumber() {
        return number;
    }

    public void setNumber(byte num) throws Exception {
        if (number == 0) {
            if (num < 1 || num > 50) {
                throw new Exception("An employee number must be between 0 and 50.\n");
            } else {
                this.number = num;
            }
        }else{
            throw new Exception("An employee number cannot be changed after it has been set.\n");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception{
        if(name.trim().isEmpty()){
            throw new Exception("An employee name can not be blank or all spaces.\n");
        }else {
            this.name = name;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws Exception{
        if(salary > 0 && salary < 200000){
            this.salary = salary;
        }else{
            throw new Exception("An employee salary must be between 0 and $200,000.\n");
        }
    }

    @Override
    public String toString() {
        NumberFormat f = NumberFormat.getCurrencyInstance();
        return ("Number: " + number + "  Name: " + name + "  Salary: " + f.format(salary));
    }
}
