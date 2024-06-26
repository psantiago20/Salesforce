package main.java.LogicaDois.FuncoesProcedimentos;

import java.util.Scanner;

//Crie uma função que recebe um número como parâmetro e retorna true
//se ele for primo e false caso contrário.
public class NumerosPrimos {
    public static void main(String[] args) {
        //Serve para simplificar a inserção de dados
        Scanner scanner = new Scanner(System.in);

        //Imprime o que será escrito para o usuário
        System.out.println("Digite um número: ");

        //Guarda o valor da primeira variável e passa para o próximo comando
        int num = scanner.nextInt();

        if(primo(num)){
            System.out.println("O número é primo.");
        }
        else {
            System.out.println("O número não é primo.");
        }
        scanner.close();
    }

    public static boolean primo(Integer num){
        if(num <= 1) return false;

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
