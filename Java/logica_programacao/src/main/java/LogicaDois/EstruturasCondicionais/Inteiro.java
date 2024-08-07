package main.java.LogicaDois.EstruturasCondicionais;

import java.util.Scanner;

//Leia um número e verifique se ele é positivo, negativo ou zero.
public class Inteiro {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Digite um número inteiro: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        int num = scanner.nextInt();

        if(num > 0){
            System.out.println("O número é positivo!");
        } else if (num < 0) {
            System.out.println("O número é negativo!");
        }
        else {
            System.out.println("O número é zero!");
        }
        scanner.close();
    }
}
