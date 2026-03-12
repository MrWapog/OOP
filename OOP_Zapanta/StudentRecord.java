public class StudentRecord {
    private String studentName;
    private int studentID;
    private int grade;
    
    public String getStudentName() {
        return studentName;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public int getStudentID() {
        return studentID;
    }
    
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    
    public int getGrade() {
        return grade;
    }
    
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Grade must be between 0 and 100");
        }
    }

    
    public static void main(String[] args) {
        StudentRecord student = new StudentRecord();
        student.setStudentName("Alice");
        student.setStudentID(101);
        student.setGrade(95);

        System.out.println("Name: " + student.getStudentName());
        System.out.println("ID: " + student.getStudentID());
        System.out.println("Grade: " + student.getGrade());
    }
}

