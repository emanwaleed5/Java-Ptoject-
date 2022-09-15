package myproject;
public class Course {
    private int courseId;
    private String courseName ;
    private double coursemark;
    public Course(String courseName) {
        this.courseName = courseName;
    }
    public Course(int courseId, String courseName, double coursemark) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.coursemark = coursemark;
    }
    public int getCourseId() {
        return courseId;
    }
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public double getCoursemark() {
        if (this.getCoursemark()<0 ){
            return coursemark;
        }
        return 0;
    }
    public void setCoursemark(double coursemark) {
        this.coursemark = coursemark;
    }
    @Override
    public String toString() {
        return "Course{" + "courseId=" + courseId + ", courseName=" + courseName + ", coursemark=" + coursemark + '}';
    }
    

    
}
