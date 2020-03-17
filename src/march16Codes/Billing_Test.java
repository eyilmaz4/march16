package march16Codes;

public class Billing_Test {
    public static void main(String[] args) {

        Billing myBill= new Billing(123,23,"Esra Yilmaz",300.5 );
        System.out.println(myBill.MemberID);
        myBill.DisplayMemberInfo();
        myBill.DisplayBill();
        System.out.println(myBill.toString());
        myBill.addConsumption(100);
        myBill.readCounter();
        System.out.println(myBill.toString());
    }
}
