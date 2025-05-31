public class Main {
    public static void main (String[] args){
        ListDC l = new ListDC();

        // c-) AddEnd
        l.addEnd('v');
        l.addEnd('i');
        l.addEnd('i');
        l.addEnd('i');
        l.addEnd('i');
        l.addEnd('a');
        l.addEnd('a');
        l.addEnd('w');
        l.addEnd('w');
        l.addEnd('w');


        l.print();
        /*
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
        l.removeIndex(8);
        l.print();


        System.out.println("________________________________________");

        // d-) Remove by caracter
        l.print();
        l.removeCaracter('i');
        l.print();

        System.out.println("________________________________________");

        //e-) Clone list

        l.print();
        ListDC clone = l.clone();
        l.removeCaracter('w');
        l.print();
        System.out.print("CLONE = ");
        clone.print();

        System.out.println("________________________________________");

        //f-) Remove Upper and Low case

        l.removeUpperLowCase("A");
        l.print();

        System.out.println("________________________________________");

        //g- ) InvertPointers

        l.addEnd('l');
        l.addEnd('u');
        l.print();
        l.invertPointer();
        System.out.printf("INVERT POINTERS = ");
        l.printBackward();

        System.out.println("________________________________________");

        //i- Convert list to a String
        System.out.println(l.charToString());

        System.out.println("________________________________________");

        //j- Convert a string to list
        l.stringToChar("VAI CORINTHIANS");
        l.print();
*/
    }
}