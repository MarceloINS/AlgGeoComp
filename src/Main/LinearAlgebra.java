package Main;

public class LinearAlgebra {

    public Matriz transpose(Matriz a) {

        Integer[][] elementos = new Integer[a.getColuna()][a.getLinha()];
        for (int i = 0; i < a.getLinha(); i++) {
            for (int j = 0; j < a.getColuna(); j++) {
                elementos[j][i] = a.getElemento(i, j);
            }
        }
        return new Matriz(a.getColuna(), a.getLinha(), elementos);
    }

}
