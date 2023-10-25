public class Teacher {
        String name;
        String lastName;
        String telNo;
        String branch;
        Teacher(String name, String lastName, String telNo, String branch) {
            this.name = name;
            this.lastName = lastName;
            this.telNo = telNo;
            this.branch = branch;
        }
        void print() {
            System.out.println("The teacher's name and surname: " + this.name + " " + this.lastName);
            System.out.println("Branch: " + this.branch);
            System.out.println("Phone Number: " + this.telNo);
            System.out.println("***********************************************************************");
        }
    }
