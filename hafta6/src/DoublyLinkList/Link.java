package DoublyLinkList;

public class Link {
    public long data;
    public Link next;
    public Link previous;

    public Link(long data) {
        this.data = data;
    }

    //verileri ekrana bastirir
    public void displayLink() {
        System.out.print(data + " ");
    }
}
