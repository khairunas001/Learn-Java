package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int inputPanjang,inputLebar;

        Scanner userInput = new Scanner(System.in);
        System.out.print("MASUKKAN NILAI PANJANG = ");
        inputPanjang = userInput.nextInt();
        System.out.print("MASUKKAN NILAI LEBAR = ");
        inputLebar = userInput.nextInt();

        // PRINT BOX
        boxDraw(inputPanjang,inputLebar);
        // PRINT KELILING DAN LUAS
        showAroundAndWide(inputPanjang,inputLebar);
    }
    private static void showAroundAndWide(int panjang,int lebar){
        System.out.println("HASIL LUAS = "+ panjang+" * "+lebar+" = " + wide(panjang,lebar));
        System.out.println("HASIL KELILING = "+ "("+panjang + " + "+lebar+")"+" * "+" 2 "+" = "+ around(panjang,lebar));
    }
    private static int around(int panjang, int lebar){
        int keliling = (panjang + lebar)*2;
        return keliling;
    }
    private static int wide(int panjang, int lebar){
        int luas = panjang * lebar;
        return luas;
    }
    private static void boxDraw(int panjang, int lebar){
        for (int i=0; i<lebar; i++){
            for(int j=0; j<panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
}