public class MathTest {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc(); // правильно
        // MathCalculable mc2 = new MathCalculable(); // ошибка - нельзя создать объект интерфейса

        System.out.println("2 в степени 10 = " + mc1.pow(2, 10));
        System.out.println("Модуль числа 3 + 4i = " + mc1.complexModulus(3, 4));

        MathFunc mf = new MathFunc();
        System.out.println("Длина окружности радиуса 5 = " + mf.circleLength(5));
        System.out.println("PI из интерфейса = " + MathCalculable.PI);
    }
}
