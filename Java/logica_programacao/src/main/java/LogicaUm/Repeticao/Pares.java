package main.java.LogicaUm.Repeticao;

//Crie um algoritmo que exiba todos os números pares de 1 a 20 usando a estrutura
//"para".
public class Pares {
    public static void main(String[] args) {

        int i;

        //a cada iteração verifica o valor de i e gera i+1
        for(i = 1; i <= 20; i = i +1){
            //se o número for divido por 2 e o resto dessa divisão for 0, então o número é par
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
