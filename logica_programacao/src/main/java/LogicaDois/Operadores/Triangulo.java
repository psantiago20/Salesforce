package main.java.LogicaDois.Operadores;

import java.util.Scanner;

//Leia a base e a altura de um triângulo e calcule a sua área usando a
//fórmula: área = (base * altura) / 2.
public class Triangulo {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Digite o valor da base: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        int base = scanner.nextInt();

        //Imprime o que será escrito para o usuário
        System.out.println("Digite o valor da altura: ");

        //Guarda o valor da segunda variável e passa para o próximo comando
        int altura = scanner.nextInt();

        int area = (base * altura) / 2;

        //Imprime o resultado
        System.out.println("A área do triângulo é: " + area);

        scanner.close();
    }
}
