package creating_classes;

public class Encapsulation {
    private int id;
    private double salary;
    public Encapsulation(int id, double salary){
        this.id=id;
        this.salary=salary;
            }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }
}
