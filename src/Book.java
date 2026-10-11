public class Book implements Printable {
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {return name;}

    @Override
    public void print() {
        System.out.printf("Книга '%s' (автор %s), %d год%n", name, author, year);
    }

    public static void printBooks(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Book) {
                System.out.println(((Book) p).getName());
            }
        }
    }
}
