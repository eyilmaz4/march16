package creating_classes;

public class Encapsulation_Test {
    public static void main(String[] args) {
        Encapsulation myTest= new Encapsulation(10, 59999);
        System.out.println(myTest.getId());
        myTest.setId(40);
        System.out.println(myTest.getId());
    }
}
