package com.company;
import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько тебе лет?");
    String sAge = scanner.nextLine();
        System.out.println("Какая температура на улице?");
    String sTem = scanner.nextLine();
    int nAge = Integer.parseInt(sAge);
    int nTem = Integer.parseInt(sTem);

    if (nAge < 0) {
        System.out.println("Введите возраст правильно");
    }
    else if ((nAge > 20 || nAge < 45) || (nTem > -20 || nTem < 30) ) {
        System.out.println("Можно идти гулять");
        System.out.println(generateRandomAge());
    } else if (nAge < 20 || (nTem > 0 || nTem < 28)) {
        System.out.println("Можно идти гулять");
        System.out.println(generateRandomAge());
    } else if (nAge > 45 || (nTem > -10 || nTem < 25)) {
        System.out.println("Можно идти гулять");
        System.out.println(generateRandomAge());
    } else {
        System.out.println("Оставайтесь дома");
    }

    }

    public static int generateRandomAge(){
        int num = (int) Math.random();
        return num;
    }
}
