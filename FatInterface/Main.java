package InterfaceSegregation.FatInterface;
public class Main {
    public static void main(String[] args) {
        AdmissionSystem admission = new AdmissionSystem();
        admission.enrollStudent("Sahana", "Data Structures");
        admission.applyForScholarship("Sahana");

        LibrarySystem library = new LibrarySystem();
        library.manageLibraryAccount("Sahana", "issue");

        AcademicSystem academic = new AcademicSystem();
        academic.updateAttendance("Sahana", 20);
        academic.generateReportCard("Sahana");
        try {
            admission.updateAttendance("Sahana",34); // This will throw an exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}