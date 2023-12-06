public class Circle {
    private String color ;
    private double radius;

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius; // this ?? make access  to data member in class
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea(){
        //return 3.14 * radius * radius;
        return Math.PI * radius * radius ;
    }

    public double getCircumference(){
        return Math.PI * 2 * radius ;
    }

    public String toString(){
        return "Circle{"+"radius="+radius+", color="+color+'}';
    }

}
