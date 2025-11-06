package ex04;

public class ChileEx {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;
        parent.method1();
        parent.method2();
        //parent.method3(); 호출 안됨
    }
}
