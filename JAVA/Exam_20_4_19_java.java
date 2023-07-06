public class Exam_20_4_19_java {
    public static void main(String[] args) {
        Parent obj = new Child();
        System.out.print(obj.com(4));
    }
}

class Parent {
    int com(int num) {
        if (num <= 1)
            return num;
        return com(num - 1) + com(num - 2);
    }
}

class Child extends Parent {
    int com(int num) {
        if (num <= 1)
            return num;
        return com(num - 1) + com(num - 3);
    }
}
