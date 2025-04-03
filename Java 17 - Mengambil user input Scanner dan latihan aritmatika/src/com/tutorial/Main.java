package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;

        //MENGHITUNG LUAS
        System.out.println("MENGHITUNG LUAS");
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Lebar = ");
        lebar = userInput.nextInt();
        luas = panjang*lebar;
        System.out.println("===HASIL===");
        System.out.printf("Luas = %d \n", luas);

        //MENGHITUNG VOLUME
        System.out.print("Tinggi = ");
        tinggi = userInput.nextInt();
        volume = tinggi*luas;
        System.out.println("===HASIL===");
        System.out.printf("Volume = %d \n", volume);
    }
}