package Polymorphism;

public class Dog extends Animal // Animal sinifindan tureyen bir Dog classımızı oluşturduk.
{
    public Dog(String name)   // Dog nesnesinin adini referans seklinde alacak sekilde constructor
    {                         // olusturuyoruz. Aldıgımız referansı super ile superclass a gönderdiyoruz.
        super(name);
    }

    @Override           // Superclass taki speak metodunu burda yeniden düzenleyip kullanabilmek için
    public void speak() // Override ediyoruz.
    {
        System.out.println(getName() + " havlıyor.");
    }

    
}