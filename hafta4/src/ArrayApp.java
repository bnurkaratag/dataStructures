public class ArrayApp {
    public static void main(String[] args) {
        long[] dizi = new long[100];
        int elemanSayisi = 0;
        int j;
        long searchKey;

        //eleman ekleme
        dizi[0] = 72;
        dizi[1] = 55;
        dizi[2] = 25;
        dizi[3] = 58;
        dizi[4] = 99;
        dizi[5] = 45;
        dizi[6] = 53;
        dizi[7] = 20;
        dizi[8] = 10;
        dizi[9] = 4;

        elemanSayisi = 10;

        //yazdirma
        for (j = 0; j < elemanSayisi; j++) {
            System.out.print(dizi[j] + " ");
        }
        //arama
        searchKey = 25;
        for (j = 0; j < elemanSayisi; j++) {
            if (dizi[j] == searchKey) {
                break;
            }
        }
        //silme
        for (int k = j; k < elemanSayisi; k++) {
            dizi[k] = dizi[k + 1];                //sola kaydırma islemi yaptik
        }
        elemanSayisi--;
        System.out.println(" ");

        //guncel halini yazdirma
        for (j = 0; j < elemanSayisi; j++) {
            System.out.print(dizi[j] + " ");
        }

        System.out.println(" ");
        System.out.println(dizi.length);


    }
}
