package InterfaceSegregation.GoodInterface;

public class AdmissionDepartment implements Enrollment, Scholarship {
    @Override
    public void enrollStudent(String studentName) {
        System.out.println("Enrolling student: " + studentName);
    }

    @Override
    public void applyForScholarship(int studentId, String scholarshipType) {
        System.out.println("Scholarship application for student " + studentId + ": " + scholarshipType);
    }
}