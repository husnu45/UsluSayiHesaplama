import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner getData = new Scanner(System.in);

        System.out.print("Taban Sayısını Giriniz : ");

        int tabanSayisi = getData.nextInt();

        System.out.print("Üs Sayısını Giriniz : ");

        int usSayi = getData.nextInt();

        int result = 1;

        for (int i = 1; i <= usSayi; i++) {

            result *= tabanSayisi;


            System.out.println(tabanSayisi + "^" + usSayi + " = " + result);

        }

    }

}
