package Main;

public class Vetor extends Matriz{
    public Vetor( int colunas, Integer[][] elementos) {
        super(colunas, 1, elementos);
    }

    public int getElemento(int coluna) { return getElemento(1, coluna); }

}