public class javasumEs {
    public static void main(String[] args) {
        int i, sum = 0;
        for (i = 0;i<=5 ; i++){
            sum += i;
            System.out.print(i);
            if(i==5) {
                System.out.print("=");
                System.out.print(sum);
            }
            else {
                System.out.print ("+");
            }
        }
    }
}
