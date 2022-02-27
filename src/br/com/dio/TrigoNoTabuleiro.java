package br.com.dio;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TrigoNoTabuleiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o numero de iterações");
        int n = sc.nextInt();
        int gramasGraos = 12;

        /*for ( int i = 0; i < n; i++){
            System.out.println("digite o numero da casa do xadrez");
            int numeroDaCasaTab = sc.nextInt();
            double quantidadeDeGrao = 0D;
            if ( numeroDaCasaTab >= 1 && numeroDaCasaTab  <= 64 ) {
                quantidadeDeGrao = Math.pow(2, numeroDaCasaTab);
            }
            quantidadeDeGrao = (quantidadeDeGrao/12) / 1000;
            NumberFormat fmt = DecimalFormat.getNumberInstance(new Locale("pt","BR"));
            fmt.setRoundingMode(RoundingMode.DOWN);
            fmt.setMaximumFractionDigits(0);
            fmt.setGroupingUsed(false);
            System.out.println( fmt.format(quantidadeDeGrao) + " Kg");
            System.out.println(quantidadeDeGrao + " Kg");
            System.out.println(String.format("%.0f", quantidadeDeGrao) + " Kg");
        }*/
        for(int i=0 ; i<n ; i++) {
            int x = sc.nextInt();
            double totalTrigo = (double) Math.pow(2, x) - 1;
            double totalGramas = totalTrigo/gramasGraos;
            long totalKilos = (long) (totalGramas/ 1000);


            System.out.printf("%d kg\n", totalKilos);   //Complete o código aqui.
        }
        sc.close();
    }
}
