package exercicios.arrays;
    /*
    🔹Array Multidimensional: Gere e imprima uma matriz 4x4 com valores aleatórios entre 0-9.
    Após isso determine o menor número da matriz e a sua posição(linha, coluna).
    */

import java.util.Random;

public class ArrayMultidimensional {

    public static void main(String[] args) {

        Random random = new Random();

        int [] [] matrix = new int[4][4];

        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for(int[] linha: matrix){
            for (int elementoColuna: linha) {
                System.out.print(elementoColuna + " ");
            }
            System.out.println();
        }

    }
}
