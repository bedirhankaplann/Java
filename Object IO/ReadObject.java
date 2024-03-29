import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Reading Objects...");

        FileInputStream fs = null;
        ObjectInputStream os = null;
        try 
        {
            fs = new FileInputStream("person.dat");
            os = new ObjectInputStream(fs);

            Person p1 = (Person) os.readObject();
            Person p2 = (Person) os.readObject();
            Person p3 = (Person) os.readObject();
            Person p4 = (Person) os.readObject();
            Person p5 = (Person) os.readObject();
            Person p6 = (Person) os.readObject();
            Person p7 = (Person) os.readObject();
            os.close();

            System.out.println(p1.toString() + "\n" + p2.toString() + "\n" + p3.toString() + "\n" + p4.toString() + "\n"
                    + p5.toString() + "\n" + p6.toString() + "\n" + p7.toString() + "\n");
            System.out.println("Finished.");

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
