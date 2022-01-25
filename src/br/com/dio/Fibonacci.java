package br.com.dio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Calcule  fibonacci de: ");
        int n = sc.nextInt();
        Double fibonnacci1 = Math.pow(((1 + Math.sqrt(5)) / 2), n);
        Double fibonnacci2 = Math.pow(((1 - Math.sqrt(5)) / 2), n);

        Double fibonnacci = (fibonnacci1 - fibonnacci2) / Math.sqrt(5);

        DecimalFormat df = new DecimalFormat("0.0");

        System.out.println(df.format(fibonnacci));
        sc.close();

    }
}
