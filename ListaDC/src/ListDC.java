public class ListDC {
    private NodeDC head;

    public ListDC(){
        head = new NodeDC('~');
    }

    public void addStart(char caracter){
        NodeDC aux = new NodeDC(caracter);

        if (head.getProx() == null){
            head.setProx(aux);
            head.setAnt(aux);
            aux.setProx(head);
            aux.setAnt(head);
        }else{
            head.getProx().setAnt(aux);
            aux.setProx(head.getProx());
            head.setProx(aux);
            aux.setAnt(head);
        }
    }

    public void addEnd(char caracter){
        NodeDC aux = new NodeDC(caracter);

        if (head.getProx() == null){
            head.setProx(aux);
            head.setAnt(aux);
            aux.setProx(head);
            aux.setAnt(head);
        }else{
            head.getAnt().setProx(aux);
            aux.setAnt(head.getAnt());
            head.setAnt(aux);
            aux.setProx(head);
        }
    }
    public void print(){
        NodeDC aux = head.getProx();
        System.out.print("[ ");
        while (aux != head){
            if (aux == null){
                System.out.print("LISTA VAZIA");
                break;
            }
            System.out.print(aux.getX());
            aux = aux.getProx();
        }
        System.out.println(" ]");
    }

    public void printBackward(){
        NodeDC aux = head.getAnt();
        System.out.print("[ ");
        while (head != aux){
            if (aux == null){
                System.out.print("LISTA VAZIA");
                break;
            }
            System.out.print(aux.getX());
            aux = aux.getAnt();
        }
        System.out.println(" ]");
    }

    public void remove(NodeDC aux){
        if (head.getProx() == head.getAnt()){
            head.setProx(null);
            head.setAnt(null);
        }else if (aux == head.getProx()){
            aux.getProx().setAnt(head);
            head.setProx(aux.getProx());
        }else if (aux == head.getAnt()){
            aux.getAnt().setProx(head);
            head.setAnt(aux.getAnt());
        }else {
            aux.getAnt().setProx(aux.getProx());
            aux.getProx().setAnt(aux.getAnt());
        }
    }

    public void removeValue(char caracter){
        NodeDC aux = head.getProx();
        int count = 0;
        while (aux != head){
            if (aux.getX() == caracter){
                remove(aux);
                count++;
            }
            aux = aux.getProx();
        }
        if (count == 0){
            System.out.println("CARACTER NÃO ENCONTRADO");
        }else {
            System.out.println("FOREM REMOVIDOS " + count + "NÓS COM ESSE VALOR");
        }
    }

    public ListDC copy(){
        ListDC copy = new ListDC();
        NodeDC aux = head.getProx();
        while (aux != head){
            copy.addEnd(aux.getX());
            aux = aux.getProx();
        }
        return copy;
    }

    public void removeUpperLowCase(char caracter){
        NodeDC aux = head.getProx();
        char upper = Character.toUpperCase(caracter);
        char low = Character.toLowerCase(caracter);
        int count = 0;
        while (aux != head){
            if (aux.getX() == low || aux.getX() == upper){
                remove(aux);
                count++;
            }
            aux = aux.getProx();
        }
        if (count == 0){
            System.out.println("CARACTER NÃO ENCONTRADO");
        }else {
            System.out.println("FOREM REMOVIDOS " + count + "NÓS COM ESSE VALOR");
        }
    }

    public void invertPointers(){ // CONFERIR SE PODE MUDAR OS PONTEIROS QUE SAIM DO HEAD, SE NÃO, TEM QUE ADAPTAR O PRINTBACKWARD (aux = aux.getProx())
        NodeDC aux = head.getAnt();

        while (aux != head){
            if (aux == head.getAnt()){
                head.setProx(aux); // !!!
                aux.setProx(aux.getAnt());
                aux.setAnt(head);
            }else if (aux == head.getProx()){
                aux.setAnt(aux); // !!!
                aux.setAnt(aux.getProx());
                aux.setProx(head);
            }else{
                NodeDC ant = aux.getAnt();
                aux.setAnt(aux.getProx());
                aux.setProx(ant);
            }
            aux = aux.getProx();
        }
    }

    public char middle(){
        NodeDC aux = head.getProx();
        NodeDC aux2 = head.getProx();

        while (aux2 != head && aux2 != head.getAnt()){
            aux = aux.getProx();
            aux2 = aux2.getProx().getProx();
        }
        return aux.getX();
    }

    public String returnPhrase(){
        StringBuilder pharase = new StringBuilder();
        NodeDC aux = head.getProx();

        while (aux != head){
            pharase.append(aux.getX());
            aux = aux.getProx();
        }
        return pharase.toString();
    }

    public void stringToList(String phrase){
        for (int i = 0 ; i < phrase.length() ; i++){
            addEnd(phrase.charAt(i));
        }
    }
}
