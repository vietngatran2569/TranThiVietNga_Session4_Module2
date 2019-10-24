package circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolumn() {
        return super.getAreaCircle()*this.height;
    }

    //    public String toString() {
//        return "Im cylinder with radius:"+super.getRadius()+" volume is: "+getVolumn();
//    }

    @Override
    public String toString() {
        return super.toString()+" has height "+getHeight()+" with radius:"+super.getRadius()+" volume is: "+getVolumn();
    }
}
