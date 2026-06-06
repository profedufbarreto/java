public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Eduardo";
        student.age = 38;
        student.gpa = 8.5;

        System.out.println(student.name + " - GPA: " + student.gpa);

        // PROBLEMA 1: Alguém coloca GPA inválido!
        student.gpa = 50; // ❌ Inválido!
        System.out.println("GPA: " + student.gpa);

        // PROBLEMA 2: Alguém coloca idade negativa!
        student.age = -100; // ❌ Inválido!
        System.out.println("Age: " + student.age);
    }
}