package school_management;

import java.util.List;

public class School {




    private List<Teachers> teachers;
    private List<Students> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;


     public School(List<Teachers> teachers, List<Students> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    public List<Teachers> getTeachers() {
        return teachers;
    }

    public void addTeachers(Teachers teacher) {

        teachers.add(teacher);

    }

    public List<Students> getStudents() {
        return students;
    }

    public void addStudents(Students student) {
        students.add(student);

    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static  void updateTotalMoneyEarned(
            int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }



    static{

    }
}
