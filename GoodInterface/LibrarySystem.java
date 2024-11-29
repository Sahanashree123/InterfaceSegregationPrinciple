package InterfaceSegregation.GoodInterface;
public class LibrarySystem implements Library {
    @Override
    public void manageLibraryAccount(int studentId) {
        System.out.println("Managing library account for student " + studentId);
    }
}