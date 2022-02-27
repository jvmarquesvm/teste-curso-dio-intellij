package br.com.dio;

import java.util.Scanner;

public class FusoHorario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasaida = sc.nextInt();
        int tempoviagem = sc.nextInt();
        int fuso = sc.nextInt();
        int ajuste = 0;

        if ( horasaida >= 0 || horasaida <= 23  ){
            //Escreva a sua lógica aqui
            ajuste = horasaida + tempoviagem + fuso;
        }

        if ( horasaida == 0){
            horasaida = 24;
        }

        if( ajuste == 24){
            ajuste = 0;
        } else if ( ajuste ==25){
            ajuste = 1;
        } else if ( ajuste ==26){
            ajuste = 2;
        } else if ( ajuste ==27){
            ajuste = 3;
        } else if ( ajuste ==28){
            ajuste = 4;
        } else if ( ajuste ==29){
            ajuste = 5;
        } else if ( ajuste ==30){
            ajuste = 6;
        } else if ( ajuste ==31){
            ajuste = 7;
        } else if ( ajuste ==32){
            ajuste = 8;
        } else if ( ajuste ==33){
            ajuste = 9;
        } else if ( ajuste ==34){
            ajuste = 10;
        } else if ( ajuste ==35){
            ajuste = 11;
        } else if ( ajuste ==36){
            ajuste = 12;
        }
        System.out.println(ajuste);

        sc.close();
    }
}
