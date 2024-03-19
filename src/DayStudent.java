public class DayStudent extends Student {

    protected static String type = "Day";

    public DayStudent(String name, int age, int kumi, String location) {
        super(name, age, kumi,location);
    }


    @Override
    public void tp() {
        System.out.println("type: " + location +" student");
    }
    @Override
    public void eat() {
        // TODO

        System.out.println(name + " eat at home");
    }

    @Override
    public void sleep() {
        System.out.println(name + " bed at home");
    }

    @Override
    public void study() {
        System.out.println(name + " study at class" + kumi);
    }
}
