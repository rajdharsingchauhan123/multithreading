package com.polymorphism;

public class Animal {
    public void animalsound(){
        System.out.println("the animal makes a sound");
    }

}
class pig extends Animal{
    public void animalsound(){
        System.out.println("The pig speak :wee wee");
    }
}
class cow extends Animal{
    public void animalsound(){
        System.out.println("The cow says: wow wow ");


    }
}
    class animalvoicedemo{
    public static void main(String[] args) {
        Animal myanimal=new Animal();
         myanimal =new pig();
        Animal mycow =new cow();
        myanimal.animalsound();
        myanimal.animalsound();
        mycow.animalsound();

    }
}