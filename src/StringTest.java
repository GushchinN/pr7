import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = sc.nextLine();

        ProcessStrings ps = new ProcessStrings();
        System.out.println("Количество символов: " + ps.countChars(s));
        System.out.println("Символы на нечетных позициях: " + ps.oddChars(s));
        System.out.println("Перевернутая строка: " + ps.invert(s));
    }
}
