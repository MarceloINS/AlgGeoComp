package Main;

public class Vetor extends Matriz{
    public Vetor( int linha, Integer[][] elementos) {
        super(linha, 1, elementos);
    }

    public int getElemento(int linha) { return getElemento(linha, 1); }

}