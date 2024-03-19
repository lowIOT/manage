import java.util.Scanner; // java.util.Scannerをインポート

public class manage {
    public static void main(String[] args) {
        Scanner jadge = new Scanner(System.in);
        Student[] students = new Student[6]; // Adjust the size based on your requirement
        int flag;

            System.out.println("start: 0, end: 1");
            flag = jadge.nextInt();

            if (flag == 1) {
                System.out.println("end");
                System.exit(0);
            } if (flag == 0) {
                int flag2;
                for (int i = 0; i < students.length; i++) {
                    // Input student information
                    System.out.println("Enter information for Student " + (i + 1) + ":");
                    students[i] = inputStudent();
                    System.out.println("continue: 0, end: 1");
                    flag2 = jadge.nextInt();

                    if (flag2 == 0) {
                        continue;
                    }
                    if (flag2 == 1) {
                        break;
                    }
                }
            }
        // Display the entered information
// Student student : students
        for (Student student : students) {
            System.out.println("-------------------------");
            System.out.println("Student info:");
            System.out.println("Name: " + student.name);
            System.out.println("Age: " + student.age);
            System.out.println("Class: class " + student.className);
            System.out.println("type:" + "student");
            System.out.println(student.name + " eat at " + student.eatplace);
            System.out.println(student.name + " bed at " + student.sleepingplace);
            System.out.println(student.name + ": study at class " + student.className);
            System.out.println("-------------------------");
        }
    }
    private static Student inputStudent() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Class: ");
        String className = scanner.nextLine();

        System.out.print("day or Resident ?: ");
        String where = scanner.nextLine();

        System.out.print("home or canteen ?: ");
        String eatplace = scanner.nextLine();

        System.out.print("home or dormitory ?: ");
        String sleepingplace = scanner.nextLine();

        return new Student(name, age, className, where, eatplace, sleepingplace);
    }

    // Student class definition
    static class Student {
        String name;
        int age;
        String className;

        String where;
        String eatplace;

        String sleepingplace;

        Student(String name, int age, String className,String where, String eatplace, String sleepingplace) {
            this.name = name;
            this.age = age;
            this.className = className;
            this.where = where;
            this.eatplace = eatplace;
            this.sleepingplace = sleepingplace;
        }
    }
}