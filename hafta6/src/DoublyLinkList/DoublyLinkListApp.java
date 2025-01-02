package DoublyLinkList;

public class DoublyLinkListApp {
    public static void main(String[] args) {
        DoublyLinkList theList = new DoublyLinkList();

        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.insertToTail(11);
        theList.insertToTail(33);
        theList.insertToTail(55);

        theList.displayForward();
        theList.displayBackward();

        theList.deleteFirst();
        System.out.print("bastan eleman silindi");
        theList.displayForward();

        theList.deleteFromTail();
        System.out.print("sondan eleman silindi");
        theList.displayForward();

        theList.delete(11);
        System.out.print("11  degeri silindi");
        theList.displayForward();
    }
}
