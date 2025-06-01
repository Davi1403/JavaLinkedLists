public class Main {
    public static void main(String[] args) {
        ListDC l = new ListDC();


        // C-)
        l.addEnd('O');
        l.addEnd('R');
        l.addEnd('I');
        l.addEnd('N');
        l.addEnd('T');
        l.addEnd('H');
        l.addEnd('I');
        l.addEnd('a');
        l.addEnd('N');
        l.addEnd('S');

        // B-)
        l.addStart('C');
        l.addStart(' ');
        l.addStart('I');
        l.addStart('A');
        l.addStart('a');
        l.addStart('A');
        l.addStart('V');

        l.print();
        l.printBackward();


        System.out.println("\n____________________________________________________________________________________________\n");

        // D-)
        l.removeValue('O');
        l.print();
        l.printBackward();

        System.out.println("\n____________________________________________________________________________________________\n");

        // E-)
        ListDC copy = l.copy();
        copy.removeValue('A');
        System.out.print("ORIGINAL");
        l.print();
        System.out.print("CÓPIA ");
        copy.print();

        System.out.println("\n____________________________________________________________________________________________\n");

        // F-)

        copy.removeUpperLowCase('A');
        copy.print();

        System.out.println("\n____________________________________________________________________________________________\n");

        // G-)

        copy.print();
        copy.invertPointers();
        copy.print();

        System.out.println("\n____________________________________________________________________________________________\n");

        // H-)
        ListDC l2 = new ListDC();
        l2.print();
        System.out.println("Middle = " + l2.middle());

        System.out.println("\n____________________________________________________________________________________________\n");

        // I-)
        System.out.println(l.returnPhrase());

        System.out.println("\n____________________________________________________________________________________________\n");

        // J-)
        l.stringToList(" isso e uma string que vai para a lista");
        l.print();

        System.out.println("\n____________________________________________________________________________________________\n");
    }
}
