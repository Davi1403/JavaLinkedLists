public class ListDLL {

    private NodeDLL inicio, fim;
    public ListDLL(){
            inicio = fim = null;
    }

    public void addFim(int valor){
        NodeDLL aux = new NodeDLL(valor);

        if (inicio == null){
            inicio = fim = aux;
        }else{
            aux.setAnt(fim);
            fim.setProx(aux);
            fim = aux;
        }
    }

    public void print(){
        NodeDLL aux = inicio;
        System.out.print("[ ");
        while (aux != null){
            System.out.printf(" %d " , aux.getX());
            aux = aux.getProx();
        }
        System.out.print(" ]\n");
    }

    public void printBackward(){
        NodeDLL aux = fim;
        System.out.print("[ ");
        while (aux != null){
            System.out.printf(" %d " , aux.getX());
            aux = aux.getAnt();
        }
        System.out.print(" ]\n");
    }

    public int length (){
        NodeDLL aux = inicio;
        int length = 0;
        while (aux != null){
            length++;
            aux = aux.getProx();
        }
        return length;
    }

    public int sum (){
        NodeDLL aux = inicio;
        int sum = 0;

        while (aux != null){
            sum += aux.getX();
            aux = aux.getProx();
        }
        return sum;
    }

    public int max(){
        NodeDLL aux = inicio;
        int max = 0;

        while (aux != null){
            if (aux.getX() > max){
                max = aux.getX();
            }
            aux = aux.getProx();
        }
        return max;
    }

    public int min(){
        NodeDLL aux = inicio;
        int min = inicio.getX();

        while (aux != null){
            if (aux.getX() < min){
                min = aux.getX();
            }
            aux = aux.getProx();
        }
        return min;
    }

    public void doubleX(){
        NodeDLL aux = inicio;

        while (aux != null){
            aux.setX(aux.getX()*2);
            aux = aux.getProx();
        }
    }

    public void addInicio (int valor){
        NodeDLL aux = new NodeDLL(valor);

        if (inicio == null){
            aux = inicio = fim;
        }else{
            aux.setProx(inicio);
            inicio.setAnt(aux);
            inicio = aux;
        }
    }

    public int somaPosImpares(){
        NodeDLL aux = inicio;
        int sum = 0, j = 0;
        while (aux!=null){
            if (j%2 != 0){
                sum += aux.getX();
            }
            aux = aux.getProx();
            j++;
        }
        return sum;
    }

    public void posPares(){
        NodeDLL aux = inicio;
        int j = 0;

        System.out.print("[ ");
        while (aux!=null){
            if (j%2==0){
                System.out.print(aux.getX() + " ");
            }
            aux = aux.getProx();
            j++;
        }
        System.out.print("]\n");
    }

    public int index(int pos){
        NodeDLL aux = inicio;
        int j = 0;

        while(aux!=null){
            if (j==pos){
                return aux.getX();
            }
            aux = aux.getProx();
            j++;
        }
        return -9999999;
    }

    public void remove(int pos) {
        if (pos == 0) {
            inicio = inicio.getProx();
            inicio.setAnt(null);
        } else if (pos == length() - 1) {
            fim = fim.getAnt();
            fim.setProx(null);
        } else if (pos > length() - 1 || pos < 0) {
            System.out.println("Posição não existe");
        } else {
            NodeDLL aux = inicio;
            int j = 0;

            while (aux != null) {
                if (pos == j) {
                    aux.getAnt().setProx(aux.getProx());
                    aux.getProx().setAnt(aux.getAnt());
                }
                aux = aux.getProx();
                j++;
            }
        }
    }

    public int removedNode(int pos){
        NodeDLL aux = inicio;
        int j=0;
        int resp;

        while (aux!=null) {
            if (pos == j) {
                resp = aux.getX();
                remove(j);
                return resp;
            }
            aux = aux.getProx();
            j++;
        }
        return -9999999;
    }
    /*
    public void inserePos(int pos, int valor){
        if (pos > length()){
            addFim(valor);
        }else if (pos == 0){
            addInicio(valor);
        }else{
            NodeDLL newNode = new NodeDLL(valor);
            NodeDLL aux = inicio;

            int j=0;
            while (aux!=null){
                if(pos == j){
                    newNode.setAnt(aux.getAnt());
                    newNode.setProx(aux);
                    aux.getAnt().setProx(newNode);
                    aux.setAnt(newNode);
                    break;
                }
                aux = aux.getProx();
                j++;
            }
        }
    }
    */

    public void inserePos(int pos, int valor){
        if (pos == 0){
            addInicio(valor);
        }else if (pos >= length()){
            addFim(valor);
        }else{
            NodeDLL aux = inicio;
            NodeDLL no = new NodeDLL(valor);
            int j = 0;

            while (aux != null){
                if (j == pos){
                    aux.getAnt().setProx(no);
                    no.setAnt(aux.getAnt());
                    aux.setAnt(no);
                    no.setProx(aux);
                }
                j++;
                aux = aux.getProx();
            }
        }
    }
}
