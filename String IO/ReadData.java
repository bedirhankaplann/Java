import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class ReadData
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("writedata.txt")
        Scanner input = new Scanner(file);
        //Okuma yapacagiz ama klavyeden degil file dan yapacagız. (File = writedata.txt)

        while ( input.hasNext() ) //Kelime sonuna kadar oku diyoruz. hasNextLine ise satir sonuna kadar.
        {
            String firstName = input.next(); //İlk okuduğunu firstName degiskenine atadi.
            String lastName = input.next(); // Sonrakini  lastName degiskenine atadi.
            int year = input.nextInt(); // Sonuncusunu ise year degiskenine atadi.

            System.out.println(firstName + " " + lastName + " " + year); //Okuduklarımızı ekrana yazıyoruz.
        }
        input.close(); // Okumayi kapatiyoruz.
    }
}
