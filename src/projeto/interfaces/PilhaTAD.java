package projeto.interfaces;

/**
 * @param<T>
 * @author guinh
 */
public interface PilhaTAD<T> {
    public int tamanho();
    public boolean estaVazia();
    public void empilhar(T item);
    public void espiar();
    public void desempilhar();
    public T desempilharItem();
    public void exibir();
    public boolean limpar();
}
