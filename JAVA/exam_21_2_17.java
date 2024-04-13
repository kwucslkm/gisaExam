public class exam_21_2_17 {

    public static void main(String[] args) {
        String result = exam_21_2_17.check(1);
        System.out.print(result);

    }
    static String check(int num){
        return num >=0 ? "positive" : "negative";
    }
}