import javax.swing.text.Style;

public class insertionSort{
    public static void main(String[] args) {
        int a[]= {8,5,6,2,4};
        int temp=0;
        for (int i=0 ; i<a.length-1 ; i++){
            for(int j= 0 ; j< i+1 ; j++){
                if (a[j]>a[i+1]){
                    temp=a[j];
                    a[j]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
        for(int i = 0 ; i<a.length ;i++)
        System.out.println(a[i]);
            
        
    }

}