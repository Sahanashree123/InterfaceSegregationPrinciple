package InterfaceSegregation.FatInterface;
public class AdmissionSystem implements StudentServices {
    @Override
    public void enrollStudent(String studentName, String courseName) {
        System.out.println("Enrolled " + studentName + " in " + courseName);
    }

    @Override
    public void applyForScholarship(String studentName) {
        System.out.println(studentName + " applied for a scholarship.");
    }

    // Irrelevant methods for this class
    @Override
    public void updateAttendance(String studentName, int daysPresent) {
        throw new UnsupportedOperationException("Not applicable for Admission System");
    }

    @Override
    public void generateReportCard(String studentName) {
        throw new UnsupportedOperationException("Not applicable for Admission System");
    }

    @Override
    public void manageLibraryAccount(String studentName, String action) {
        throw new UnsupportedOperationException("Not applicable for Admission System");
    }

    @Override
    public void participateInExtracurricular(String studentName, String activityName) {
        throw new UnsupportedOperationException("Not applicable for Admission System");
    }
}