package utils;

import java.util.Scanner;

public class InputUtil {
    public  static  int requiredInt(String title){
        Scanner scanner = new  Scanner(System.in);
        System.out.print(title+" :");
        return  scanner.nextInt();
    }

    public static String requiredString(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title+" :");
        return scanner.nextLine();
    }


}
