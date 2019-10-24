package shape;

public class Rectangle extends Shape {
    private double width,height;
    public Rectangle(){
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.height*this.width;
    }

    public String toString() {
        return "Ractangle with height "+getHeight()
                +" width: "+getWidth()
                +" area: "+getArea()
                +super.toString();

    }
}
