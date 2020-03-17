package creating_classes;

public class example_test {
    public static void main(String[] args) {
        example myExample= new example(10, "hello", 50.0);
        myExample.getA();
        myExample.getB();
        myExample.getC();
        System.out.println(myExample.toString());
    }
}
