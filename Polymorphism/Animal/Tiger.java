package Polymorphism;

public class Tiger extends Animal // Animal sinifindan tureyen bir Tiger classımızı oluşturduk.
{
    public Tiger(String name) // Tiger nesnesinin adini referans seklinde alacak sekilde constructor
    {                         // olusturuyoruz. Aldıgımız referansı super ile superclass a gönderdiyoruz.
        super(name);
    }
   
    @Override           // Superclass taki speak metodunu burda yeniden düzenleyip kullanabilmek için
    public void speak() // Override ediyoruz.
    {
        System.out.println(getName() + " kükrüyor.");
    }
    
}