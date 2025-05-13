public class Main {
    public static void main (String[] args){
        ListDC l = new ListDC();

        // c-) AddEnd
        l.addEnd('v');
        l.addEnd('i');


        l.print();
        l.printBackward();

        System.out.println("________________________________________");

        // b-) AddStart
        l.addStart('a');
        l.addStart('D');

        l.print();
        l.printBackward();

        System.out.println("________________________________________");

        System.out.println("LENGTH = " + l.length());

        System.out.println("________________________________________");

        // REMOVE BY THE INDEX
        l.print();
        l.removeIndex(0);
        l.print();
        l.removeIndex(0);
        l.print();
        l.removeIndex(0);
        l.print();
        l.removeIndex(0);
        l.print();


        System.out.println("________________________________________");

        // REMOVE BY CARACTER

        //l.print();
        //l.removeCaracter('D');
        //l.removeCaracter('a');
        //l.removeCaracter('v');
        //l.removeCaracter('i');

        //l.print();
    }
}