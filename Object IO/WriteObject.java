import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject 
{

    public static void main(String[] args) throws Exception 
    {
        System.out.println("Writing Objects...");
        Person person1 = new Person(1, "Ahmet");
        Person person2 = new Person(2, "Ali");
        Person person3 = new Person(3, "Ayse");
        Person person4 = new Person(4, "Veli");
        Person person5 = new Person(5, "Yıldız");
        Person person6 = new Person(6, "Eymen");
        Person person7 = new Person(7, "Efe");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);

        FileOutputStream fs = null;
        ObjectOutputStream oos = null;
        try 
        {
            fs = new FileOutputStream("person.dat");
            oos = new ObjectOutputStream(fs);

            oos.writeObject(person1);
            oos.writeObject(person2);
            oos.writeObject(person3);
            oos.writeObject(person4);
            oos.writeObject(person5);
            oos.writeObject(person6);
            oos.writeObject(person7);

            System.out.println("\nFinished.");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
