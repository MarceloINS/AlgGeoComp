package Main;

public class LinearAlgebra {

    //Transposta
    public Matriz transpose(Matriz a) {
        Integer[][] elementos = new Integer[a.getColuna()][a.getLinha()];
        for (int i = 0; i < a.getLinha(); i++) {
            for (int j = 0; j < a.getColuna(); j++) {
                elementos[j][i] = a.getElemento(i, j);
            }
        }
        return new Matriz(a.getColuna(), a.getLinha(), elementos);
    }

    //Somar
    public Matriz sum(Matriz a, Matriz b) {
        Integer[][] elementos = new Integer[a.getLinha()][a.getColuna()];
        if(a.getLinha() == b.getLinha() && a.getColuna() == b.getColuna()) {
            for(int i = 0; i < a.getLinha(); i++) {
                for(int j = 0; j < a.getColuna(); j++) {
                    elementos[i][j] = a.getElemento(i,j) + b.getElemento(i,j);
                }
            }
        } else {throw new Error("As dimensoes dos operandos precisam ser iguais");}

        if(a instanceof Vetor) {
            return new Vetor(a.getLinha(), elementos);
        } else {
            return new Matriz(a.getLinha(), a.getColuna(), elementos);
        }
    }

    //Times
    public Matriz times(Matriz a, Matriz b) {
        Integer[][] elementos = new Integer[a.getLinha()][a.getColuna()];
        if(a.getLinha() == b.getLinha() && a.getColuna() == b.getColuna()) {
            for(int i = 0; i < a.getLinha(); i++) {
                for(int j = 0; j < a.getColuna(); j++) {
                    elementos[i][j] = a.getElemento(i,j) * b.getElemento(i,j);
                }
            }
        } else {throw new Error("As dimensoes dos operandos precisam ser iguais");}

        if(a instanceof Vetor) {
            return new Vetor(a.getLinha(), elementos);
        } else {
            return new Matriz(a.getLinha(), a.getColuna(), elementos);
        }
    }

    public Matriz times(Matriz a, int b) {
        Integer[][] elementos = new Integer[a.getLinha()][a.getColuna()];
        for(int i = 0; i < a.getLinha(); i++) {
            for(int j = 0; j < a.getColuna(); j++) {
                elementos[i][j] = a.getElemento(i,j) * b;
            }
        }

        if(a instanceof Vetor) {
            return new Vetor(a.getLinha(), elementos);
        } else {
            return new Matriz(a.getLinha(), a.getColuna(), elementos);
        }
    }
}
