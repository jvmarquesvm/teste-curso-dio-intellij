package br.com.dio.testes;

import java.io.IOException;
import java.util.Scanner;

/**
 * Sendo a circunferência de 360 graus, equivalente a um dia de 24 horas,
 * cada 1/4 da circunferência terá 6 horas, ou 360 minutos.
 * A circunferência terá ao total 1440 minutos.
 * Cada unidade de grau da circunferência terá 4 minutos.
 */
public class MudancaContinua2 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            double graus = leitor.nextDouble();

            if (graus <= 360) {
                if (graus < 90 || graus == 360) System.out.println("Bom Dia!!");
                else if ( graus >= 90 && graus < 180 ) System.out.println("Boa Tarde!!");
                else if ( graus >=180 && graus < 270 ) System.out.println("Boa Noite!!");
                else if ( graus >= 270 && graus < 360 ) System.out.println("De Madrugada!!");

                Double horas;
                if (graus >= 270) {
                    horas = ((graus - 270.0) * 4.0) / 60.0;
                } else {
                    horas = ((graus * 4.0) / 60.0) + 6.0;
                }

                Double minutos = (horas * 60.0) % 60.0;
                Double segundos = (minutos * 60.0) % 60.0;

                if (segundos > 59) {
                    segundos = 0.0;
                    minutos += 1.0;
                }

                System.out.printf("%02d:%02d:%02d%n", horas.intValue(), minutos.intValue(), segundos.intValue());
            }
        }
    }

}
