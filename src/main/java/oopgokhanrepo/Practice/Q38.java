package oopgokhanrepo.Practice;

import java.util.Scanner;

public class Q38 {
    public static void main(String[] args) {

        // String olan pin kodunuzu kontrol eden bir kod yaziniz.

        Scanner scanner = new Scanner(System.in);
        String pin = "said.12345";
        int girisHakki = 4;

        System.out.println("******Hosgeldiniz*******");

        while (true) {
            System.out.println("pin kodu giriniz");
            String girilenPin = scanner.next();

            if (pin.equals(girilenPin)) {
                System.out.println("basarili giris yaptiniz....");
                break;
            } else {
                System.out.println("yanlis giris yaptiniz");
                girisHakki--;
                System.out.println("kalan giris hakkiniz : " + girisHakki);
            }
            if (girisHakki == 0) {
                System.out.println("giris hakkiniz kalmadi... sim kartiniz bloke oldu");
                break;
            }

        }




    }

}