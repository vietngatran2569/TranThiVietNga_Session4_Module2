package circle;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAreaCircle(){
        return Math.PI*this.radius*this.radius;
    }

    public String toString() {
        return " circle with radius is: "+getRadius()+ " and color is: "+getColor();
    }
}