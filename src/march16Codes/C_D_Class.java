package march16Codes;

public class C_D_Class {
    String input;
    int numberToShift;
  public C_D_Class(){
      input="abc";
      numberToShift=2;
  }
    public C_D_Class(String input, int number){
        this.input=input;
        this.numberToShift=number;
    }
    public void showCurrentString(){
        System.out.println(this.input);
    }
    public String cipher(){

     String newWord="";
     char letter=' ';
      for(int i=0; i<this.input.length(); i++){
         letter=this.input.charAt(i);
         letter+=this.numberToShift;
         newWord+=letter;

      }
      this.input=newWord;
      return this.input;
    }
    public String decipherText() {
         String newWord ="";
        char letter = ' ';
        for (int i = 0; i < this.input.length(); i++) {
            letter = this.input.charAt(i);
            letter -= this.numberToShift;
            newWord += letter;
        }
        this.input=newWord;
        return this.input;
    }

    @Override
    public String toString() {
        return "C_D_Class{" +
                "input='" + input + '\'' +
                ", numberToShift=" + numberToShift +
                '}';
    }
}
