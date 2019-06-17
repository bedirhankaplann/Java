package Polymorphism;

public class Animal //Animal adinda bir superclass olusturuyoruz.
{
    private String name; //private bir name degiskeni ile ismini tutuyoruz.

    public Animal(String name) // Objeyi olustururken ismini referans alacak sekilde
    {                          // bir consturctor olusturuyoruz.
        this.name = name;
    }
    public String getName()  // Getter ve setterlarini olusturuyoruz.
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public void speak() //Tüm subclass lar için ortak olacak speak metodunu yazıyoruz.
    {                   //Tüm hayvanlar konusur aslinda.
        System.out.println("Animal konuşuyor.");
    }
}
