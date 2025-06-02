public class Main {
    public static void main (String[] args){
        Lista l = new Lista();

        l.addEnd(2);
        l.addEnd(4);
        l.addEnd(6);

        l.print();

        System.out.println("\n---------------------------------------------------------------------\n");


        // 01 - Length
        System.out.println("Length = " + l.length());

        System.out.println("\n---------------------------------------------------------------------\n");

        // 02 - Sum
        System.out.println("Sum = " + l.sum());

        System.out.println("\n---------------------------------------------------------------------\n");

        // 03 - Max
        System.out.println("Max = " + l.max());

        System.out.println("\n---------------------------------------------------------------------\n");

        // 04 - Min
        System.out.println("Min = " + l.min());

        System.out.println("\n---------------------------------------------------------------------\n");

        // 05 - DoubleX
        l.doubleX();
        l.print();

        System.out.println("\n---------------------------------------------------------------------\n");


        // 06 - AddInicio
        l.addInicio(20);
        l.print();

        System.out.println("\n---------------------------------------------------------------------\n");


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
        l.print();
        l.removeByIndex(4);
        l.print();
        System.out.println("---------------------------------------------------------------------");


        //11 - removeNode
        l.print();
        System.out.println(l.returnRemoved(0));
        l.print();
        System.out.println("---------------------------------------------------------------------");


        //12 - inserePos
        l.inserePos(4,222);
        l.print();

    }
}
