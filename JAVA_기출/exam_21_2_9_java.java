public class exam_21_2_9_java {
    public static void main(String[] args) {
        
        exam_21_2_9_java c1 = new exam_21_2_9_java();
        Class02 c2 = new Class02();
        System.out.println(c1.sum(3,2) + c2.sum(3,2));
    }
    int sum(int x, int y){
        return x+y;
    }
}
class Class02 extends exam_21_2_9_java{
    int sum(int x, int y){
        return x-y + super.sum(x,y);
    }
}

