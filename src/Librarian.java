public class Librarian {
    private String firstName;
    private String lastName;
    private String password;
    private String workEmail;
    private int age;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Librarian() {
    }

    public Librarian(String firstName, String lastName, String password, String workEmail, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.workEmail = workEmail;
        this.age = age;
    }
}
