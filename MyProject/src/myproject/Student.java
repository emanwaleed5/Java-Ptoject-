package myproject;
public class Student {
    private int studentId;
    private String studentName ;
    private String studentPassword ;
    private int studentMobile;
    private String studentEmail;
    private Course[] courses;
    public Student(int studentId, String studentName, String studentPassword, int studentMobile, String studentEmail, Course[] courses) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentPassword = studentPassword;
        this.studentMobile = studentMobile;
        this.studentEmail = studentEmail;
        this.courses = courses;
    }
    public Student(int studentId,String studentPassword, Course[] courses) {
        this.studentId = studentId;
        this.courses = courses;
        this.studentPassword = studentPassword;

    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentPassword() {
        return studentPassword;
    }
    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }
    public int getStudentMobile() {
        return studentMobile;
    }
    public void setStudentMobile(int studentMobile) {
        this.studentMobile = studentMobile;
    }
    public String getStudentEmail() {
        return studentEmail;
    }
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
    public Course[] getCourses() {
        return courses;
    }
    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName=" + studentName + ", studentPassword=" + studentPassword + ", studentMobile=" + studentMobile + ", studentEmail=" + studentEmail + ", courses=" + courses + '}';
    }
}
