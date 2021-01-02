public class Main {

    public static void main(String[] args) {
//        Faculty f1 = new Faculty("F1");
//        System.out.println(f1.getName());
//        f1.setDirector("Vasya");
//
//        Faculty f2 = new Faculty("CIT");
//        f2.setDirector("Petya");
//
//        System.out.println(f1);
//        System.out.println(f2);
//
//        Student student1 = new Student("Ivanov", f1);
//        Student student2 = new Student("Petrov", f1);
//        System.out.println(student1);
//        System.out.println(student2);
        University university = new University("QWE");
        Faculty f = new Faculty("CIT");
        f.setDirector("Vasya");
        Faculty f1 = new Faculty("F1");
        f1.setDirector("Petya");

        university.addFaculty(f);
        university.addFaculty(f1);
        university.printFaculties();

        Student s1 = new Student("Ivanov", null);
        university.addStudent(s1, f1);

        university.addStudent(new Student("Petrov", null), f);

        university.printAllStudents();
    }
}
