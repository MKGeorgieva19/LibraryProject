import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Book> bookList = new ArrayList<>();
    static List<Librarian> librarianList = new ArrayList<>();
    static List<Client> clientList = new ArrayList<>();

    public static void main(String[] args) {
        Librarian librarian = new Librarian("Miriam", "Georgieva", "12345", "MKGeorgieva19@codingburgas.bg", 18);
        Librarian librarian1 = new Librarian("Marieta", "Stoycheva", "123456L", "MPStoycheva19@codingburgas.bg", 18);

        librarianList.add(librarian);
        librarianList.add(librarian1);


        Book book = new Book("Neshto", "Nqkoi", 2005);
        Book book1 = new Book("Nishto", "Nikoi", 1995);

        bookList.add(book);
        bookList.add(book1);

        Client client = new Client("Ivaylo", "Radev", "IMRadev19@codingburgas.bg", 18,"Nqkoi",0);
        Client client1 = new Client("Vanina", "Teneva","VNTeneva19@codingburgas.bg", 17, "Nikoi", 8);

        clientList.add(client);
        clientList.add(client1);

        Scanner scanner = new Scanner(System.in);

        int n = 0;
        do {
            System.out.println();
            System.out.println("1. Log In");
            System.out.println("2. Exit");
            System.out.println();
            System.out.print("Your choice: ");
            n = scanner.nextInt();
            switch (n){
                case 1:
                    logIn();
                    break;
                    default: break;
            }
        } while (n != 2);


    }

    public static void actionMenu(){
        System.out.println("-------------");
        System.out.println("|ACTION MENU|");
        System.out.println("-------------");

        Scanner scanner1 = new Scanner(System.in);

        int n = 0;
        do {
            System.out.println();
            System.out.println("1. Add book");
            System.out.println("2. Delete book");
            System.out.println("3. Register client");
            System.out.println("4. Add that a book is not available");
            System.out.println("5. Check the date the book is taken and the return date");
            System.out.println("6. Look all books");
            System.out.println("7. Exit from action menu");
            System.out.println();
            System.out.print("Your choice: ");
            n = scanner1.nextInt();
            switch (n){
                case 1:
                    insertBook();
                    break;
                case 2:
                    deleteBookByIndex();
                    break;
                case 3:
                    addNewClient();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default: break;
            }
        } while (n != 7);
    }

    public static void insertBook(){
        Book book = new Book();
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        for (Book b: bookList) {
            System.out.println("Book name: " + b.getName() + ", Book author: " + b.getAuthor() + ", Year: " + b.getYear());
        }
        System.out.println();

        System.out.print("Name of the book: ");
        String str1 = scanner.nextLine();
        book.setName(str1);

        System.out.print("Name of the author: ");
        String str = scanner.nextLine();
        book.setAuthor(str);

        System.out.print("Year the book is created: ");
        int intg1 = scanner.nextInt();
        book.setYear(intg1);

        bookList.add(book);

        System.out.println();
        for (Book b: bookList) {
            System.out.println("Book name: " + b.getName() + ", Book author: " + b.getAuthor() + ", Year: " + b.getYear());
        }
    }

    public static void deleteBookByIndex(){
        Scanner scanner = new Scanner(System.in);
        int indx = 0;
        System.out.println("Delete the book by index");
        System.out.println();
        for (Book b: bookList) {
            System.out.println("Book index:" + indx + " Book name: " + b.getName() + ", Book author: " + b.getAuthor() + ", Year: " + b.getYear());
            indx++;
        }
        indx = 0;
        System.out.println();
        System.out.print("Index: ");
        int ind = scanner.nextInt();
        bookList.remove(ind);
        for (Book b: bookList) {
            System.out.println("Book index: " + indx + ", Book name: " + b.getName() + ", Book author: " + b.getAuthor() + ", Year: " + b.getYear());
            indx++;
        }
        System.out.println();
    }

    public static void addNewClient(){

    }
    public static void logIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        ;
        for (Librarian l : librarianList) {
            if (email.equals(l.getWorkEmail()) && password.equals(l.getPassword())) {
                actionMenu();
            }
        }
        System.out.println("Something went wrong, try again!");
    }


}