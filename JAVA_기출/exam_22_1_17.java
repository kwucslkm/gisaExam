class A {
    int a;
    int b;
}
public class exam_22_1_17 {
    public static void main(String[] args) {
        A a = new A();
        a.a = 100;
        func1(a);
        a.b = a.a;
        func2(a);
        System.out.println(a.a);
    }
    static void func1(A a) {
        a.a *= 10;
    }
    static void func2(A a) {
        a.a += a.b;
    }
}
