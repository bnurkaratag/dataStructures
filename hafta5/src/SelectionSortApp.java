public class SelectionSortApp {
    public static void main(String[] args) {
        long[] dizi = new long[100];
        int elemanSayisi = 10;

        dizi[0] = 23;
        dizi[1] = 25;
        dizi[2] = 9;
        dizi[3] = 52;
        dizi[4] = 15;
        dizi[5] = 53;
        dizi[6] = 45;
        dizi[7] = 44;
        dizi[8] = 61;
        dizi[9] = 58;

        System.out.println("dizinin siralanmamis hali:");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(dizi[i] + " ");
        }
        //selection sort algoritmasi
        //distaki dongu siralancak elemanlari temsil ediyor
        for (int i = 0; i < elemanSayisi - 1; i++) {
            //en kucuk elemanin indisini bulmak icin
            int minIndex = i;

            //ic dongu siralanmamis kismi tarar
            for (int j = i + 1; j < elemanSayisi; j++) {
                if (dizi[j] < dizi[minIndex]) {
                    //daha kucuk bir eleman bulunduysa
                    minIndex = j;
                }
            }
            //eger daha kucuk bir eleman bulunduysa
            //yer degistir
            if (minIndex != i) {
                long temp = dizi[i];
                dizi[i] = dizi[minIndex];
                dizi[minIndex] = temp;
            }
        }
        System.out.println("\ndizinin siralanmis hali:");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(dizi[i] + " ");
        }
    }
}
