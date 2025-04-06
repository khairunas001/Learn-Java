package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("MASUKKAN NILAI = ");
        int nilai = userInput.nextInt();
        System.out.println("ANDA MEMASUKKAN NILAI = "+ nilai);

        printNumber(nilai);

        int hasilPenjumlahan = sumNumber(nilai);
        System.out.println("HASIL PENJUMLAHAN = " + hasilPenjumlahan);

        int hasilFaktorial = factorialResult(nilai);
        System.out.println("HASIL FAKTORIAL = " + hasilFaktorial);
    }

    private static int factorialResult(int parameter){
        if (parameter == 1){
            return parameter;
        }
        return parameter * factorialResult(parameter-1);
    }
    private static int sumNumber(int parameter){
        if (parameter == 0){
            return parameter;
        }
        return parameter + sumNumber(parameter-1);
    }

    private static void printNumber(int parameter){
        System.out.println("NILAI = " + parameter);
        if(parameter == 0){
            return;
        }
        parameter--;
        printNumber(parameter);

    }
}