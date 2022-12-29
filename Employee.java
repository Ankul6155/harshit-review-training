/*
 * 
 *  3 data members id, employeename and salary along with abstract method
 * 
 */

 /**
  * Employee
  */
 abstract public class Employee {
    
    private int employeeId;
    private String employeeName;
    private float employeeSalary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public float getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(float employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public Employee(int id, String employeeName,
             float salary) {
        this.employeeId = id;
        this.employeeName = employeeName;
        this.employeeSalary = salary;
    }

    abstract void calculateTax();
 }


 //documentation level-good or bad?