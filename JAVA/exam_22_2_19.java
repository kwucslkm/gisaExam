public class exam_22_2_19 {
    public static void main(String[] args) {
        Cal obj = new Cal(3);
        obj.a = 5;
        int b = obj.func();
        System.out.println(obj.a+b);
    }
}
class Cal{
    int a;
    Cal(int a){
        this.a=a;
    }
    int func(){
        int b = 1;
        for(int i=1 ; i<a; i++)
            b=a*i+b;
        return a+b;
    } // 6 16 31 51 +5
}
