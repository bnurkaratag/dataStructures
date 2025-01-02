public class LowArray {
    private long[] dizi;

    public LowArray(int size) {
        dizi = new long[size];
    }

    //ilgili indise deger atama
    public void setElem(int index, long value) {
        dizi[index] = value;
    }

    //belirtilen indisteki degeri dondurme
    public long getElem(int index) {
        return dizi[index];
    }
}
