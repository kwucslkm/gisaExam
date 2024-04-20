class A {
    int a;
    int b;
}
class Test {
    static void func1(A m){
        m.a *=10;
    }
    static void func2(A m){
        m.a += m.b;
    }
    public static char[] check(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'check'");
    }
}

public class exam_22_1_1 {
    public static void main(String[] args) {
        A m = new A();
        
        m.a = 100;
        Test.func1(m);
        m.b = m.a;
        Test.func2(m);
        System.out.printf("%d", m.a);
    }

}
