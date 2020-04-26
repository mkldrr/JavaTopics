package school_management;

public class Teachers {

    private int id;
    private String name;
    private  int salary;
    private int salaryEarned;


    public Teachers(int id, String name, int salary){

        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receiveSalary(int salary){


        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);


    }


    @Override
    public String toString() {
        return "Name of the Teacher is: " + this.name + "\nSalary earned so far is: " +this.salaryEarned ;
    }
}
