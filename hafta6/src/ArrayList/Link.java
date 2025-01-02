package ArrayList;

public class Link {
    public int iData;
    public double dData;
    public  Link next;

    public Link(int id, double dd) {
        iData = id;
        dData = dd;
    }
    //verileri ekrana yazdirma
    public  void displayLink(){
        System.out.println("{"+iData+", "+ dData+ "}");
    }
    /* cikti
    * {1,1.2}
    * {2,2.3}
    */







}
