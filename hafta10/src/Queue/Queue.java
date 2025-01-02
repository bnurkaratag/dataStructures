package Queue;

public class Queue {
    private int maxSize;
    private long[] queueArray;

    private int front;
    private int rear;
    private int elemanSayisi;


    public Queue(int s) {
        maxSize=s;
        queueArray=new long[maxSize];
        //baslangicta eleman sayisi bos old.dan
        front=0;
        rear=-1;
        elemanSayisi=0;
    }
    public void insert(long d) {
        //rear kuyrugun sonunda ise
        //kuyrugun sonunda ulasildiysa
        if (rear==maxSize-1){
            //dairesel yapi icin basa donulur
            rear=-1;
        }
        //eleman diziye eklenir
        //rear artirilir
        queueArray[++rear]=d;
        elemanSayisi++;
    }
    public long remove(){
        //kuyrugun onundeki eleman allinir
        //cikartilan eleman temp e atilir
        //sonraki elemana gecilir
        long temp=queueArray[front++];
        //front kuyrugun sonuna ulasirsa sifirlanir
        if (front==maxSize){
            front=0;
        }
        elemanSayisi--;
        return temp;
    }
    //kuyrugun onundeki elemani cikarmadan dondur
    public long peekFront(){
        return queueArray[front];
    }
    public boolean isEmpty(){
        return elemanSayisi==0;
    }
    public boolean isFull(){
        return elemanSayisi==maxSize;
    }
    public int size(){
        return elemanSayisi;
    }
}
