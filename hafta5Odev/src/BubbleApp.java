public class BubbleApp {
    public static void main(String[] args) {
        Bubble dizi=new Bubble(10);

        dizi.insert(23);
        dizi.insert(25);
        dizi.insert(9);
        dizi.insert(52);
        dizi.insert(15);
        dizi.insert(53);
        dizi.insert(45);
        dizi.insert(44);
        dizi.insert(61);
        dizi.insert(58);

        dizi.display();
        dizi.bubbleSort();

        System.out.println( "dizi siralandiktan sonra");
        dizi.display();
    }
}
