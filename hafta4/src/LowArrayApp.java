public class LowArrayApp {
    public static void main(String[] args) {
        LowArray dizi;
        dizi = new LowArray(100);
        int elemanSayisi = 0;
        int j;

        //eleman ekleme
        dizi.setElem(0, 35);
        dizi.setElem(1, 45);
        dizi.setElem(2, 40);
        dizi.setElem(3, 11);
        dizi.setElem(4, 24);
        dizi.setElem(5, 17);
        dizi.setElem(6, 3);
        dizi.setElem(7, 1);
        dizi.setElem(8, 8);
        dizi.setElem(9, 99);

        elemanSayisi = 10;

        //listeleme
        for (j = 0; j < elemanSayisi; j++) {
            System.out.print(dizi.getElem(j) + " ");
        }

        //arama
        int searchKey = 45;
        for (j = 0; j < elemanSayisi; j++) {
            if (dizi.getElem(j) == searchKey) {
                break;
            }
        }
        if (j == elemanSayisi) {
            System.out.println(searchKey + " bulunamadi!");
        } else {
            System.out.println(searchKey + " bulundu!");
        }
        //silme
        for (j = 0; j < elemanSayisi; j++) {
            if (dizi.getElem(j) == 3) {
                break;
            }
        }
        //sola kaydirma
        for (int k = j; k < elemanSayisi; k++) {
            dizi.setElem(k, dizi.getElem(k + 1));
        }
        elemanSayisi--;

        //guncel halini yazdirma
        for (j = 0; j < elemanSayisi; j++) {
            System.out.print(dizi.getElem(j) + " ");
        }
        System.out.println(" ");

    }
}
