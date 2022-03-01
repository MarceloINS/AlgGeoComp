package Main;

public class Matriz {
    private final int colunas;
    private final int linhas;
    private final Integer[][] elementos;

    public Matriz(int linhas, int colunas, Integer[][] elementos) {
        this.colunas = colunas;
        this.linhas = linhas;
        this.elementos = elementos;
    }

    public int getElemento(int linha, int coluna) {
        return elementos[linha][coluna];
    }

    public int getColuna() {
        return colunas;
    }

    public int getLinha() {
        return linhas;
    }

}