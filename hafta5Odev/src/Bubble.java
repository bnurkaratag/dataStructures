public class Bubble {
    private long[] dizi;
    int elemanSayisi;
    long temp;

    public Bubble(int max) {
        dizi = new long[max];
        elemanSayisi = 0;
    }
    public void insert(long value) {
        dizi[elemanSayisi] = value;
        elemanSayisi++;
    }
    public  void display(){
        for(int i = 0; i < elemanSayisi; i++){
            System.out.print(dizi[i]+" ");
        }
        System.out.println();
    }
    public void swap(int a, int b){
        temp = dizi[a];
        dizi[a] = dizi[b];
        dizi[b] = temp;
    }
    public void bubbleSort(){
        for(int i = 0; i < elemanSayisi-1; i++){
            for(int j = 0; j < elemanSayisi-i-1; j++){
                if(dizi[j] > dizi[j+1]){
                    swap(j, j+1);
                }
            }
        }
    }
}
