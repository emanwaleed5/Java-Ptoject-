package myproject;
public class Exam  {
    private int examID;
    private boolean examActive;
    private double examPeriod;
    private double examMark;
    public Exam(int examID, boolean examActive, double examPeriod){
        this.examID = examID;
        this.examActive = examActive;
        this.examPeriod = examPeriod;
    }
    public int getExamID() {
        return examID;
    }
    public void setExamID(int examID)  {
        this.examID = examID;
    }
    public boolean isExamActive() {
        return examActive;
    }
    public void setExamActive(boolean examActive) {
        this.examActive = examActive;
    }
    public double getExamPeriod() {
        return examPeriod;
    }
    public void setExamPeriod(double examPeriod) {
        this.examPeriod = examPeriod;
    }
    @Override
    public String toString() {
        return "Exam{" + "examID=" + examID + ", examActive=" + examActive + ", examPeriod=" + examPeriod + '}';
    }
}
