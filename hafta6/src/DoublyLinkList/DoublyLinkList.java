package DoublyLinkList;

public class DoublyLinkList {
    private Link head;
    private Link tail;

    //listenin bos oldugu belirtilir
    public DoublyLinkList() {
        head = null;
        tail = null;
    }

    //liste bos olup olmama durumunu kontrol eder
    public boolean isEmpty() {
        return head == null;
    }

    //basa elaman ekleyecek olan (head in oncesine eleman ekleme yapar)
    public void insertFirst(long d) {
        //dugumu olusuturduk
        Link newLink = new Link(d);

        //liste bos hem head hem tail
        if (isEmpty()) {
            tail = newLink;
        } else {
            head.previous = newLink;
        }
        newLink.next = head;
        head = newLink;
    }

    //sona eleman ekleme
    public void insertToTail(long d) {
        //dugumu olusturduk
        Link newLink = new Link(d);
        //liste bossa
        if (isEmpty()) {
            //hem head hem tail yeni dugumu isaret etmeli
            head = newLink;

        } else {
            tail.next = newLink;
            newLink.previous = tail;

        }
        tail = newLink;
    }

    //ilk elemani (headi ) silen metod
    public Link deleteFirst() {
        Link temp = head;
        //listede tek eleman varsa
        if (head.next == null) {
            //liste bos hale getirildi
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        return temp;
    }

    //sondan eleman silme
    public Link deleteFromTail() {
        Link temp = tail;
        //Listede tek eleman varsa
        if (head.next == null) {
            head = null;
        } else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        return temp;
    }

    //ilgili degeri arama metod
    public Link find(long key) {
        Link current = head;

        while (current.data != key) {
            current = current.next;
            if (current == null) {
                //aranan listede yoksa
                //liste sonuna gelindiyse ve hicbir eslesme yoksa
                return null;
            }
        }
        return current;
    }

    //ilgili veriyi silme metodu
    public void delete(long d) {
        Link current = find(d);
        //dugum bulunduysa
        if (current != null) {
            //silinecek dugum bastaysa
            if (current == head) {
                //head guncellenir
                head = current.next;
                head.previous = null;

            }
            //silinecek dugum sondaysa
            else if (current == tail) {
                //tail guncellenir
                tail = current.previous;
                tail.next = null;
            }
            //silinecek dugum aradaysa
            else {
                //onceki dugumun nexti guncellenir
                current.previous.next = current.next;
                //sonraki dugumun previous i guncellenir
                current.next.previous = current.previous;
            }
        }
    }
    //listeyi bastan sona yazdirma
    public void displayForward(){
        System.out.println("bastan sona");
        Link current=head;

        while (current!=null){
            //dugumun degeri yazdirir
            current.displayLink();
            current=current.next;
        }
        System.out.println(" ");
    }
    //listeyi sondan basa yazdirma
    public void displayBackward(){
        System.out.println(" sondan basa");
        Link current=tail;

        while (current!=null){
            //dugumun degeri yazdirir
            current.displayLink();
            current=current.previous;
        }
        System.out.println(" ");
    }
}
