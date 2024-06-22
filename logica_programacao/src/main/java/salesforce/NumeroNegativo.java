package main.java.salesforce;

import java.util.Scanner;

//Desenvolva um algoritmo que leia números do usuário até que ele digite um
//número negativo, e então exiba a média dos números positivos digitados usando
//a estrutura "faça enquanto".
public class NumeroNegativo {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        int num, soma = 0, contador = 0;
        double media;

        do{
            //Imprime o que será escrito para o usuário
            System.out.println("Digite um número (negativo para sair): ");

            //Guarda o valor da variável e passa para o próximo comando
            num = scanner.nextInt();

            //Se o número for positivo continua
            if( num >= 0){
                soma = soma + num;
                contador = contador + 1;
            }
        } while (num >= 0);
        if(contador > 0){
            media = soma / contador;
            System.out.println("A média dos números positivos é: " + media);
        }
        else {
            System.out.println("Nenhum número positivo foi digitado.");
        }
    }
}
