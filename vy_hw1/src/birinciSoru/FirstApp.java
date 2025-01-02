package birinciSoru;

import java.util.Scanner;

public class FirstApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Metin giriniz: ");
        String input = scanner.nextLine();

        // Stack oluşturuluyor.
        First theStack = new First(input.length());

        // Kullanıcıdan alınan metni stack'e ekleme.
        for (char c : input.toCharArray()) {
            theStack.push(c);
        }

        System.out.print("");
        reversePrint(theStack);
    }

    // Recursive yöntemle stack içeriğini tersine yazdıran fonksiyon
    public static void reversePrint(First stack) {
        if (!stack.isEmpty()) {
            char value = stack.pop(); // Stack'ten elemanı çıkar
            System.out.print(value);  // Değeri yazdır
            reversePrint(stack);      // Kalan elemanlar için recursive çağrı
        }
    }
}
