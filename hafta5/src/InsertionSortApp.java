public class InsertionSortApp {
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
        System.out.println();

        //insertion sort algoritmasi
        //distaki dongu siralanmasi gereken elemani
        // dogru konuma yerlesene kadar gecici elemana atar
        for (int i = 1; i < elemanSayisi; i++) {
            long temp = dizi[i];
            //sirali eleman nereye yerlesecek onu bulmamiz icin
            int j = i;
            //icteki dongu elamani dogru yere yerlestiri
            while (j > 0 && dizi[j - 1] > temp) {
                dizi[j] = dizi[j - 1];
                j--;
            }
            dizi[j] = temp;
        }
        System.out.println("dizinin siralanmis hali:");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(dizi[i] + " ");
        }


    }
}
