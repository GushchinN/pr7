public class ProcessStrings implements StringProcessable {

    @Override
    public int countChars(String s) {
        return s.length();
    }

    // символы на нечетных позициях 1, 3, 5, ... (позиции считаем с единицы)
    @Override
    public String oddChars(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i += 2) {
            result += s.charAt(i);
        }
        return result;
    }

    @Override
    public String invert(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }
}
