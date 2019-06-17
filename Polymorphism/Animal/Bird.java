package Polymorphism;

public class Bird extends Animal //Animal sinifindan tureyen bir Bird classımızı oluşturduk.
{
    public Bird(String name) // Bird nesnesinin adini referans seklinde alacak sekilde constructor
    {                        // olusturuyoruz. Aldıgımız referansı super ile superclass a gönderdiyoruz.
        super(name);
    }
    @Override           //Superclass taki speak metodunu burda yeniden düzenleyip kullanabilmek için
    public void speak() //Override ediyoruz.
    {
        System.out.println(getName() + " ötüyor.");
    }
    
}