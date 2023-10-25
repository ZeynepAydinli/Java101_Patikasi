public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Gregory", "House", "111", "Physical");
        Teacher t2 = new Teacher("James","Wilson","222","Maths");
        Teacher t3 = new Teacher("Lisa", "Cuddy", "333", "Biology");

        Lesson physical = new Lesson("Physical", "phys101");
        Lesson maths = new Lesson("Maths", "mat102");
        Lesson biology = new Lesson("Biology", "bio103");

        physical.addTeacher(t1);
        maths.addTeacher(t2);
        biology.addTeacher(t3);

        Student s1 = new Student("Allison","Cameron","2004001","1",physical, maths, biology);
        Student s2 = new Student("Eric","Foreman","2004002","1",physical, maths, biology);
        Student s3 = new Student("Robert","Chase","2004003","1",physical, maths, biology);
        Student s4 = new Student("Chris","Taub","2007004","1",physical, maths, biology);
        Student s5 = new Student("Lawrence","Kutner","2007005","1",physical, maths, biology);
        Student s6 = new Student("Remy","Hadley","2007011","1",physical, maths, biology);

        s1.physicalExam(80,70);
        s1.mathsExam(95,90);
        s1.biologyExam(100,100);
        s1.isPass();

        s2.physicalExam(70,65);
        s2.mathsExam(80,75);
        s2.biologyExam(90,100);
        s2.isPass();

        s3.physicalExam(50,80);
        s3.mathsExam(70,90);
        s3.biologyExam(90,90);
        s3.isPass();

        s4.physicalExam(30,70);
        s4.mathsExam(50,55);
        s4.biologyExam(50,60);
        s4.isPass();

        s5.physicalExam(80,95);
        s5.mathsExam(100,90);
        s5.biologyExam(100,90);
        s5.isPass();

        s6.physicalExam(80,70);
        s6.mathsExam(78,90);
        s6.biologyExam(88,82);
        s6.isPass();

        physical.printTeacherInfo();
        maths.printTeacherInfo();
        biology.printTeacherInfo();
    }
}
