public class Circle implements Shape{
    public Circle(){
        System.out.println("This is Circle");
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
