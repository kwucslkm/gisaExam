class SuperObject{
    public void draw(){
        System.out.println("A");
        draw();
    }
    public void paint(){
        System.out.print('B');
        draw();
    }
}
class SubObject extends SuperObject{
    public void paint(){
        super.paint();
        System.out.print('C');
        draw();
    }
    public void draw(){
        System.out.print('D');
    }
}
public class exam_23_3_1{
    public static void main(String[] args){
        SuperObject a= new SubObject();
        a.paint();
        a.draw();
    }
}