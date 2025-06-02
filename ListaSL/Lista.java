public class Lista {
    Node inicio, fim;

    public Lista(){
        inicio = fim = null;
    }

    public void addEnd(int n){
        Node aux = new Node(n);

        if (inicio == null){
            inicio = fim = aux;
        }else{
            fim.setProx(aux);
            fim = aux;
        }
    }

    public void print(){
        Node aux = inicio;

        System.out.print("[");
        while(aux!=null){
            System.out.printf(" %d ", aux.getX());
            aux = aux.getProx();
        }
        System.out.print("]\n");
    }

    public int length(){
        Node aux = inicio;

        int count = 0;
        while (aux!=null){
            count ++;
            aux = aux.getProx();
        }
        return count;
    }

    public int sum(){
        Node aux = inicio;

        int sum = 0;
        while(aux!=null){
            sum += aux.getX();
            aux = aux.getProx();
        }
        return sum;
    }

    public int max(){
        Node aux = inicio;

        int max = inicio.getX();
        while (aux!=null){
            if(aux.getX() > max){
                max = aux.getX();
            }
            aux = aux.getProx();
        }
        return max;
    }

    public int min(){
        Node aux = inicio;

        int min = inicio.getX();
        while (aux!=null){
            if(aux.getX() < min){
                min = aux.getX();
            }
            aux = aux.getProx();
        }
        return min;
    }

    public void doubleX(){
        Node aux = inicio;

        while(aux!=null) {
            aux.setX(aux.getX() * 2);
            aux = aux.getProx();
        }
    }
/*
    public void addInicio(int valor){
        Node aux = new Node(valor);
        aux.setProx(inicio);
        inicio = aux;
    }
*/


    public void addInicio(int n){
        Node aux = new Node(n);
        aux.setProx(inicio);
        inicio = aux;
    }


    public int somaPosImpares(){
        Node aux = inicio;
        int j = 0;
        int sum = 0;
        while (aux!=null){
            if(j%2 != 0){
               sum += aux.getX();
            }
            j++;
            aux = aux.getProx();
        }
        return sum;
    }

    public void posPares(){
        Node aux = inicio;
        int j = 0;
        System.out.print("[");
        while (aux!=null){
            if(j%2 == 0){
                System.out.printf(" %d " , aux.getX());
            }
            j++;
            aux = aux.getProx();
        }
        System.out.print("]");
    }

    public int index(int pos){
        Node aux = inicio;
        int j = 0;

        while (aux!=null){
            if (pos == j){
                return aux.getX();
            }
            j++;
            aux = aux.getProx();
        }
        return -9999999;
    }


    public void remove(Node no){
        Node aux = inicio;

        if (no == inicio){
            inicio = aux.getProx();
        }else{
            while (aux!=null){

                if (aux.getProx() == no){
                    if (aux.getProx() == fim){
                        aux.setProx(null);
                        break;
                    }
                    aux.setProx(aux.getProx().getProx());
                    break;
                }
                aux = aux.getProx();
            }
        }
    }

    public void removeByIndex(int pos){
        int j = 0;
        Node aux = inicio;
        if (pos > length()-1 || pos < 0){
            System.out.println("POSIÇAO INVALIDA");
        }
        while (aux != null){
            if (pos == j){
                remove(aux);
                break;
            }
            j++;
            aux = aux.getProx();
        }
    }

    public int returnRemoved(int pos){
        int j = 0;
        Node aux = inicio;
        if (pos > length()-1 || pos < 0){
            return -999999;
        }
        while (aux != null){
            if (pos == j){
                remove(aux);
                return aux.getX();
            }
            j++;
            aux = aux.getProx();
        }
        return -999999;
    }

    public void inserePos(int pos, int valor){
        if (pos == 0){
            addInicio(valor);
        }else if (pos >= length()){
            addEnd(valor);
        }else{
            Node aux = inicio;
            Node no = new Node(valor);
            int j = 0;

            while (aux != null){
                if (j == pos-1){
                    Node prox = aux.getProx();
                    aux.setProx(no);
                    no.setProx(prox);
                }
                j++;
                aux = aux.getProx();
            }

        }
    }
}
