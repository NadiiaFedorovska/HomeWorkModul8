public class Triangle implements Shape{

    public Triangle(){
        System.out.println("This is Triangle");
    }


    @Override
    public String nameOfTheFigure() {
        return "Triangle{}";
    }
}
