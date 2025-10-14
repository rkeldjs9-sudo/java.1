package ch4;

public class ex1_if {
    public static void main(String[] args) {
        int score = 93;

        if (score >= 90) {
            System.out.println("점수가 90보다 크다");
            System.out.println("등급은 A");


        }
        if (score <= 90) {
            System.out.println("점수가 90보다 작다");
            System.out.println("등급은 B");
        }
    }
}