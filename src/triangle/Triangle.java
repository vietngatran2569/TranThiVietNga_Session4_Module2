package triangle;

public class Triangle extends Shape {
    private double sideA,sideB,sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(String color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    public double perimeterOfTriangle(){
        return getSideA()+getSideB()+getSideC();
    }
    public double areaOfTriangle(){
        double s = (getSideA()+getSideB()+getSideC())/2;
        return Math.sqrt(s*(s-getSideA())*(s-getSideB())*(s-getSideC()));
    }

    @Override
    public String toString() {
        return "Side A:"+getSideA()
                +"\n Side B:"+getSideB()
                +"\n Side C:"+getSideC()
                +"\n Perimeter of Triangle:"+perimeterOfTriangle()
                +"\n Area of Triangle:"+areaOfTriangle()
                +"\n"
                +super.toString();
    }
}
