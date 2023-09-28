public class Book {
    private int indx;
    private String name;
    private String author;
    private int year;

    public int getIndx() {
        return indx;
    }

    public void setIndx(int num) {
        this.indx = indx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book() {
    }

    public Book(int indx, String name, String author, int year) {
        this.indx = indx;
        this.name = name;
        this.author = author;
        this.year = year;
    }
}
