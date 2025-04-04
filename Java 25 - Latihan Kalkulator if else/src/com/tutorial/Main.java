package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner inputUser;
        float a,b,hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("MASUKKAN NILAI A = ");
        a = inputUser.nextFloat();

        System.out.print("MASUKKAN OPERATOR = ");
        operator = inputUser.next().charAt(0);

        System.out.print("MASUKKAN NILAI B = ");
        b = inputUser.nextFloat();

        if (operator == '+'){
            //PERTAMBAHAN
            hasil = a+b;
            System.out.println("HASIL OPERASI PERTAMBAHAN = " + hasil);
        } else if(operator == '-'){
            //PENGURANGAN
            hasil = a-b;
            System.out.println("HASIL OPERASI = PENGURANGAN " + hasil);
        } else if (operator == '*') {
            //PERKALIAN
            hasil = a*b;
            System.out.println("HASIL OPERASI PERKALIAN = " + hasil);
        } else if (operator == '/') {
            //PEMBAGIAN
            if (b == 0){
                System.out.println("PEMBAGIAN NOL MENGHASILKAN TAK HINGGA");
            } else {
                hasil = a/b;
                System.out.println("HASIL OPERASI PEMBAGIAN = " + hasil);
            }
        } else {
            System.out.println("OPERATOR TIDAK DITEMUKAN!!!!");
        }
    }
}