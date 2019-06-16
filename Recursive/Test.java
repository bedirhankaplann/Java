/*
  Recursive Fonksiyonlar, bir fonksiyonun kendi kendini cagirmasidir aslinda.
  Her döngü bir recursive fonksiyon olarak ve her recursive fonksiyon dongu
  olarak yazılabilir. Mesela, 1 den 10 a kadar olan sayıların toplamı döngü
  olarak.
  
  int toplam = 0; for (int i = 0; i < 10; i++) { toplam += i+1;
  System.out.println("Toplam: " + toplam + " i: " + i); //Adim adim görmek
  istiyorum. } System.out.println("Sonuc: " + toplam);
  
  Bunu recursive hale getirelim.
  
  public static int f(int x) //Fonksiyonumuz olsun. 
  { 
       //Bu fonksiyonun bir başlangıç değeri olacak. 
       //x in başlangıç değeri 0 ve 10 dan küçükken devam etsin. 
  
       if ( x == 10) 
           return 10; //Denklemin bittiği anlamındadır. 
       else 
           return x + f( x + 1 );
  
  //Yani, 
           f(0) = 0 + f(1) 
           f(1) = 1 + f(2)
           f(2) = 2 + f(3)....
           f(10) = 10 deyip return 10 diyecek ve geriye dogru
           f(10) lara 10 yazacak.
   }
*/

/* FIBONACI */
/* 1 1 2 3 5 8 13 ......*/

import java.util.Scanner;

public class Test 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Kacinci Adimi Hesaplamak Istersiniz : ");
        //Kacinci terim istenirse onu dondursun bize.
        int step = input.nextInt();

        Fibonacci fibonacci = new Fibonacci(step);
        System.out.println(step + ".adim = " + fibonacci.calcFibo(step));
        System.out.println("Adim adim gorursek;");
        for ( int i = 0 ; i <= step; i++)
        {
            System.out.println("f(" + i + ") = " + fibonacci.calcFibo(step));
        }

        /*
          adim = 5 ise
          f(4) + f(3) olacak ama f(3) ve f(4) bilinmiyo onun için önce onları bulacak.
          ( f(3) + f(2) ) + ( f(2) + f(1) ) hala bilinmeyen var ama f(1) = 1 dir.
          ((f(2) + f(1)) + (f(1) + f(0))) + ((f(1) + f(0) + f(1))) baştaki f(2) tekrar açacak.
          f(1) ve f(0) lara direk 1 verecek. Tümü f(0) ve f(1) e indikten sonra yukari dogru
          toplanacak ve sonucu dondurecek.
        */
        input.close();
    }
}