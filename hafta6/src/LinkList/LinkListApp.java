package LinkList;

public class LinkListApp {
    public static void main(String[] args) {
        LinkList theList = new LinkList();
        theList.insertToHead(22);
        theList.insertToHead(33);
        theList.insertToHead(44);

        theList.insertLast(55);
        theList.insertLast(66);
        theList.insertLast(77);

        theList.displayList();

        // 2 kez yazdik cunku gercekten head verisini guncelliyor mu?
        theList.deleteFromHead();
        theList.deleteFromHead();

        theList.displayList();

    }
}
