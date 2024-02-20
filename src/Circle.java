public class Circle {
    private int pi;
    private int radius;

    public Circle() {
    }

    public Circle(int pi, double radius) {
        this.pi = pi;
        this.radius = (int) radius;

    }

    public int getPi() {
        return pi;
    }

    public void setPi(int pi) {
        this.pi = pi;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public static void getArea(int pi, int radius){
        System.out.println("Area: " + pi*(radius*radius));

    }
    public static void getCircumFerence(int pi, int radius){
        System.out.println("Area of CircumFerence: " + pi*2*radius);
    }

}