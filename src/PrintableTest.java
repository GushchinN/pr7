public class PrintableTest {
    public static void main(String[] args) {
        Printable[] printable = {
                new Book("Война и мир", "Л. Н. Толстой", 1869),
                new Magazine("Наука и жизнь"),
                new Book("Мастер и Маргарита", "М. А. Булгаков", 1967),
                new Magazine("Вокруг света")
        };

        System.out.println("Всё:");
        for (Printable p : printable) {
            p.print();
        }

        System.out.println("\nТолько журналы:");
        Magazine.printMagazines(printable);

        System.out.println("\nТолько книги:");
        Book.printBooks(printable);
    }
}
