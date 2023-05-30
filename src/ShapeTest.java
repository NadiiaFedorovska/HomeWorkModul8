public class ShapeTest {

    public void printShapeName(Shape shape) {
        System.out.println(shape.getName());
    }

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape ball = new Ball();
        Shape cube = new Cube();
        Shape quad = new Quad();
        Shape triangle = new Triangle();

        System.out.println("-----------");

        ShapeTest shapeTest = new ShapeTest();
        shapeTest.printShapeName(circle);
        shapeTest.printShapeName(ball);
        shapeTest.printShapeName(cube);
        shapeTest.printShapeName(quad);
        shapeTest.printShapeName(triangle);

    }
}