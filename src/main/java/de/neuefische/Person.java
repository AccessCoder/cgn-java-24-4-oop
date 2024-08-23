package de.neuefische;

import java.util.Objects;

public class Person {

   //Information Hiding
   private String name;
   private int age;
   private String phone;
   private boolean alive;

   //Constructor
   public Person(String name, int age, String phone, boolean isAlive){
      this.name = name;
      this.age = age;
      this.phone = phone;
      this.alive = isAlive;
   }
   //Method Overloading
   public Person(String name, int age, String phone){
      this.name = name;
      this.age = age;
      this.phone = phone;
      this.alive = true;
   }

   //GETTER -> Lesezugriff für Datenfelder
   public String getName(){
      return name;
   }
   public String getPhone(){
      return phone;
   }
   public int getAge(){
      return age;
   }
   public boolean isAlive(){
      return alive;
   }

   //SETTER -> Schreibzugriff
   public void setName(String name){
      this.name = name;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public void setAlive(boolean alive) {
      this.alive = alive;
   }

   @Override
   public String toString(){
      return "Person{name= "+name +
              ", age= "+age+
              ", phone= "+phone+
              ", alive? = "+alive;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Person person = (Person) o; //Typecasting
      return age == person.age && alive == person.alive && Objects.equals(name, person.name) && Objects.equals(phone, person.phone);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, age, phone, alive);
   }

   public void sayHello(){
      System.out.println("Hello!");
   }
}
