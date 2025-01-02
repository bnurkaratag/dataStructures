package ArrayList;

public class LinkListApp {
    public static void main(String[] args) {
        LinkList theList = new LinkList();

        theList.insertToHead(1, 2.2);
        theList.insertToHead(2, 3.3);
        theList.insertToHead(3, 4.4);

        theList.displayList();

        //benim listem bos degilse
        while (!theList.isEmpty()) {
            //silinecek veriye ait adres bilgisi atanir
            Link aLink = theList.deleteFirst();
            System.out.print("silinen: ");
            //silinecek adresteki verileri gosterir
            aLink.displayLink();
            System.out.println(" ");
        }

        //hic veri kalmadi
        theList.displayList();
    }
}
