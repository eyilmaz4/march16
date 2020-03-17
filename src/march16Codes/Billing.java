package march16Codes;

public class Billing {
    int MemberID;
    int Counter;
    String Name;
    double billAmount;

    public Billing(int memberID, int counter, String name, double billAmount){
this.MemberID=memberID;
this.Counter=counter;
this.Name=name;
this.billAmount=billAmount;
    }
    public void DisplayMemberInfo(){
        System.out.println("MemberID:"+" "+this.MemberID);
        System.out.println("Counter:"+" "+this.Counter);
        System.out.println("Name:"+" "+this.Name);
        System.out.println("Bill Amount:"+" "+this.billAmount);
    }
    public void DisplayBill(){
        this.billAmount=this.Counter*1.9;
        System.out.println(this.billAmount);
        //System.out.println("your Bill:"+" "+this.billAmount);
    }
   public void readCounter(){
       System.out.println(this.Counter);
   }
    public void addConsumption(int consumption){
this.Counter+=consumption;
    }

    @Override
    public String toString() {
        return "Billing :\n " +
                "MemberID=\t" + MemberID +
                ", Counter=\t" + Counter +
                ", Name=\t'" + Name + '\'' +
                ", billAmount=\t" + billAmount +
                '}';
    }
}
