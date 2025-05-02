public class Node {
    private int x;
    private Node prox;

    public Node(int valor){
        x = valor;
        prox = null;
    }

    public void setX(int valor) {x = valor;}
    public void setProx(Node p){prox = p;}
    public int getX(){return x;}
    public Node getProx(){return prox;}

}
