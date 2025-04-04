package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser;
        float a,b,hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("NILAI A = ");
        a = inputUser.nextFloat();
        System.out.print("OPERATOR = ");
        operator = inputUser.next();
        System.out.print("NILAI B = ");
        b = inputUser.nextFloat();

        switch (operator) {
            case "+":
                hasil = a + b;
                System.out.println("HASIL PERTAMBAHAN = " + hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println("HASIL PENGURANGAN = " + hasil);
                break;
            case "/":
                if (b == 0){
                    System.out.println("HASIL PEMBAGIAN 0 ADALAH TAK HINGGA");
                } else {
                    hasil = a / b;
                    System.out.println("HASIL PEMBAGIAN=  " + hasil);
                }
                break;
            case"*":
                hasil = a * b;
                System.out.println("HASIL PERKALIAN = " + hasil);
                break;
            default:
                System.out.println("OPERATOR" + operator + "TIDAK DITEMUKAN");
        }
    }
}