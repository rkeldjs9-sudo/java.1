package sec01.ex01;

public class switchtest {
    public static void main(String[] args) {
        String va1 = "1";
        
        switch (va1) { 
            case "Mon":
                System.out.println("code 1");
                break;
            case "Tues":
                System.out.println("code 2");
                break;
            case "wednes":
                System.out.println("code 3");
                break;
            default:
                System.out.println("no code");
        }
    }
}   