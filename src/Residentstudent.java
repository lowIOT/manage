public class Residentstudent extends Student {
    public Residentstudent(String name, int age, int kumi, String location) {
        super(name, age, kumi, location);
    }

    @Override
    public void tp() {
        System.out.println("type: " + location +" student");
    }
    @Override
    public void eat() {
        System.out.println(name + " eat at canteen");
    }

    @Override
    public void sleep() {
        System.out.println(name + " bed at dormitry");
    }

    @Override
    public void study() {
        System.out.println(name + " study at class" + kumi);
    }
}