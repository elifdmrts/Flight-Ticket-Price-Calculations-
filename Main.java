import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mesafe, fıyat, yasIndrm, tıpIndırım;
        int yas, yolculukTıpı;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesafeyi KM Cinsinden Giriniz: ");
        mesafe = scanner.nextDouble();
        System.out.print("Yaşınızı Giriniz: ");
        yas = scanner.nextInt();
        System.out.println("Yolculuk Tipini Seçiniz:\n1-)Tek Yön\n2-)Gidiş-Dönüş");
        yolculukTıpı = scanner.nextInt();
        fıyat = mesafe * 0.10;

        if (yas < 12) {
            yasIndrm = (fıyat) * (0.5);
            fıyat = fıyat - yasIndrm;
            
        } else if (yas > 12 && yas < 24) {
            yasIndrm = (fıyat) * (0.1);
            fıyat = fıyat - yasIndrm;
           
        } else if (yas > 65) {
            yasIndrm = (fıyat) * (0.3);
            fıyat = fıyat - yasIndrm;
           
        }

        if (mesafe<0 || yas<0 ){
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }
        if (yolculukTıpı == 2) {
            tıpIndırım = fıyat * (0.2);
            fıyat = (fıyat - tıpIndırım)*2;
            System.out.println("Toplam Tutar: " + fıyat + "TL");
        } else if (yolculukTıpı != 1 && yolculukTıpı != 2) {
            System.out.println("Hatalı Veri Girdiniz");
            return;
        } else System.out.println("Toplam Tutar: " + fıyat + "TL");
    }
}

