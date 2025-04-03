package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        //MENEBAK ANGKA
        int nilaiBenar = 29;
        int nilaiTebakan;
        boolean statusTebakan;

        //MENGGUNAKAN LOGIKA OR
        System.out.print("MASUKKAN TEBAKAN ANDA : ");
        nilaiTebakan = inputUser.nextInt();
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("NILAI TEBAKAN ANDA : "+ statusTebakan);

        //MENGGUNAKAN LOGIKA AND
        /*
            a | b | c
            0   0   0
            0   1   0
            1   0   0
            1   1   1
         */
        System.out.print("MASUKKAN TEBAKAN ANDA ANTARA 20 DAN 30 : ");
        nilaiTebakan = inputUser.nextInt();
        statusTebakan = (nilaiTebakan > 20) && (nilaiTebakan < 30);
        System.out.println("NILAI TEBAKAN ANDA : "+ statusTebakan);

    }
}