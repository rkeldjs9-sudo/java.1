package ex02;

public class CmputerEx {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원 면적:" + calculator.areaCircle(r) );
        System.out.println();

        Compute compute = new Compute();
        System.out.println("원면적: " + compute.areaCircle(r));
    }
}
