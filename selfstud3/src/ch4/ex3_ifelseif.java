package ch4;

public class ex3_ifelseif {
    public static void main(String[] args) {
        int score = 75;
        if(score>=90){
        System.out.println("점수 90~100");
            System.out.println("A등급");

    }
        else if(score>=80){
            System.out.println("80~90");
            System.out.println("B");

        }
        else if(score>=70){
            System.out.println("70~80");
            System.out.println("c");

        }
        else if(score<70){
            System.out.println("점수가 70이하");
            System.out.println("D");
        }
}
}
