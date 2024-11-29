package InterfaceSegregation.FatInterface;
public interface StudentServices {
    void enrollStudent(String studentName,String courseName);
    void updateAttendance(String studentName,int daysPresent);
    void generateReportCard(String studentName);
    void applyForScholarship(String studentName);
    void manageLibraryAccount(String studentName,String action);
    void participateInExtracurricular(String studentName,String activityName);
}