import java.io.FileNotFoundException; //File islemleri icin kutuphanelerimiz.
import java.io.File;
import java.io.PrintWriter; //Dosyaya yazmak icin gerekli kutuphanemiz.

public class WriteData 
{
    //Dosya olusturma-okuma-yazma islemi yapacagımız icin throws FileNotFoundException ekledik.
    public static void main(String[]args) throws FileNotFoundException
    {
        File file = new File("writedata.txt"); //Dosyayı gösteriyoruz, bildiriyoruz.
        if ( file.exists() ) //Daha onceden boyle bir dosya olusturulmus mu bakıyoruz. Var ise,
        {
            System.out.println("File already exists."); //Ekrana zaten var diyoruz.
            System.exit(1); //Ve cikis yapiyoruz.
        }
        
        PrintWriter pWr = new PrintWriter(file); //Olusturdugumuz dosyaya yazmaya baslayacagimizi belirtiyoruz..
        pWr.print("Bedirhan KAPLAN "); //print ve println komutları ile dosyaya yazıyoruz.
        pWr.println(95);
        pWr.print("Sümeyye AKAY ");
        pWr.println(96);
        pWr.close(); //Dosyaya yazmayi kapatiyoruz.
    }
}
