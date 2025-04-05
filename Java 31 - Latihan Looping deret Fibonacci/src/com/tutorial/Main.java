package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int fn,fnMin1,fnMin2,n;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("AMBIL NILAI FIBONACI KE - ");
        n = inputUser.nextInt();

        fnMin2 = 0; // nilai fibonanci yang diminta dikurangi 2
        fnMin1 = 1; // nilai fibonanci yang diminta dikurangi 1
        fn = 1;     // nilai fibonanci yang diminta

        for(int i = 1; i<= n; i++){
            System.out.println("NILAI KE - "+ i + " ADALAH " + fn);
            fn = fnMin1 + fnMin2;
            fnMin2 = fnMin1;
            fnMin1 = fn;
        }
    }
}