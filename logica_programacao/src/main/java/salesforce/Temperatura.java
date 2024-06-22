package main.java.salesforce;

import java.util.Scanner;

//Desenvolva um algoritmo que leia a temperatura em graus Celsius e determine se
//está frio (abaixo de 15), ameno (entre 15 e 25) ou quente (acima de 25).
public class Temperatura {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Digite a temperatura em graus Celsius: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        double temperatura = scanner.nextDouble();

        //verifica as condições
        if(temperatura < 15){
            System.out.println("Está frio.");
        } else if (temperatura >= 15 && temperatura <= 25) {
            System.out.println("Está ameno");
        }
        else{
            System.out.println("Está quente.");
        }
        scanner.close();
    }
}
