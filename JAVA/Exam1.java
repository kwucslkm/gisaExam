public class Exam1 {
    public static void main(String[] args) {
        Parent pa = new Child();
        pa.show();
    }
}
class Parent{
    void show(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("Child");
    
    }
}