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

    public char getX(){
        return x;
    }

    public void setAnt(NodeDC n){
        ant = n;
    }

    public NodeDC getAnt(){
        return ant;
    }

    public void setProx(NodeDC n){
        prox = n;
    }

    public NodeDC getProx(){
        return prox;
    }
}
