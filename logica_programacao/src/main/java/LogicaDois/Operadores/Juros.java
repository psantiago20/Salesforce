package main.java.LogicaDois.Operadores;

import java.util.Scanner;

//Calcule o montante final (capital + juros) após um determinado número
//de anos, utilizando juros compostos. Dados: capital (C), taxa de juros (r) e tempo (t).
//A fórmula é: montante = C * (1 + r/100)^t
public class Juros {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Digite o valor do capital: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        double capital = scanner.nextDouble();

        //Imprime o que será escrito para o usuário
        System.out.println("Digite o valor da taxa de juros: ");

        //Guarda o valor da segunda variável e passa para o próximo comando
        double taxa = scanner.nextDouble();

        //Imprime o que será escrito para o usuário
        System.out.println("Digite o tempo da aplicação: ");

        //Guarda o valor da terceira variável e passa para o próximo comando
        double tempo = scanner.nextDouble();

        double montante = capital * Math.pow((1 + taxa / 100), tempo);

        double juros = montante - capital;

        //Imprime o resultado
        System.out.printf("O valor aplicado foi: R$" + "%.2f", capital);
        System.out.printf(" .O valor do retorno aplicado foi: R$" + "%.2f", juros);
        System.out.printf(" .O montante final é: R$" + "%.2f", montante);

        scanner.close();
    }
}
