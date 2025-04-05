package com.tutorial;

public class Main {

    public static void main (String[] args){

        // break, continue, dan return

        int a = 0;

        while(true){
            a++;

            if(a == 10){
                break;
                // ini adalah keyword untuk memaksa keluar dari loop
            } else if(a == 5){
                continue;
                // ini adalah keyword untuk memaksa memulai aksi dari awal
                // bisa digunakan untuk skip karena yang disini akan dilewati dan memulai p[rogram dari awal
            } else if (a == 7){
                return;
                // bisa dikatakan untuk mengakhiri program, dalam java maka
                // akan mengakhiri "public static void main(String[] args)"
            }

            System.out.println("looping ke - " + a);

        }

        System.out.println("akhir dari looping");

    }
}