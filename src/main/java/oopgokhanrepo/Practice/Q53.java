package oopgokhanrepo.Practice;

import java.util.Scanner;

public class Q53 {
    public static void main(String[] args) {
        // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
        //    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
        //    s -> 5
        //    a -> 4
        //    e -> 3
        //    i -> 1
        //    o -> 0
        //    Test data
        //    hackerDili("java ile hersey guzel")
        //    j4v4 1l3 h3r53y guz3l
        //    İpucu harfleri değiştirin ve ekrana yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String str = scan.nextLine().toLowerCase();

        hackerDili(str);
    }


    private static void hackerDili(String str) {

        String arr[] = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.substring(i, i + 1);
            System.out.print(arr[i]);

        }

        System.out.println(); //bundan sonraki satirda gelenler birlesmesin diye

        for (int i = 0; i < str.length(); i++) {
            if (arr[i].contains("s")) {
                arr[i] = "5";
            }
            if (arr[i].contains("a")) {
                arr[i] = "4";
            }
            if (arr[i].contains("e")) {
                arr[i] = "3";
            }
            if (arr[i].contains("i")) {
                arr[i] = "1";
            }
            if (arr[i].contains("o")) {
                arr[i] = "1";
            }
            System.out.println(arr[i]);

        }

    }

}
