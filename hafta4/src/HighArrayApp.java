public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray dizi = new HighArray(maxSize);

        //deger ekleme
        dizi.insert(25);
        dizi.insert(23);
        dizi.insert(20);
        dizi.insert(44);
        dizi.insert(7);
        dizi.insert(11);
        dizi.insert(4);
        dizi.insert(34);
        dizi.insert(53);
        dizi.insert(6);

        //elemanlari listelme
        dizi.display();

        //arama
        int searchKey = 25;
        if (dizi.find(searchKey)) {
            System.out.println(searchKey + " bulundu!");
        }
        else{
            System.out.println(searchKey + " bulunamadi!");
        }

        //silme
        dizi.delete(44);
        dizi.delete(7);
        dizi.delete(11);

        //guncel hali yazdirma
        dizi.display();
    }
}
