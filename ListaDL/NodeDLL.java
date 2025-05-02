public class NodeDLL {
    private int x;
    private NodeDLL ant, prox;

    public NodeDLL(int valor){
        this.x = valor;
        ant = prox = null;
    }

    public void setX(int valor){
        this.x = valor;
    }

    public int getX(){
        return this.x;
    }

    public void setAnt(NodeDLL n){
        ant = n;
    }

    public NodeDLL getAnt(){
        return ant;
    }

    public void setProx(NodeDLL n){
        prox = n;
    }

    public NodeDLL getProx(){
        return prox;
    }
}
