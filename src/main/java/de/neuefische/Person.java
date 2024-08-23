package de.neuefische;

public class Person {

   public String name;
   public int age;
   public String phone;
   public boolean isAlive;

   //Constructor
   public Person(String name, int age, String phone, boolean isAlive){
      this.name = name;
      this.age = age;
      this.phone = phone;
      this.isAlive = isAlive;
   }

   public Person(String name, int age, String phone){
      this.name = name;
      this.age = age;
      this.phone = phone;
      this.isAlive = true;
   }
}
