import java.util.Scanner;

public class FizzBuzzExp {

    //    Problemde, verilen bir sayı n için, 1'den n'e kadar olan her tam sayı için belirli kurallara göre çıktı üretilmesi isteniyor:
    //
//    i hem 3'ün hem de 5'in katıysa, "FizzBuzz" yazdır.
//    i sadece 3'ün katıysa, "Fizz" yazdır.
//    i sadece 5'in katıysa, "Buzz" yazdır.
//    i ne 3'ün ne de 5'in katıysa, i'yi kendisi olarak yazdır.

    public static void fizzBuzz(int n) {


        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");

            } else if (i % 3 == 0) {
                System.out.println("Fizz");


            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt();
        fizzBuzz(n);
        scanner.close();

    }

}

