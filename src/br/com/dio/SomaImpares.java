package br.com.dio;

import java.util.Scanner;

public class SomaImpares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int somatorioImpar = 0;

        if (a < b){
            a = a + 1;
            while ( a < b ) {
                if ( (a % 2) != 0 ){
                    somatorioImpar = somatorioImpar + a;
                }
                a++;
            }
        } else {
            a = a - 1;
            while ( a > b ) {
                if ( (a % 2) != 0 ){
                    somatorioImpar = somatorioImpar + a;
                }
                a--;
            }
        }
        System.out.println(somatorioImpar);
    }
}
