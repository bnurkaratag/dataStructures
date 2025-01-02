package Stack;

import java.util.Scanner;

public class BracketCheckerApp {
    public static void main(String[] args) {
        String input;
        while(true) {
            System.out.println("parantez iceren metin giriniz!");
            input=getString();
            if(input.equals("")) {
                break;
            }
            BracketChecker theChecker = new BracketChecker(input);
            theChecker.check();
        }
    }
    public static String getString() {
        Scanner input = new Scanner(System.in);
        //nextLine gecerli satiri dondordukten sonra tarayici
        //otomatik olarak asagi kaydiri
        String s = input.nextLine();
        return s;
    }
}
