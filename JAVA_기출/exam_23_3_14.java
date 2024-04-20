class P {
    public int calc (int n){
        if(n<=1) return n;
        return calc(n-1) +calc(n-2);
    }
}
class C extends P {
    public int calc(int n){
        if (n<=1) return n;
        return calc(n-1) + calc(n-3);
    }
}
public class exam_23_3_14 {
    public static void main(String[] args){
        P obj = new C();
        System.out.println(obj.calc(7));
    }
}
