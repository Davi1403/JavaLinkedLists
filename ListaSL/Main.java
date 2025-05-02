public class Main {
    public static void main (String[] args){
        Lista l = new Lista();

        l.add(1);
        l.add(-2);
        l.add(3);
        l.add(30);
        l.add(50);

        l.print();
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


        // 08 - posPares
        l.posPares();
        System.out.println("\n---------------------------------------------------------------------");


        // 09 - Index

        System.out.println("Valor no index indicado = " + l.index(0));
        System.out.println("---------------------------------------------------------------------");


        // 10 - Remove
        l.remove(0);
        l.print();
        System.out.println("---------------------------------------------------------------------");

        //11 - removeNode
        l.print();
        System.out.println(l.removedNode(4));
        l.print();
        System.out.println("---------------------------------------------------------------------");

        //12 - inserePos
        l.inserePos(2,222);
        l.print();

    }
}
