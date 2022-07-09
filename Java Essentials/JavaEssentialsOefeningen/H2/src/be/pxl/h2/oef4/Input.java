package be.pxl.h2.oef4;

import java.util.Scanner;

public class Input {
    public static Scanner in = new Scanner(System.in);

    public static Scanner getScanner(){
       return in;
    }

    public static String readLine(){
        var scanner = getScanner();
        return scanner.nextLine();
    }

    public static String readLine(String msg){
        System.out.println(msg);
        return readLine();
    }

    public static int readInt(){
        var scanner = getScanner();
        return scanner.nextInt();
    }

    public static int readInt(String msg){
        System.out.println(msg);
        return readInt();
    }
}
