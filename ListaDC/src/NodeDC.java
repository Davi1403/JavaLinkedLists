import org.w3c.dom.Node;

public class NodeDC {

    private char x;
    private NodeDC prox, ant;

    public NodeDC(char caracter){
        x = caracter;
        prox = ant = null;
    }

    public void setX(char caracter){
        x = caracter;
    }

    public char getX() {
        return x;
    }

    public void setAnt(NodeDC node){
        ant = node;
    }

    public NodeDC getAnt(){
        return ant;
    }

    public void setProx(NodeDC node){
        prox = node;
    }

    public NodeDC getProx(){
        return prox;
    }
}


