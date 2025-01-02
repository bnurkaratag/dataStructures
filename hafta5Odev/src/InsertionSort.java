public class InsertionSort {
    private long[] dizi;
    int elemanSayisi;
    long temp;

    public InsertionSort(int max) {
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
    public void insertionSort(){
        for (int i = 1; i < elemanSayisi; i++) {
            long temp = dizi[i];
            int j = i;
            while (j > 0 && dizi[j - 1] > temp) {
                dizi[j] = dizi[j - 1];
                j--;
            }
            swap(i,j);
        }
    }
}
