package projeto.nodes;

/** 
 * @param<T>
 * @author guinh
 */
public class Node<T> {
    private T item;
    private Node<T> superior;
    
    public Node(T item){
        this.item = item;
        this.superior = null;
    }
    
    public void setItem(T item){
        this.item = item;
    }
    
    public T getItem(){
        return this.item;
    }
    
    public void setSuperior(Node<T> superior){
        this.superior = superior;
    }
    
    public Node<T> getSuperior(){
        return this.superior;
    }
}
