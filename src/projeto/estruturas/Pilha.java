package projeto.estruturas;

import projeto.interfaces.PilhaTAD;
import projeto.nodes.Node;

/**
 * @param<T>
 * @author guinh
 */
public class Pilha<T> implements PilhaTAD<T>{
    private Node<T> base;
    
    public Pilha(){
        this.base = null;
    }

    @Override
    public int tamanho() {
        int tam = 0;
        if(this.base == null){
            return tam;
        }
        else{
            tam++;
            Node temp = this.base;
            while(temp.getSuperior() != null){
                temp = temp.getSuperior();
                tam++;
            }
            return tam;
        }
    }

    @Override
    public boolean estaVazia() {
        return this.tamanho() == 0;
    }

    @Override
    public void empilhar(T item) {
        if(item == null){
            return;
        }
        else {
            Node novoNode = new Node(item);
            novoNode.setSuperior(null);
            if(this.estaVazia()){
                this.base = novoNode;
            }
            else {
                Node temp = this.base;
                while(temp.getSuperior() != null){
                    temp = temp.getSuperior();
                }
                temp.setSuperior(novoNode);
            }
        }
    }

    @Override
    public void espiar() {
        if(this.base == null){
            return;
        }
        else if(this.estaVazia()){
            return;
        }
        else {
            Node temp = this.base;
            while(temp.getSuperior() != null){
                temp = temp.getSuperior();
            }
            System.out.println("Topo: "+temp.getItem().toString());
        }
    }

    @Override
    public void desempilhar() {
        if(this.base == null){
            return;
        }
        else if(this.estaVazia()){
            return;
        }
        else {
            Node temp = this.base;
            while(temp.getSuperior().getSuperior() != null){
                temp = temp.getSuperior();
            }
            temp.setSuperior(null);
            
        }
    }

    @Override
    public T desempilharItem() {
        if(this.base == null){
            return null;
        }
        else if(this.estaVazia()){
            return null;
        }
        else{
            T aux = null;
            Node temp = this.base;
            while(temp.getSuperior().getSuperior() != null){
                temp = temp.getSuperior();
            }
            aux = (T) temp.getSuperior().getItem();
            temp.setSuperior(null);
            return aux;
        }
    }

    @Override
    public void exibir() {
        if(this.base == null){
            System.out.println("[]");
        }
        else if(this.estaVazia()){
            System.out.println("[]");
        }
        else{
            this.exibir(this.base);
        }
    }
    
    private void exibir(Node topo){
        if(topo == null){
            return;
        }
        else{
            this.exibir(topo.getSuperior());
            System.out.println(""+topo.getItem().toString());
        }
    }

    @Override
    public boolean limpar() {
        if(this.base == null){
            return false;
        }
        else if(this.estaVazia()){
            return false;
        }
        else {
            while(this.desempilharItem() != null);
            return true;
        }
    }
}
