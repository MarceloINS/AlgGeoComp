package Main;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int linha = 3, coluna = 3;
        Integer[][] elementos = new Integer[linha][coluna];
        Matriz matriz = new Matriz(linha,coluna, elementos);


        for (int i = 0; i < matriz.getLinha(); i++) {
            for (int j = 0; j < matriz.getColuna(); j++) {
                matriz.setElemento(new Random().nextInt(100) + 1,i,j);
            }
        }


        for (int i = 0; i < matriz.getLinha(); i++) {
            for (int j = 0; j < matriz.getColuna(); j++) {
                if(j == (matriz.getColuna()-1)) {
                    System.out.println(elementos[i][j]);
                } else {
                    System.out.print(elementos[i][j] + " ");
                }
            }
        }
    }
}