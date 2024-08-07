package main.java.LogicaDois.Repeticao;

import java.util.Scanner;

//Leia um número N e exiba uma contagem regressiva de N até 0.
public class ContagemRegressiva {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Digite um número: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        int n = scanner.nextInt();

        int i;

        System.out.println("Os valores em ordem inversa são: \n");

        for(i = n; i >= 0; i--){
            System.out.println(i);
        }
        scanner.close();
    }
}
