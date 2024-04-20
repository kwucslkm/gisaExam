public class exam_20_4_18 {
    public static void main(String[] args) {

        int a[] = new int[8];
        int i = 0, n = 10;
        while (i < a.length) {
            a[i++] = n % 2;
            n /= 2;
        }
        for (i = 7; i >= 0; i--) {
            System.out.printf("%d", a[i]);
        }
    }
}
