package ch5;

public class ex3_mainstring {
    public static void main(String[] args) {
        if(args.length !=2){
            System.out.println("값의 수가 부족");
            System.exit(0);
        }
        String strN1 = args[0];
        String strN2 = args[1];

        int num1=Integer.parseInt(strN1);
        int num2=Integer.parseInt(strN2);

        int result = num1 + num2;
        System.out.println(num1+"+"+num2+"="+result);
    }
}
