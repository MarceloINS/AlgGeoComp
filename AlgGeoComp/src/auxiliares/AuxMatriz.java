package auxiliares;
import Main.Matriz;
import Main.Vetor;

import java.util.Random;

public class AuxMatriz {


    //Funcao para criar matrizes, basta passar a dimensao dela
    public Matriz createMatrix(int linha, int coluna) {
        return new Matriz(linha, coluna, createElements(linha, coluna));
    }

    //Funcao para criar vetores, basta passar quantos elementos ele terá
    public Vetor createVetor(int linha) {
        return new Vetor(linha, createElements(linha, 1));
    }

    //Ignorar essa funcao
    private Integer[][] createElements(int linha, int coluna) {
        Integer[][] elementos = new Integer[linha][coluna];
        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                elementos[i][j] = new Random().nextInt(10) + 1;
            }
        }
        return elementos;
    }

    //Funcao para exibir a matriz/vetor
    public void exibir(Matriz matriz) {
        for (int i = 0; i < matriz.getLinha(); i++) {
            for (int j = 0; j < matriz.getColuna(); j++) {
                if (j == (matriz.getColuna() - 1)) {
                    System.out.println(matriz.getElemento(i, j));
                } else {
                    System.out.print(matriz.getElemento(i, j) + " ");
                }
            }
        }
    }

}
