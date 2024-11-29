package InterfaceSegregation.GoodInterface;

public class AcademicDepartment implements Attendance, ReportCard, Exam {
    @Override
    public void updateAttendance(int studentId, boolean isPresent) {
        System.out.println("Updating attendance for student " + studentId + ": " + (isPresent ? "Present" : "Absent"));
    }

    @Override
    public void generateReportCard(int studentId) {
        System.out.println("Generating report card for student " + studentId);
    }

    @Override
    public void conductOnlineExam(int studentId) {
        System.out.println("Conducting online exam for student " + studentId);
    }
}