package HashChain;

public class SortedList {
    private Link head;
    public  SortedList(){
        head = null;
    }
    public void insert(Link theLink){
        int key=theLink.getKey();
        Link previous=head;
        Link current=head;
        while(current !=null && key>current.getKey()){
            previous=current;
            current=current.next;
        }
        //sayi ilk sayidan kucukse ->listenin basina eklenmeli
        if(previous==null){
            head=theLink;
        }
        else{
            previous.next=theLink;
        }
        //sonraki eklenecek icin nextindeki eklme yapmaya yonendiriyoruz
        theLink.next=current;
    }
    public void delete(int key){
        Link previous=null;
        Link current=head;
        while(current !=null && key!=current.getKey()){
            previous=current;
            current=current.next;
        }
        //silinecek sayi basta
        if(previous==null){
            head=head.next;
        }
        else{
            //silinecek sati aradaysa
            previous.next=current.next;
        }
    }
    public Link find(int key){
        Link current=head;
        while(current !=null && current.getKey()<=key){
            if(current.getKey()==key){
                return current;
            }
            current=current.next;
        }
        return null;
    }
    public void displayList(){
        System.out.print("List (head-->tail):");
        Link current=head;
        while(current !=null){
            current.displayLink();
            current=current.next;
        }
        System.out.println("");
    }
}
