package InterfaceSegregation.GoodInterface;
public class Main {
    public static void main(String[] args) {
        AdmissionDepartment admission = new AdmissionDepartment();
        admission.enrollStudent("Sahana");
        admission.applyForScholarship(121,"Merit");

        LibrarySystem library = new LibrarySystem();
        library.manageLibraryAccount(101);

        AcademicDepartment academic = new AcademicDepartment();
        academic.updateAttendance(123,false);
        academic.generateReportCard(123);
    }
}