package main.java.LogicaDois.Repeticao;

import java.util.Scanner;

//Leia um número N e exiba todos os números pares de 1 a N.
public class NumerosPares {
    public static void main(String[] args) {

        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Digite quantos números serão calculados: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        int n = scanner.nextInt();

        int i;

        //a cada iteração verifica o valor de i e gera i+1
        for(i = 1; i <= n; i = i +1){
            //se o número for divido por 2 e o resto dessa divisão for 0, então o número é par
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
