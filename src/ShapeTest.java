public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape ball = new Ball();
        Shape cube = new Cube();
        Shape quad = new Quad();
        Shape triangle = new Triangle();

        System.out.println(circle.nameOfTheFigure());
        System.out.println(ball.nameOfTheFigure());
        System.out.println(cube.nameOfTheFigure());
        System.out.println(quad.nameOfTheFigure());
        System.out.println(triangle.nameOfTheFigure());
    }
}