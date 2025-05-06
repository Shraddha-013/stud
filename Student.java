public class Student {
    String name;
    int age;
    String dob;
    Student(String name, int age, String dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }
    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Date of Birth: " + dob);
    }
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 20, "01/01/2003");
        student1.displayStudent();
        
        Student student2 = new Student("Jane Smith", 22, "02/02/2001");
        student2.displayStudent();
    }
}
