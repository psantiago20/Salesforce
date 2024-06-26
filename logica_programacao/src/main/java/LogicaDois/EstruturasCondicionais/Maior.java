package main.java.LogicaDois.EstruturasCondicionais;

import java.util.Scanner;

//Leia dois números e exiba o maior deles.
public class Maior {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Digite o primeiro número: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        int num1 = scanner.nextInt();

        //Imprime o que será escrito para o usuário
        System.out.println("Digite o segundo número: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println("O primeiro número {" + num1 + "} é o maior.");
        } else if (num2 > num1) {
            System.out.println("O segundo número {" + num2 + "} é o maior.");
        }
        else {
            System.out.println("Os números são iguais.");
        }
        scanner.close();
    }
}
