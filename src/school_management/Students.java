package school_management;

public class Students {




    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    public Students(int id, String name, int grade){
        this.feesPaid=0;
        this.feesTotal=0;
        this.id=id;
        this.name=name;
        this.grade=grade;

    }

    public void payFees(int fees) {
        this.feesPaid +=fees;
        School.updateTotalMoneyEarned(feesPaid);

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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getRemainingFees() {
        return feesPaid;
    }


    public int getFeesTotal() {
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Name of the student is: " +  this.name + "\nTotal fees paid so far: " + feesPaid;
    }
}
