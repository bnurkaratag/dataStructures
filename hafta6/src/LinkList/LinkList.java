package LinkList;

public class LinkList {
    private Link head;
    private Link tail;

    public LinkList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    //basa eleman ekleme
    public void insertToHead(long d) {
        Link newLink = new Link(d);
        if (isEmpty()) { //true geldiğinde yani liste bossa
            tail = newLink;
        }
        newLink.next = head;
        head = newLink;
    }

    //sona eleman ekleme
    public void insertLast(long d) {
        Link newLink = new Link(d);
        if (isEmpty()) {
            head = newLink;
        } else {
            tail.next = newLink;
        }
        tail = newLink;
    }

    //listenin basindaki elemani silme
    public long deleteFromHead() {
        long temp = head.data;
        if (head.next == null) {
            tail = null;
        }
        head = head.next;
        return temp;
    }

    public void displayList() {
        System.out.println("liste (head-->tail): ");
        Link current = head;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }
}
