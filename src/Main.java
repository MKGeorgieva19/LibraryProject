import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Neshto", "Nqkoi", 2005);
        Book book1 = new Book("Nishto", "Nikoi", 1995);

        Client client = new Client("Ivaylo", "Radev", "IMRadev19@codingburgas.bg", 18,"Nqkoi",0);
        Client client1 = new Client("Vanina", "Teneva","VNTeneva19@codingburgas.bg", 17, "Nikoi", 8);

        Scanner scanner = new Scanner(System.in);

        int n = 0;
        do {
            System.out.println("1. Log In");
            System.out.println("2. Exit");
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
            System.out.println("1. Add book");
            System.out.println("2. Delete book");
            System.out.println("3. Register client");
            System.out.println("4. Add that a book is not available");
            System.out.println("5. Check the date the book is taken and the return date");
            System.out.println("6. Look all books");
            System.out.println("7. Exit from action menu");
            n = scanner1.nextInt();
            switch (n){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
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
        List<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String str;
        int year;
        System.out.print("Name of the book: ");
        str = scanner.nextLine();
        book.setName(str);
        System.out.print("Name of the author: ");
        str = scanner.nextLine();
        book.setAuthor(str);
        System.out.print("Year the book is created: ");
        year = scanner.nextInt();
        book.setYear(year);
        for (Book b:books) {
            System.out.println("Book name: " + b.getName() + " Book author: " + b.getAuthor() + "Year: " + b.getYear());
        }
    }

    public static void logIn() {
        Librarian librarian = new Librarian("Miriam", "Georgieva", "12345", "MKGeorgieva19@codingburgas.bg", 18);
        Librarian librarian1 = new Librarian("Marieta", "Stoycheva", "123456L", "MPStoycheva19@codingburgas.bg", 18);

        List<Librarian> librarianList = new ArrayList<>();
        librarianList.add(librarian);
        librarianList.add(librarian1);

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