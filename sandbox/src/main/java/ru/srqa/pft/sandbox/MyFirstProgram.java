package ru.srqa.pft.sandbox;

public class MyFirstProgram {
	
   public static void main (String[]args){
       hello("World");
       double len = 5;
       Square s = new Square(5);
       System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

     double a = 4;
     double b = 6;
     Rectangle r = new Rectangle(4, 6);
     System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
   }

     public static void hello (String somebody) {
          System.out.println("Hello, " + somebody + "!");
     }


}