package de.neuefische;

public class Main {

    public static void main(String[] args) {

        Person pommes = new Person("Müller", 35, "1234567890", true);
        Person rotWeiß = new Person("Bauer", 23, "1234567890");


        Person[] phonebook = {pommes, rotWeiß};

        addPerson(pommes);
        addPerson(rotWeiß);
    }

    public static void addPerson(Person currywurst){
        System.out.println(currywurst.name);
        System.out.println(currywurst.age);
        System.out.println(currywurst.isAlive);
        System.out.println(currywurst.name);
    }
}