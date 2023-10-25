public class Student {
    Lesson physical;
    Lesson maths;
    Lesson biology;
    String name;
    String lastName;
    String stuNo;
    String classes;
    double physicalAverage;
    double mathsAverage;
    double biologyAverage;
    double average;


    Student(String name, String lastName, String stuNo, String classes, Lesson physical, Lesson maths, Lesson biology) {
        this.name = name;
        this.lastName = lastName;
        this.stuNo = stuNo;
        this.classes = classes;
        this.physical = physical;
        this.maths = maths;
        this.biology = biology;
        double average = 0.0;
        boolean isPass = false;
    }
    void physicalExam(int exam1, int exam2) {
        if (exam1 >= 0 && exam1 <= 100) {
            this.physical.exam1 = exam1;
            if (exam2 >= 0 && exam2 <= 100) {
                this.physical.exam2 = exam2;
                physicalAverage = (this.physical.exam1 * 0.20) + (this.physical.exam2 * 0.80);
            }else {
                System.out.println("You entered the wrong note!!!");
            }
        }else {
            System.out.println("You entered the wrong note!!!");
        }
    }
    void mathsExam(int exam1, int exam2) {
        if (exam1 >= 0 && exam1 <= 100) {
            this.maths.exam1 = exam1;
            if (exam2 >= 0 && exam2 <= 100) {
                this.maths.exam2 = exam2;
                mathsAverage = (this.maths.exam1 * 0.20) + (this.maths.exam2 * 0.80);
            }else {
                System.out.println("You entered the wrong note!!!");
            }
        }else {
            System.out.println("You entered the wrong note!!!");
        }
    }
    void biologyExam(int exam1, int exam2) {
        if (exam1 >= 0 && exam1 <= 100) {
            this.biology.exam1 = exam1;
            if (exam2 >= 0 && exam2 <= 100) {
                this.biology.exam2 = exam2;
                biologyAverage = (this.biology.exam1 * 0.20) + (this.biology.exam2 * 0.80);
            }else {
                System.out.println("You entered the wrong note!!!");
            }
        }else {
            System.out.println("You entered the wrong note!!!");
        }
    }
    void isPass() {
        average = (physicalAverage + mathsAverage + biologyAverage) / 3;
        if(average >= 60) {
            System.out.println("Student's name and surname: " + name +" "+ lastName);
            System.out.println("School ID: " + stuNo);
            System.out.println("Congratulations, you passed the class");
            System.out.println("Main average: " + average);
            System.out.println("The physical average: " + physicalAverage);
            System.out.println("The maths average: " + mathsAverage);
            System.out.println("The biology average: " + biologyAverage);
            System.out.println("***********************************************************************");
        }else {
            System.out.println("Student's name and surname: " + name +" "+ lastName);
            System.out.println("School ID: " + stuNo);
            System.out.println("You failed the class!!!");
            System.out.println("Main average: " + average);
            System.out.println("The physical average: " + physicalAverage);
            System.out.println("The maths average: " + mathsAverage);
            System.out.println("The biology average: " + biologyAverage);
            System.out.println("***********************************************************************");
        }
    }
}
