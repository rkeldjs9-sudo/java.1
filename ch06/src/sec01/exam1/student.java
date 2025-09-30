package sec01.exam1;

public class student {
    int studentNumber;
    String name;
    double middleScore;
    double finalScore;
    double projectScore;

    public void sayHello() {
        System.out.println("hello");
    }

    public void totalScore() {
        double total = middleScore + finalScore + projectScore;
        System.out.println("Total Score: " + total);
    }
}