package myproject;
public class Admin {
    private int adminId;
    private String adminName ;
    private String adminPassword ;
    private String[] courses;
    public Admin(int adminId, String adminName, String adminPassword, String[] courses) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
        this.courses = courses;
    }
    public Admin(int adminId,  String adminPassword){
        this.adminId = adminId;
        this.adminPassword = adminPassword;

    }
    public int getAdminId() {
        return adminId;
    }
    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }
    public String getAdminName() {
        return adminName;
    }
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }
    public String getAdminPassword() {
        return adminPassword;
    }
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
    public String[] getCourses() {
        return courses;
    }
    public void setCourses(String[] courses) {
        this.courses = courses;
    }
    @Override
    public String toString() {
        return "Admin{" + "adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword + ", courses=" + courses + '}';
    }

}
