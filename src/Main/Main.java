package Main;
import auxiliares.AuxMatriz;


public class Main {

    public static void main(String[] args) {

        int linha = 3, coluna = 3;
        LinearAlgebra linearAlgebra = new LinearAlgebra();
        AuxMatriz auxMatriz = new AuxMatriz();

        Matriz matriz = auxMatriz.createMatrix(linha, coluna);

        auxMatriz.exibir(matriz);

        System.out.println();
        System.out.println();

        Matriz a = linearAlgebra.transpose(matriz);

        auxMatriz.exibir(a);
    }
}
