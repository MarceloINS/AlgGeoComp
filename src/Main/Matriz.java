package Main;

public class Matriz {
    private int colunas;
    private int linhas;
    private final Integer[][] elementos;

    public Matriz(int colunas, int linhas, Integer[][] elementos) {
        this.colunas = colunas;
        this.linhas = linhas;
        this.elementos = elementos;
    }

    public int getElemento(int coluna, int linha) {
        return elementos[coluna][linha];
    }

    public void setElemento(int elemento, int linha, int coluna) {
        elementos[linha][coluna] = elemento;
    }

    public int getColuna() {
        return colunas;
    }

    public int getLinha() {
        return linhas;
    }

    public void setColuna(int coluna) {
        this.colunas = coluna;
    }

    public void setLinha(int linha) {
        this.linhas = linha;
    }

}