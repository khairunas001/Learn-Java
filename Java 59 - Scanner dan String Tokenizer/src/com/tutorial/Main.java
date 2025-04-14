package com.tutorial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException {
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);

        Scanner scanner = new Scanner(bufferedReader);

        // ini untuk cek ada kata selanjutnya atau tidak
        System.out.println(scanner.hasNext()); // true

        // untuk membaca kata, dengan pemisah/delimeter spasi
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());

        System.out.println(scanner.hasNext()); // false

        System.out.println("\n");

        // Menggunakan delimiter tertentu
        FileReader fileinput2 = new FileReader("input2.txt");
        bufferedReader = new BufferedReader(fileinput2);
        bufferedReader.mark(200);

        scanner = new Scanner(bufferedReader);
        scanner.useDelimiter(",");

        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }

        System.out.println("\n");

        // menggunakan String tokenizer
        bufferedReader.reset();
        String data = bufferedReader.readLine();
        System.out.println(data);

        StringTokenizer stringToken = new StringTokenizer(data,",");

        while(stringToken.hasMoreTokens()){
            System.out.println(stringToken.nextToken());
        }

        // baris kedua
        data = bufferedReader.readLine();
        System.out.println(data);

        StringTokenizer stringTokenizer = new StringTokenizer(data,",");
        while(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }

        // baris 3
        data = bufferedReader.readLine();
        System.out.println(data);

        StringTokenizer stringTokenizer2 = new StringTokenizer(data,",");
        for (; stringTokenizer2.hasMoreTokens(); ) {
            System.out.println(stringTokenizer2.nextToken());
        }
//        while(stringTokenizer2.hasMoreTokens()){
//            String token = stringTokenizer2.nextToken();
//            System.out.println(token);
//        }
    }
}