package sec01.exam1;

public class maiclass {
    public static void main(String[] args) {
        student st1 = new student();
        st1.sayHello(); 

        car c = new car("hyundai",200);
        c.setMaxSpeed(100);  
        c.showInfo(); 
        
        calcul cal= new calcul();
        int val = cal.add(1, 3);
        System.out.println("value" + val);
    }
}
