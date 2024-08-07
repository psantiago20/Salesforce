package main.java.LogicaDois.Operadores;

import java.util.Scanner;

//Leia o comprimento e a largura de um retângulo e calcule o seu perímetro
//e área.
public class Retangulo {
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

        int perimetro = 2 * (base + altura);

        int area = base * altura;

        //Imprime o resultado
        System.out.println("A área do retâgulo é: " + area + ".");
        System.out.println("O perímetro do retângulo é: " + perimetro + ".");

        scanner.close();
    }
}
