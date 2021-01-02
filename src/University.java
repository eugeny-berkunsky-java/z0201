public class University {
    private String name;
    private Faculty[] faculties = new Faculty[100];
    private int facultyCount = 0;
    private Student[] students = new Student[10000];
    private int studentCount = 0;

    public University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Faculty[] getFaculties() {
        return faculties;
    }

    public Student[] getStudents() {
        return students;
    }

    public void printFaculties() {
        for (int i = 0; i < facultyCount; i++) {
            System.out.println(faculties[i]);
        }
    }

    public void addFaculty(Faculty f) {
        faculties[facultyCount] = f;
        facultyCount++;
    }

    public void addStudent(Student s, Faculty f) {
        s.setFaculty(f);
        students[studentCount] = s;
        studentCount++;
    }

    public void printAllStudents() {
        System.out.println("---- All students ----");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }
    }

}
