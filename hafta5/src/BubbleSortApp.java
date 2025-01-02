public class BubbleSortApp {
    public static void main(String[] args) {
        long[] dizi = new long[100];
        int elemanSayisi = 10;
        long temp;

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

        //bubble sort algoritmasi
        //disdakii dongu diziyi siralamak icin
        //kac gecis yapilacagini belirler
        for (int i = 0; i < elemanSayisi - 1; i++) {
            //ic dongu elemanlari karsilatirir ve
            //yerlerini degistirir
            for (int j = 0; j < elemanSayisi - i - 1; j++) {
                if (dizi[j] > dizi[j + 1]) {
                    temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
            }
        }
        System.out.println("\ndizinin siralanmis hali:");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(dizi[i] + " ");
        }
    }
}
