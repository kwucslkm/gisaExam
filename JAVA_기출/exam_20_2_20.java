public class exam_20_2_20 {
    public static void main(String[] args) {
        B obj = new B(10);
        obj.print();
    }
}
class A {
    int a;
    public A(){}
    public A(int n) {
        a = n;
    }
    public void print() {
        System.out.println("Aa=" + a);
    }
}
class B extends A {
        
    public B(int n) {
        super(n);
        super.print();
    }
    public void print() {
        System.out.println("Ba=" + a);
    }
}
