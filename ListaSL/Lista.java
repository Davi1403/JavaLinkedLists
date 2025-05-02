public class Lista {
    Node inicio, fim;

    public Lista(){
        inicio = fim = null;
    }

    public void add(int valor){
        if(inicio == null){
            inicio = new Node(valor);
            fim = inicio;
        } else{
            fim.setProx(new Node(valor)); // O fim aponta para o proximo no e adiciona o valor.
            fim = fim.getProx(); // O novo fim = setProx do fim antigo.
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

    public void addInicio(int valor){
        Node aux = new Node(valor);
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

    public void remove(int pos){
        Node aux = inicio;
        int j = 0;

        while (aux!=null){
            if (pos > length()-1 || pos < 0){
                System.out.println("Posição não existe");
                break;
            }else if (pos == 0){
                inicio = aux.getProx();
                break;
            }else if (pos-1 == j){
                aux.setProx(aux.getProx().getProx());
            }
            j++;
            aux = aux.getProx();
        }

    }

    public int removedNode(int pos){
        Node aux = inicio;
        int j = 0;

        while (aux!=null){
            if (pos > length()-1 || pos < 0){
                return -999999;
            }else if (pos == 0){
                inicio = aux.getProx();
                return aux.getX();
            }else if (pos-1 == j){
                int resp;
                resp = aux.getProx().getX();
                aux.setProx(aux.getProx().getProx());
                return resp;
            }
            j++;
            aux = aux.getProx();
        }
        return -999999;
    }

    public void inserePos(int pos, int valor){
        if (pos > length()){ pos = length();}
        if (pos == 0){
            addInicio(valor);
        }else {
            Node newNode = new Node(valor);
            Node aux = inicio;
            int j = 0;
            while (aux!=null){
                if (pos-1 == j){
                    newNode.setProx(aux.getProx());
                    aux.setProx(newNode);
                }
                j++;
                aux = aux.getProx();
            }
        }
    }
}
