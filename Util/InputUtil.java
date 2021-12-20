package Util;

import java.util.Scanner;

public class InputUtil {
    public static String requireText(String title) {
        Scanner sc = new Scanner(System.in);
        System.out.print(title+": ");
        return sc.next();
    }
    public static int requireNumber(String title){
        Scanner sc = new Scanner(System.in);
        System.out.print(title+": ");
        return sc.nextInt();
    }
}
