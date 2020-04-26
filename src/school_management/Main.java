package school_management;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        Teachers michael = new Teachers(1,"Michael",5000);
        Teachers jackie = new Teachers(2,"Jackie",7000);
        Teachers leslie = new Teachers(3,"Leslie",4000);

        List<Teachers> teacherList = new ArrayList<>();
        teacherList.add(michael);
        teacherList.add(jackie);
        teacherList.add(leslie);


        Students natasha = new Students(1,"Natasha",12);
        Students melisa = new Students(2,"Melisa",10);
        Students eric = new Students(3,"Eric",9);
        List<Students> studentList= new ArrayList<>();
        studentList.add(natasha);
        studentList.add(melisa);
        studentList.add(eric);



        School mshs = new School(teacherList,studentList);
        Teachers megan =  new Teachers(6,"Megan",1000);
        mshs.addTeachers(megan);

        natasha.payFees(10000);
        melisa.payFees(3000);
        eric.payFees(4000);


        System.out.println("MCHS has earned  $"+mshs.getTotalMoneyEarned());


        System.out.println("-----------------------------------------------------");

        michael.receiveSalary(michael.getSalary());
        jackie.receiveSalary(jackie.getSalary());
        leslie.receiveSalary(leslie.getSalary());


        System.out.println("MCHS has spent for salary to " + michael.getName() + " and " + jackie.getName()+ " and now has  $" + mshs.getTotalMoneyEarned());


        System.out.println("-----------------------------------------------------");
        System.out.println(natasha);

        System.out.println("-----------------------------------------------------");

        System.out.println(michael);

        System.out.println("MCHS has earned  $"+mshs.getTotalMoneyEarned());










    }
}
