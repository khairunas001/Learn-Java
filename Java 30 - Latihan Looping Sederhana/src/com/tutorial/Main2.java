package com.tutorial;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("masukan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("masukan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();

        total= 0;

        for (;nilaiAwal<=nilaiAkhir;nilaiAwal++){
            total += nilaiAwal;
            System.out.printf("total ditambah dengan %d menjadi %d \n", nilaiAwal,total);
        }
    }
}
