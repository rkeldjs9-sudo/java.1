package sec01.exam1;

public class car {
    String company;
    int maxSpeed;
    int speed;
    int rpm;
    
    public car(String company, int maxSpeed)
    {
    	this.company = company;
    	this.maxSpeed = maxSpeed;
    	
    }
    
    void setMaxSpeed(int value) {
        maxSpeed = value;
    }
    
    void showInfo() {
        System.out.println("company: " + company);
        System.out.println("max speed: " + maxSpeed);
        System.out.println("current speed: " + speed);
        System.out.println("current Rpm: " + rpm);
    }

    void hi() {
        int value = 0;
        System.out.println("value: " + value);
    }
}
