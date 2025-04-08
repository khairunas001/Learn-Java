package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrayAngka1 = {1,2,3,4,5};

        // merubah array menjadi string
        System.out.println("\nMerubah array menjadi string\n==============");
        printArray(arrayAngka1);

        // mengkopi array
        System.out.println("\nMengkopi array\n==============");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);

        System.out.println("\nmengkopi dengan loop");
        for(int i=0; i < arrayAngka1.length;i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);

        System.out.println("\nmengkopi dengan copyOf");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1,3);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);

        System.out.println("\nmengkopi dengan copyOfRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1,2,5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);

        // fill array
        System.out.println("\nFill array\n==============");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5,5);
        printArray(arrayAngka5);

        // komparasi array
        System.out.println("\nkomparasi array\n==============");
        int[] arrayAngka6 = {1,2,3,4,9};
        int[] arrayAngka7 = {1,2,3,4,5};

        System.out.println("\nmembandingkan antara dua buah array");
        System.out.println(Arrays.equals(arrayAngka6,arrayAngka7));

        if (Arrays.equals(arrayAngka6,arrayAngka7)){
            System.out.println("array ini sama");
        } else {
            System.out.println("array ini beda");
        }

        System.out.println("\nngecek mana array yang lebih besar");
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));

        System.out.println("\nngecek mana index yang berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));

        // sort array
        System.out.println("\nsort array\n==============");
        int[] arrayAngka8 = {1,6,4,5,3,5,2,6};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        // search array
        System.out.println("\nsearch array\n==============");
        int angka = 3;
        int posisi = Arrays.binarySearch(arrayAngka8,angka);
        System.out.println("angka " + angka + " ada di index " + posisi);

        // tugas -> sort kebalik,
        System.out.println("\nTUGAS 1 MEBALIK ARRAY");
        System.out.println("========================");
//        for(int i=0; i<arrayAngka8.length; i++){
//            System.out.println("array index ke - " +i+ " adalah "+ arrayAngka8[i]);
//        }
        for (int i = 0; i < arrayAngka8.length / 2; i++) {
            int temp = arrayAngka8[i];
            arrayAngka8[i] = arrayAngka8[arrayAngka8.length - 1 - i];
            arrayAngka8[arrayAngka8.length - 1 - i] = temp;
        }
        // Menampilkan array yang sudah dibalik
        System.out.println("Isi array setelah dibalik:");
        System.out.println(Arrays.toString(arrayAngka8));

        // operasi tambah antara dua buah array
        System.out.println("\nTUGAS 2 MENAMBAH ARRAY");
        System.out.println("========================");
        int[] arrayAngka9 = new int[arrayAngka6.length];
        for (int i = 0; i < arrayAngka6.length; i++) {
            arrayAngka9[i] = arrayAngka6[i] + arrayAngka6[i];
        }
        System.out.print("Hasil penjumlahan array: \n");
        for (int nilai : arrayAngka9) {
            System.out.print(nilai + " ");
        }

        // mengabungkan dua buah array,
        System.out.println("\n\nTUGAS 3 MENGGABUNG ARRAY");
        System.out.println("========================");
        int[] arrayAngka10 = new int[arrayAngka6.length + arrayAngka7.length];

        // Salin isi arrayAngka6
        for (int i = 0; i < arrayAngka6.length; i++) {
            arrayAngka10[i] = arrayAngka6[i];
        }

        // Salin isi arrayAngka7
        for (int i = 0; i < arrayAngka7.length; i++) {
            arrayAngka10[arrayAngka6.length + i] = arrayAngka7[i];
        }

        // Cetak hasil arrayAngka10
        System.out.println("Isi arrayAngka10 (gabungan): ");
        for (int nilai : arrayAngka10) {
            System.out.print(nilai + " ");
        }

    }

    private static void printArray(int[] dataArray){
        System.out.println("array = " + Arrays.toString(dataArray));
    }

}














