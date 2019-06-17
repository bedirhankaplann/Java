package Polymorphism;

/*  
    Polymorphism yazılımdaki kod tekrarını önlemek, binlerce 
    objeye binlerce metod yazmamak için Superclass - subclass
    ilişkisi kullanılarak yazılımdaki kararlılığı ve bütünlüğü
    sağlamaktır. 
*/

public class Test 
{
    public static void main(String[] args) 
    {
        Animal animal = new Animal("Hayvan");  // Bir animal nesnesi olusturduk "Hayvan" isminde.
        Bird bird = new Bird ("Limon");        // Bir bird nesnesi olusturduk "Limon" isminde.
        Dog dog = new Dog("Karabaş");          // Bir dog nesnesi olusturduk "Karabas" isminde.
        Tiger tiger = new Tiger ("Kaplan");    // Bir tiger nesnesi olusturduk "Kaplan" isminde.

        animal.speak(); //animal classindaki speak metodlari çagrildi. Hayvan konusuyor.
        bird.speak();   //Limon konusuyor.
        dog.speak();    //Karabas havliyor.
        tiger.speak();  //Kaplan kukruyor.

        System.out.println("Animal Bir Tiger Gibi Çalışacak...");

        Animal animal2 = new Tiger("Kaplan"); //
        /*
         * Kaplanda bir hayvandır. Animal2 objemiz Tiger a göre çalışacak artık.
         * animal2.speak dediğimiz zaman aslında Tiger classındaki speak metodu
         * çalışacak.
         */
          animal2.speak();
          /*
            Bu polymorphism ne işimize yarıyor peki, polymorphism
            den yararlanmamış olsaydık her class icin ayrı bir speak
            metodu yazmamız gerekecekti. speak1, speak2, speak3.. gibi.
            Bunu ayrı bir metod olarak bu şekilde de yapabiliriz.
          */
          speaktry(new Dog("Max"));
          /*
            speaktry metodunu çağırarak parametre olarak yeni bir 
            obje verip çağırabiliriz. speaktry metodu Animal class
            nı ve speak metodunu kullanıyor. Tüm subclass lar Animal
            classından türediği için Animal ın objesiyle kullanılabilir.
          */
    }
    public static void speaktry(Animal animal)
    {
        animal.speak();
    }
}