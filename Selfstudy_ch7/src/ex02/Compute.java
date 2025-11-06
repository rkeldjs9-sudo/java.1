package ex02;

public class Compute extends Calculator{
    @Override
    double areaCircle(double r) {
        System.out.println("compute 객체 ara~() 실행");
        return Math.PI* r * r;
    }
}
