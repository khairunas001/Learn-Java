package com.tutorial;

public class Main {
    public static void main(String[] args) {
        //loop persegi
        System.out.println("loop persegi");
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        //loop segitiga bawah kiri
        System.out.println("loop segitiga bawah kiri");
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print("* ");
                if (j==i){
                    break;
                }
            }
            System.out.print("\n");
        }


        //loop segitiga atas kiri
        System.out.println("loop segitiga atas kiri");
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print("* ");
                if ((i+j) == 4){
                    break;
                }
            }
            System.out.print("\n");
        }

        //loop wajik sebelah kanan
        System.out.println("loop wajik sebelah kanan");
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print("* ");
                if (i == j ){
                    break;
                }
                if ((i+j) == 8){
                    break;
                }
            }
            System.out.print("\n");
        }
        //loop segitiga kanan bawah
        System.out.println("loop segitiga kanan bawah");
        for(int i=0; i<5; i++){
            for(int j=0; j<4-i; j++){
                System.out.print("  ");
            }
            for (int j=0; j<=i ;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        //loop segitiga kanan atas
        System.out.println("loop segitiga kanan atas");
        for(int i=5; i>=0; i--){
            for (int j = 1; j <=5-i; j++){
                System.out.print("  ");
            }

            for (int j = 1;j<=i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        // Bagian atas
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Bagian bawah
        for (int i = 9 - 1; i >= 1; i--) {
            for (int j = 1; j <= 9 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
