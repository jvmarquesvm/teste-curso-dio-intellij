package br.com.dio;

import java.util.Scanner;

public class Dama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2;
        //se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
        //se estiver em qualquer outra posição, a rainha gastará 2 movimentos!

        while(true) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();

            int linha = 0;
            int coluna = 0;
            boolean umCasa = false;
            boolean duasCasas = false;
            boolean nenhumaCasa = false;

            if( x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0 ){
                break;
            }

            //diagonal superior esquerda
            linha = x1;
            coluna = y1;
            while (linha >= 1 || coluna >= 1) {
                linha--;
                coluna--;
                if (linha == x2 && coluna == y2) {
                    umCasa = true;
                    break;
                }
            }

            //diagonal superior direita
            linha = x1;
            coluna = y1;

            while (linha >= 1 || coluna <= 8) {
                linha--;
                coluna++;
                if (linha == x2 && coluna == y2) {
                    umCasa = true;
                    break;
                }
            }

            //diagonal inferior esquerda
            linha = x1;
            coluna = y1;

            while (linha <= 8 || coluna >= 1) {
                linha++;
                coluna--;
                if (linha == x2 && coluna == y2) {
                    umCasa = true;
                    break;
                }
            }

            //diagonal inferior direita
            linha = x1;
            coluna = y1;

            while (linha <= 8 || coluna <= 8) {
                linha++;
                coluna++;
                if (linha == x2 && coluna == y2) {
                    umCasa = true;
                    break;
                }
            }

            if (x1 == x2 || y1 == y2) {
                umCasa = true;
            }

            if (x1 == x2 && y1 == y2) {
                nenhumaCasa = true;
            }

            if (nenhumaCasa) {
                System.out.println("0");
            }

            if (umCasa && !nenhumaCasa) {
                System.out.println("1");
            }

            if (!nenhumaCasa && !umCasa) {
                System.out.println("2");
            }
        }
        sc.close();
    }
}
