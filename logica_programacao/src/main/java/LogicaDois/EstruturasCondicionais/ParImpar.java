package main.java.LogicaDois.EstruturasCondicionais;

import java.util.Scanner;

//Leia um número e verifique se ele é par ou ímpar.
public class ParImpar {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Digite um número inteiro: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("O número é par!");
        }
        else{
            System.out.println("O número é ímpar!");
        }
        scanner.close();
    }
}
