/*

WHILE döngüsü ile ATM Programı
İşlemler:
1 - Bakiye Öğrenme
2 - Para Çekme
3 - Para Yatırma
Q - Çıkış

*/

import java.util.Scanner;

public class AtmIslemleri
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double bakiye = 1000.0;
        String islemler = "1.İşlem: Bakiye Sorgulama\n"
                + "2.İşlem: Para Çekme\n"
                + "3.İşlem: Para Yatırma\n"
                + "4.İşlem Vadeli Hesap Faiz Hesaplama\n"
                + "Cıkış Için Q/q ya Basınız";
        System.out.println("***************************");
        System.out.println(islemler);
        System.out.println("***************************");

        while(true) //Amaç q ya basana kadarçalışması.
        {
            System.out.print("\nİşleminizi Seçiniz: ");
            String islem = input.nextLine();

            if( islem.equals("q") || islem.equals("Q"))
            {
                System.out.println("\nHESAPTAN ÇIKILIYOR...");
                break;
            }
            else if (islem.equals("1"))
            {
                System.out.println("Bakiyeniz : " + bakiye + " ₺");
            }
            else if ((islem.equals("2")))
            {
                System.out.print("Çekmek İstediğiniz Tutar = ");
                double tutar = input.nextDouble();
                input.nextLine();

                if( bakiye - tutar < 0)
                {
                    System.out.println("Yeteli Bakiye Yok ! Bakiyeniz = " + bakiye + " ₺");
                }
                else if(tutar % 10 != 0)
                {
                    System.out.println("Yalnızca 10 ₺ Ve Katlarını Çekebilirsiniz.");
                }
                else
                {
                    bakiye -= tutar;
                    System.out.println(tutar + " ₺ Başarıyla Çekilmiştir.\nYeni Bakiyeniz = " + bakiye + " ₺");
                }
            }
            else if (islem.equals("3"))
            {
                System.out.print("Yatırmak İstediğiniz Tutar = ");
                double tutar = input.nextInt();
                input.nextLine();

                if ( tutar % 10 != 0 )
                {
                    System.out.println("Yalnızca 10 ₺ Ve Katlarını Yatırabilirsiniz.");
                }
                else
                {

                    bakiye += tutar;
                    System.out.println("Yeni Bakiyeniz = " + bakiye + "₺");
                }

            }
            else if (islem.equals("4"))
            {
                System.out.println("Bakiyeniz = " + bakiye + " ₺");
                System.out.print("Yatırmak İstediğiiniz Tutar = ");
                int tutar = input.nextInt();

                if( bakiye - tutar < 0)
                {
                    System.out.println("Yeteli Bakiye Yok ! Bakiyeniz = " + bakiye + " ₺");
                }
                else
                {
                    bakiye -= tutar;
                    System.out.println("İşlem Sonundaki Bakiyeniz = " + bakiye);
                    System.out.println("Vadeli Hesap Bakiyeniz = " + tutar);

                    System.out.print("Kaç Yıl Vade İle Yatırmak İstiyorsunuz : ");
                    int vade = input.nextInt();
                    double toplamPara = tutar;
                    double faizOrani = 0.06;

                    for( int i = 1; i <= vade; i++)
                    {
                        toplamPara = (toplamPara * faizOrani) + toplamPara;
                        System.out.println(i + ". Yılın Sonunda Toplam Para= " + toplamPara);
                    }
                }
            }

            else
            {
                System.out.println("Geçersiz İşlem. Tekrar Deneyiniz..");
            }
        }
        input.close();
    }
}