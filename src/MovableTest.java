public class MovableTest {
    public static void main(String[] args) {
        MovableRectangle r1 = new MovableRectangle(0, 0, 4, 3, 2, 1);
        System.out.println(r1);
        System.out.println("Скорости одинаковые: " + r1.SpeedTest());

        r1.moveRight();
        System.out.println("После moveRight: " + r1);
        r1.moveDown();
        System.out.println("После moveDown: " + r1);
        r1.moveLeft();
        System.out.println("После moveLeft: " + r1);
        r1.moveUp();
        System.out.println("После moveUp: " + r1);

        System.out.println();
        MovableRectangle r2 = new MovableRectangle(new MovablePoint(0, 0, 1, 1), new MovablePoint(5, 5, 3, 1));
        System.out.println(r2);
        System.out.println("Скорости одинаковые: " + r2.SpeedTest());
    }
}
