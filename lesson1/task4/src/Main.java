public class Main {
   public static void main(String[] args) {
      Animal cat = new Cat("Barsik", 10);
      Animal dog = new Dog("Buldog", 10);
      cat.talk();
      dog.talk();
      // Write your solution here
   }


   public abstract static class Animal {
      public String name;
      public int age;
      public abstract void talk();
   }

   public static class Cat extends Animal {

      public Cat(String name, int age){
         this.name = name;
         this.age = age;
      }

      public void setName(String name){
         this.name = name;
      }

      public void setAge(int age){
         this.age = age;
      }

      @Override
      public void talk() {
         System.out.println("I am а cat, " + name);
      }
   }

   public static class Dog extends Animal {

      public Dog(String name, int age){
         this.name = name;
         this.age = age;
      }

      public void setName(String name){
         this.name = name;
      }

      public void setAge(int age){
         this.age = age;
      }

      @Override
      public void talk() {
         System.out.println("I am a dog, " + name);
      }
   }
}