package HashChain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HashChainApp {
    public static void main(String[] args) throws IOException {
        int aKey;
        Link aDataItem;
        int size, n, keysPerCell = 100;
        System.out.print("Hash Table boyutu: ");
        size = getInt();
        System.out.print("Eklenecek rastgelere deger sayisi: ");
        n = getInt();
        HashTable theHashTable = new HashTable(size);

        for (int j = 0; j < n; j++)
        {
            aKey = (int) (Math.random() * keysPerCell + size);
            aDataItem=new Link(aKey);
            theHashTable.insert(aDataItem);
        }
        while (true) {
            System.out.print("İşlem Seçiniz:");
            System.out.print("Göster(g), Ekle(e), Bul(b), Sil(s), Kapat(k)");
            int choice = getChar();
            switch (choice) {
                case 'g':
                    theHashTable.displayTable();
                    break;
                case 'e':
                    System.out.print("Eklenecek değer:");
                    aKey = getInt();
                    aDataItem = new Link(aKey);
                    theHashTable.insert(aDataItem);
                    break;
                case 's':
                    System.out.print("Silinecek deger:");
                    aKey = getInt();
                    theHashTable.delete(aKey);
                    break;
                case 'b':
                    System.out.print("Arancak deger: ");
                    aKey = getInt();
                    aDataItem = theHashTable.find(aKey);
                    if (aDataItem != null)
                        System.out.println("Bulundu " + aKey);
                    else
                        System.out.println("Bulunamadi " + aKey);
                    break;
                case 'k':
                    Runtime.getRuntime().exit(0);
                default:
                    System.out.println("Hatali giriss\n");
            }// end switch
        }//end while
    }//end main

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //satirdaki tum ifade alinir
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}