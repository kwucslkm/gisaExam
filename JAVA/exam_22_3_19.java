public class exam_22_3_19 {
    public static void main(String[] args) {
        int max =0;
        for(int i=1 ; i<999 ; i++){
            if(i%3==0 && i%2!=0)
                max = i;
        }
        System.out.println(max);
    }
}
