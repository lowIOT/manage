import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student student1 = new DayStudent("田中", 20, 3, "day");
        System.out.println("Student info:");
        student1.showInfo();
        student1.tp();
        student1.eat();
        student1.sleep();
        student1.study();
        System.out.println("----------");

        Student student2 = new Residentstudent("山田", 19, 4, "Resident");
        System.out.println("Student info:");
        student2.showInfo();
        student2.tp();
        student2.eat();
        student2.sleep();
        student2.study();
        System.out.println("----------");

    }
}