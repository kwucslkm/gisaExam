public class exam_20_1_20 {
    public static void main(String[] args) {
        int i =3, c= 1;
        switch(i) {
            case 1: c++;
            case 2: c+= 3;
            case 3: c=0;
            case 4: c+= 3;
            case 5: c-= 10;
            default : c--;
        }
        System.out.print(c);
    }
} 
