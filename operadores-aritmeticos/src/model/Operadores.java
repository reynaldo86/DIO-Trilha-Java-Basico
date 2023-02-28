package model;

public class Operadores {
    public static void main(String[] args) {
        //operadores

        int a,b;

        a = 4;
        b = 6;

        String resultado = "";
        //String resultado = a==b ? "verdadeiro" : "falso";

        //Igualdade
        if (a==b) {
            resultado = "Verdadeiro";
        }
        else{
            resultado = "Falso";
        }
        System.out.println(resultado);

        //Maior ou menor
        resultado = a < b ? "(A) é menor" : "(A) é Maior";
        System.out.println(resultado);

        //Diferente de.
        resultado =  a != b ? "(A) é diferente de (B)" : "(A) é igual a (B)";
        System.out.println(resultado);

        //Comparação de String
        String nome1 = "Reynald";
        String nome2 = "Reynaldo";
        resultado = nome1.equals(nome2) ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        //Condição

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 || condicao2){
            System.out.println("Apenas uma das condições é verdadeira");
        }
        if(condicao1 && (7>4) ){
            System.out.println("As duas condições são veradeiras");
        }



    }
}
