public class Student {
    private String name;
    private int grade;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    // Getter for grade
    public int getGrade() {
        return grade;
    }


    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            this.grade = 0; // Invalid grade set to 0
        }
    }

    // Main method
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John Doe");
        student.setGrade(85);

        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());

        student.setGrade(120); // Invalid grade test
        System.out.println("After invalid grade: " + student.getGrade());
    }
}
