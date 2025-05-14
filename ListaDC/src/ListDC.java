import org.w3c.dom.Node;
import org.w3c.dom.Text;

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
            System.out.print(aux.getX());
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

    public int length(){
        NodeDC aux = head.getProx();
        int i = 0;
        while (aux != null){
            i++;
            aux = aux.getProx();
        }
        return i;
    }

    public void removeIndex(int index){
        NodeDC aux = head.getProx();
        int j = 0;

        if (length() == 1){
            head.setProx(null);
            head.setAnt(null);
        }else if (index > length()-1 || index < 0){
            System.out.println("Index out of range");
        }else if (index == 0){
            head.setProx(head.getProx().getProx());
            head.getProx().setAnt(null);
        }else if (index == length()-1){
            head.setAnt(head.getAnt().getAnt());
            head.getAnt().setProx(null);
        }else {
            while (aux != null) {
                if (index == j){
                    aux.getAnt().setProx(aux.getProx());
                    aux.getProx().setAnt(aux.getAnt());
                    break;
                }
                j++;
                aux = aux.getProx() ;
            }
        }
    }


    public void removeCaracter (char caracter){
        NodeDC aux = head.getProx();
        int j = 0;
        while (aux!=null){
            if (aux.getX() == caracter){
                    removeIndex(j);
                    j--;
                }
                j++;
                aux = aux.getProx();
            }
        }

    public ListDC clone(){
        NodeDC aux = head.getProx();
        ListDC copy =  new ListDC();

        while (aux != null){
            copy.addEnd(aux.getX());
            aux = aux.getProx();
        }
        return copy;
    }

    public void removeUpperLowCase(String caracter){
        caracter = caracter.toLowerCase();
        removeCaracter(caracter.charAt(0));
    }

    public String charToString(){
        NodeDC aux = head.getProx();
        String text = "";

        while (aux != null){
            text += String.valueOf(aux.getX());
            aux = aux.getProx();
        }
        return text;
    }

    public void stringToChar(String text){
        for (int i = 0; i < text.length() ; i++){
            addEnd(text.charAt(i));
        }
    }
}