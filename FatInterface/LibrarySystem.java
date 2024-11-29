package InterfaceSegregation.FatInterface;
public class LibrarySystem implements StudentServices {
    @Override
    public void manageLibraryAccount(String studentName, String action) {
        System.out.println("Library account action: " + action + " for " + studentName);
    }

    // Irrelevant methods for this class
    @Override
    public void enrollStudent(String studentName, String courseName) {
        throw new UnsupportedOperationException("Not applicable for Library System");
    }

    @Override
    public void updateAttendance(String studentName, int daysPresent) {
        throw new UnsupportedOperationException("Not applicable for Library System");
    }

    @Override
    public void generateReportCard(String studentName) {
        throw new UnsupportedOperationException("Not applicable for Library System");
    }

    @Override
    public void applyForScholarship(String studentName) {
        throw new UnsupportedOperationException("Not applicable for Library System");
    }

    @Override
    public void participateInExtracurricular(String studentName, String activityName) {
        throw new UnsupportedOperationException("Not applicable for Library System");
    }

}