package com.tutorial;
import java.util.*;

public class Main {
    public static void main (String[] args){

        // y = (x + 2) * x

        int y,x;
        Scanner userInput = new Scanner (System.in);
        // coba dengan input user
        System.out.print("MASUKKAN NILAI X = ");
        x = userInput.nextInt();
        y = hitung(x);
        System.out.println("JALANKAN OPERASI PENGHITUNGAN Y = ( "+ x +" + 2 ) * " +x+ " = "+y);

//        x = 5;
//        y = hitung(x);
//
//        System.out.println("x = " + x + ", y = " + y);
//
//        x = 20;
//        y = hitung(x);
//        System.out.println("x = " + x + ", y = " + y);
//
//        x = 40;
//        y = hitung(x);
//        System.out.println("x = " + x + ", y = " + y);

    }

    // bisa menggunakan privat jika hanya menggunakan fungsi didalam tingkat kelas yang sama
    private static int hitung(int input){
        int hasil;
        hasil = (input + 2) * input;
        // hasil = input * input;

        return hasil;
    }
}











