public class Client<C> {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private String lastBook;
    private  int totalNumOfBooks;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastBook() {
        return lastBook;
    }

    public void setLastBook(String lastBook) {
        this.lastBook = lastBook;
    }

    public int getTotalNumOfBooks() {
        return totalNumOfBooks;
    }

    public void setTotalNumOfBooks(int totalNumOfBooks) {
        this.totalNumOfBooks = totalNumOfBooks;
    }

    public Client() {
    }

    public Client(String firstName, String lastName, String email, int age, String lastBook, int totalNumOfBooks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.lastBook = lastBook;
        this.totalNumOfBooks = totalNumOfBooks;
    }
}
