package sec02.ex01;

import java.util.Scanner;

public class Looptest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        
        do {
            System.out.println("=============");
            System.out.println(" play game: 1");
            System.out.println(" quit game: 3");
            System.out.println("=============");
            
            choice = scan.nextInt();
        } while(choice != 1 && choice != 3);
    }
}
