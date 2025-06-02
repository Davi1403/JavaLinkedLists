public class Main {
    public static void main(String[] args) {
        ListDLL l = new ListDLL();

        l.addFim(1);
        l.addFim(-2);
        l.addFim(3);
        l.addFim(30);
        l.addFim(50);

        l.print();
        System.out.println("---------------------------------------------------------------------");

        l.printBackward();
        System.out.println("---------------------------------------------------------------------");

        // 01 - Length
        System.out.println("Length = " + l.length());
        System.out.println("---------------------------------------------------------------------");

        // 02 - Sum
        System.out.println("Sum = " + l.sum());
        System.out.println("---------------------------------------------------------------------");


        // 03 - Max
        System.out.println("Max = " + l.max());
        System.out.println("---------------------------------------------------------------------");


        // 04 - Min
        System.out.println("Min = " + l.min());
        System.out.println("---------------------------------------------------------------------");


        // 05 - DoubleX
        l.doubleX();
        l.print();
        System.out.println("---------------------------------------------------------------------");


        // 06 - AddInicio
        l.addInicio(20);
        l.print();
        System.out.println("---------------------------------------------------------------------");


        // 07 - somaPosImpares
        System.out.println("Soma dos impares = " + l.somaPosImpares());
        System.out.println("---------------------------------------------------------------------");


        // 08 - podPares
        l.posPares();
        System.out.println("---------------------------------------------------------------------");

        // 09 - Index
        l.print();
        System.out.println("Valor no index indicado = " + l.index(5));
        System.out.println("---------------------------------------------------------------------");

        // 10 - Remove
        l.print();
        l.remove(2);
        l.print();

        System.out.println("---------------------------------------------------------------------");

        //11 - removeNode
        l.print();
        System.out.println(l.removedNode(2));
        l.print();
        System.out.println("---------------------------------------------------------------------");


        //12 - inserePos
        l.print();
        l.inserePos(1,200);
        l.print();
        l.inserePos(5,200);
        l.print();
        l.inserePos(0,200);
        l.print();
        l.printBackward();
    }
}