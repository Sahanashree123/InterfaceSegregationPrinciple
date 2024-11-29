package InterfaceSegregation.FatInterface;
public class AcademicSystem implements StudentServices {
    @Override
    public void updateAttendance(String studentName, int daysPresent) {
        System.out.println("Updated attendance for " + studentName + ": " + daysPresent + " days present.");
    }

    @Override
    public void generateReportCard(String studentName) {
        System.out.println("Generated report card for " + studentName);
    }

    // Irrelevant methods for this class
    @Override
    public void enrollStudent(String studentName, String courseName) {
        throw new UnsupportedOperationException("Not applicable for Academic System");
    }

    @Override
    public void applyForScholarship(String studentName) {
        throw new UnsupportedOperationException("Not applicable for Academic System");
    }

    @Override
    public void manageLibraryAccount(String studentName, String action) {
        throw new UnsupportedOperationException("Not applicable for Academic System");
    }

    @Override
    public void participateInExtracurricular(String studentName, String activityName) {
        throw new UnsupportedOperationException("Not applicable for Academic System");
    }
}