package de.neuefische;

public class Main {

    public static void main(String[] args) {

        Person pommes = new Person("Müller", 35, "1234567890", true);
        Person pommes2 = new Person("Müller", 35, "1234567890", true);
        Person rotWeiss = new Person("Bauer", 23, "1234567890");


        Person[] phonebook = {pommes, rotWeiss};

        addPerson(pommes);
        addPerson(rotWeiss);

        System.out.println(pommes.equals(pommes2));
    }

    public static void addPerson(Person currywurst){
        System.out.println(currywurst.hashCode());
    }
}