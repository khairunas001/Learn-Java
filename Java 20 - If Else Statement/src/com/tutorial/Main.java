package com.tutorial;

import java.util.*;

public class Main {


    public static void main (String[] args){

//        tutorial untuk if statement atau percabangan
        Scanner userInput = new Scanner(System.in);
        int a;
        System.out.print("masukkan nilai anda = ");
        a = userInput.nextInt();

        System.out.println("nilai = " + a);

        // ini adalah cabangnya

        if (a == 10){

            System.out.println("ini adalah jalur true");

        } else {

            System.out.println("ini adalah jalur false");

        }


        System.out.println("selesai");

    }
}