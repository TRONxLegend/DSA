  // InHeritance:

// public class Oops {
//     public static void main(String[] args) {
//         fish shark = new fish();
//         shark.eat();
//         shark.breathe();
//     }
// }
// class Animal{
//     // BASE CLASS;
//     String color; // Properties
//     void eat(){
//         System.out.println("food");
//     }
//     void breathe(){
//         System.out.println("Air");
//     }
// }
// // DERIVED CLASS;
// class fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swims In Water");
//     }
// }







// Multi Level Inheritance:
// public class Oops{
//     public static void main(String[] args) {
//         Dog Sheru = new Dog();
//         Sheru.breed();
//         Sheru.eat();
//         Sheru.Blood();
//         Sheru.breathe();
//     }
// }
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("Food");
//     }
//     void breathe(){
//        System.out.println("Air"); 
//     }
// }

// class Mammals extends Animal{
//     int legs;
//     void Blood(){
//         System.out.println("Cold Blooded Animals");
//     }
// }

// class Dog extends Mammals{
//     String breed;
//     void breed(){
//         System.out.println("German Sherferd Dog");
//     }
// }




// Hierarchial Inheritance:
// public class Oops{
//     public static void main(String[] args) {
//      fish nemo = new fish();
//      nemo.eat();
//      nemo.swim();
//      int fins = 2;
//      System.out.println(fins); 

//      Birds Mithu = new Birds();
//      Mithu.eat();
//      Mithu.fly();

//      Mammals Dogs = new Mammals();
//      Dogs.eat();
//      Dogs.blood();
//      int legs = 4;
//      System.out.println(legs);
//     }
// }
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("Food");
//     }
// }

// class fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("water");
//     }
// }

// class Birds extends Animal{
//     String feather;
//     void fly(){
//         System.out.println("fly in air");
//     }
// }

// class Mammals extends Animal{
//     int legs;
//     void blood(){
//         System.out.println("Clod Blooded Animal");
//     }
// }


// Compile time PolyMorphism --> Method Overloading

// public class Oops{
//     public static void main(String args[]){
//   Calculator calc = new Calculator();
//   System.out.println(calc.sum(1,2));
//   System.out.println(calc.sum((float)1.5,(float)2.5));
//   System.out.println(calc.sum(1,2,6));
//     }
// }

// class Calculator{
//     int sum(int a, int b){
//         return a+b;
//     }
//     float sum(float a, float b){
//         return a+b;
//     }
//     int sum(int a,int b,int c){
//         return a+b+c;
//     }
// }
    



// ABSTRACTIONS:

// public class Oops{
//     public static void main(String[] args) {
//      Dog d = new Dog();
//      d.eat();
//      d.walk();

//      Cat c = new Cat();
//      c.eat();
//      c.walk();
//     }
// }
// abstract class Animal{
//     void eat(){
//         System.out.println("Animals Eat Food");
//     }
//    abstract void walk();
// }

// class Dog extends Animal{
//     void walk(){
//         System.out.println("Dogs Walks");
//     }
// }

// class Cat extends Animal{
//     void walk(){
//         System.out.println("Cats Walks");
//     }
// }

// ABSTRACTION (CONSTRUCTOR):

// public class Oops{
//     public static void main(String[] args) {
//      Dog d = new Dog();
//      d.eat();
//      d.walk();
//      System.out.println(d.color); // Brown

//      Cat c = new Cat();
//      c.eat();
//      c.walk();
//     }
// }
// abstract class Animal{
//     String color;
//     Animal(){
//      color ="Brown";
//     }
//     void eat(){
//         System.out.println("Animals Eat Food");
//     }
//    abstract void walk();
// }

// class Dog extends Animal{
//     void changeColor(){
//         color = "Black";
//     }
//     void walk(){
//         System.out.println("Dogs Walks");
//     }
// }

// class Cat extends Animal{
//     void walk(){
//         System.out.println("Cats Walks");
//     }
// }


// INTERFACE:
// public class Oops {
//   public static void main(String[] args) {
//   queen q12 = new queen();
//   q12.move(); 
// }
// }
// interface chessplayer{
//     void move();
// }
// class queen implements chessplayer{
//     public void move(){
//         System.out.println("up,down,right,left(in all directions)");
//     }
// }
// class rook implements chessplayer{
//     public void move(){
//         System.out.println("up,down,right,left");
//     }
// }
// class king implements chessplayer{
//     public void move(){
//         System.out.println("up,down,right,left,diagnoal");
//     }
// }



