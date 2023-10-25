public class Lesson {
    Teacher teacher;
    String name;
    String code;
    int exam1;
    int exam2;

    Lesson (String name, String code) {
        this.name = name;
        this.code = code;
        int exam1 = 0;
        int exam2 = 0;
    }
    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.name)) {
            this.teacher = teacher;
        }else {
            System.out.println("The teacher and lesson sections do not match!!!");
        }
    }
    void printTeacherInfo() {
        this.teacher.print();
    }
}
