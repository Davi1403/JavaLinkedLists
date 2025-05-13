public class Main {
    public static void main (String[] args){
        ListDC l = new ListDC();

        l.addEnd('D');
        l.addEnd('a');
        l.addEnd('v');
        l.addEnd('i');

        l.print();
        l.printBackward();

        l.addStart('r');
        l.addStart('i');
        l.addStart('S');

        l.print();
        l.printBackward();
    }
}