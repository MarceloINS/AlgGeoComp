package Main;
import auxiliares.AuxMatriz;


public class Main {

    public static void main(String[] args) {

        int linha = 3, coluna = 3;
        LinearAlgebra linearAlgebra = new LinearAlgebra();
        AuxMatriz auxMatriz = new AuxMatriz();

        /*Matriz matriz = auxMatriz.createMatrix(linha, coluna);

        auxMatriz.exibir(matriz);

        System.out.println();
        System.out.println();

        Matriz a = linearAlgebra.transpose(matriz);

        auxMatriz.exibir(a);

        System.out.println();
        System.out.println();*/


        Matriz b = auxMatriz.createMatrix(linha, coluna);
        auxMatriz.exibir(b);

        System.out.println();
        System.out.println();

        Matriz c = auxMatriz.createMatrix(linha, coluna);
        auxMatriz.exibir(c);

        System.out.println();
        System.out.println();

        //auxMatriz.exibir(linearAlgebra.sum(b,c));

        System.out.println();
        System.out.println();

        auxMatriz.exibir(linearAlgebra.times(b, 2));

        System.out.println();
        System.out.println();

        auxMatriz.exibir(linearAlgebra.times(b, c));


    }
}
