public class exam_22_1_16 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Car());
        t1.start();
    }
    
}
class Car implements Runnable{
    int a;
    public void run(){
        System.out.println("func call");
    }

}
