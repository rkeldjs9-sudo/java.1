package sec04ex1;

import java.io.IOException;
import java.util.Scanner;

public class readtes {
    public static void main(String[] args) {
//        while(true) {
//            try {
//              int code = System.in.read();
//                System.out.println("Code : " + code);
//                if(code == 'q') break;
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        Scanner scan = new Scanner(System.in);
        
        while(true) {
            String code = scan.nextLine();
            System.out.println("Code" + code);
            if(code.equals("q")) break;
        }
    }
}