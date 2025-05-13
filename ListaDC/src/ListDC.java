public class ListDC {
    private NodeDC head;

    public ListDC(){
        head = new NodeDC('c');
    }

    public void addEnd(char caracter){
        NodeDC aux = new NodeDC(caracter);
        if (head.getProx() == null){
            head.setProx(aux);
            head.setAnt(aux);
        }else{
            head.getAnt().setProx(aux);
            aux.setAnt(head.getAnt());
            head.setAnt(aux);
        }
    }

    public void addStart(char caracter){
        NodeDC aux = new NodeDC(caracter);
        if (head.getProx() == null){
            head.setProx(aux);
            head.setAnt(aux);
        }else{
            head.getProx().setAnt(aux);
            aux.setProx(head.getProx());
            head.setProx(aux);
        }
    }

    public void print(){
        NodeDC aux = head.getProx();
        System.out.print("[ ");
        while (aux != null){
            System.out.print(" ");
            System.out.print(((char) aux.getX()));
            System.out.print(" ");
            aux = aux.getProx();
        }
        System.out.println(" ]");
    }

    public void printBackward(){
        NodeDC aux = head.getAnt();
        System.out.print("[ ");
        while (aux != null){
            System.out.print(" ");
            System.out.print(((char) aux.getX()));
            System.out.print(" ");
            aux = aux.getAnt();
        }
        System.out.println(" ]");
    }


}