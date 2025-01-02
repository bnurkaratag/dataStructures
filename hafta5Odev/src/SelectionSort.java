public class SelectionSort {
    private long[] dizi;
    int elemanSayisi;
    long temp;

    public SelectionSort(int max) {
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
    public void selectionSort(){
        for (int i = 0; i < elemanSayisi - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < elemanSayisi; j++) {
                if (dizi[j] < dizi[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(i,minIndex);
            }
        }
    }
}
