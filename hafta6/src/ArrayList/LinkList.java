package ArrayList;

public class LinkList {
    //private cunku Link tipinde degisken atadik
    private Link head;

    public LinkList() {
        //bos liste belirtiyoruz
        head = null;
    }

    //basa eleman eklme metodu
    public void insertToHead(int id, double dd) {
        Link newLink = new Link(id, dd); //35
        newLink.next = head;           //35.next=42 35 i 42 nin onune ekledik
        head = newLink;               //head artık 35
    }

    //bastaki elemani silme metodu
    public Link deleteFirst() {
        //silmeden once silinecek adres temp e atandi
        Link temp = head;
        head = head.next;
        //geriye gonderilen silinecek adres bilgisi
        return temp;
    }

    //elemanlari listeleme metodu
    public void displayList() {
        System.out.println("Liste:");
        Link current = head;
        while (current != null) { //list bos olmadikca calisir
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }

    //listenin bos olup olmadiginin kontrolu
    public boolean isEmpty() {
        //head null olunca isEmpty True gelir
        return head == null;
    }
}
