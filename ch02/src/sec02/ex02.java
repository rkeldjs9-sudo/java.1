package sec02;

public class ex02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0; 

        if (a > 1) {
            b = a;  
        }

        for (int i = 0; i < 10; i++) {
            int c = a + i;
            c = b + i;
            System.out.println("c = " + c);
        }
    }
}