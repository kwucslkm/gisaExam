abstract class Vehicle{
    String name;
    abstract public String getName(String val);
    public String getName(){
        return "Vehicle name: " + name;
    }
}
public class exam_23_1_17 {
    public static void main(String[] args){
        Vehicle obj = new Car("Spark");
        System.out.print(obj.getName());
    }
}
class Car extends Vehicle {
    private String name;
    public Car(String val){
        name = super.name = val;
    }
    public String getName(String val){
        return "Car name: " + val;
    }
    public String getName(byte[] val){
        return "Car name : " + val;
    }
}