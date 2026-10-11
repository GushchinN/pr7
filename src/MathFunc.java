public class MathFunc implements MathCalculable {

    @Override
    public double pow(double a, int n) {
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= a;
        }
        return result;
    }

    // модуль комплексного числа re + im*i
    @Override
    public double complexModulus(double re, double im) {
        return Math.sqrt(re * re + im * im);
    }

    // длина окружности, используем PI из интерфейса
    public double circleLength(double r) {
        return 2 * PI * r;
    }
}
