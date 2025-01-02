package HashChain;

public class HashTable {
    private SortedList[] hashArray;
    private int arraySize;

    public HashTable(int size) {
        arraySize = size;
        hashArray = new SortedList[arraySize];
        for (int j = 0; j < arraySize; j++) {
            hashArray[j] = new SortedList();
        }
    }

    public void displayTable() {
        for (int j = 0; j < arraySize; j++) {
            //bucket indisini yazdir
            System.out.print(j + ". ");
            //bucket'taki bagli listeyi yazdir
            hashArray[j].displayList();
        }
    }

    //
    public int hashFunc(int key) {
        return key % arraySize;
    }

    public void insert(Link theLink) {
        int key = theLink.getKey();
        int hashVal = hashFunc(key);
        hashArray[hashVal].insert(theLink);
    }

    public void delete(int key) {
        int hashVal = hashFunc(key);
        //belirlenen bucketten sil
        hashArray[hashVal].delete(key);
    }

    public Link find(int key) {
        int hashVal = hashFunc(key);
        //belirlenen buckette ara
        Link theLink = hashArray[hashVal].find(key);
        return theLink;
    }

}
