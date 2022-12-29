public class Manager extends Employee {

    private String managerLocation;

    
    public String getManagerLocation() {
        return managerLocation;
    }

    public void setManagerLocation(String managerLocation) {
        this.managerLocation = managerLocation;
    }

    private Manager(int employeeId, 
        String employeeName, 
        float employeeSalary, 
        String ManagerLocation) {

            super(employeeId, employeeName, employeeSalary);
            this.managerLocation = ManagerLocation;

    }

    @Override
    void calculateTax() {

        System.out.println(0.3 *  this.getEmployeeSalary());
    }
    
}

//method logic??
