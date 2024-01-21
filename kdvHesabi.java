import java.util.Scanner;
public class kdvHesabi {
public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double A;

        System.out.print("KDV'siz Fiyat Giriniz: ");
        A = input.nextDouble();

        double kdvx = A * 18;
        double  kdvli = kdvx / 100;

        System.out.println("KDV'siz tutar: " + A);

        System.out.println("KDV tutarı: " + kdvli);

        double topfiyat = A + kdvli;

        System.out.print("Toplam Fiyat: " + topfiyat);

    }
}
