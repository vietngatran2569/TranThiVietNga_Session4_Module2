package moveAblePoint;

public class Main {
    public static void main(String[] args) {
        Point pt=new Point(2,3);
        System.out.println(pt);

        MovablePoint mp=new MovablePoint(2,3,4,5);
        System.out.println(mp);
        System.out.println("-------------");
        System.out.println(mp.move());
    }
}
