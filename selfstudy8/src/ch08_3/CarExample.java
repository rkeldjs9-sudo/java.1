package ch08_3;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        myCar.FLTire = new KumhoTire();
        myCar.FRTire = new KumhoTire();

        myCar.run();
    }
}
