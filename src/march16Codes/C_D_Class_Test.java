package march16Codes;

public class C_D_Class_Test {
    public static void main(String[] args) {
        C_D_Class myString= new C_D_Class();

        System.out.println(myString.toString());

        System.out.println(myString.cipher());
        myString.showCurrentString();
        System.out.println(myString.decipherText());
C_D_Class myString2=new C_D_Class("java", 1);
        System.out.println(myString2.cipher());

    }
}
