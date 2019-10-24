package shape;

public class Main {
    public static void main(String[] args) {
        Rectangle rtc=new Rectangle();
        System.out.println(rtc);
        Rectangle rtc1=new Rectangle(3,5);
        System.out.println(rtc1);
        Rectangle rtc2=new Rectangle("blue",true,4,6);
        System.out.println(rtc2);
    }
}
