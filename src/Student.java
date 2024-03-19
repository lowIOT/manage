public abstract class Student implements InterFaceStudent {
    public String name;

    public int age;

    public int kumi;

    public String location;

   public Student(String name, int age, int kumi, String location) {
   this.name = name;
   this.age = age;
   this.kumi = kumi;
   this.location = location;
   }

    public void showInfo() {
        System.out.println("name:"+this.name);
        System.out.println("age:"+this.age);
        System.out.println("class:"+this.kumi);
   }
}

