package day1;

public class Lesson6 {
   /* 6. Объявите переменную типа int, имя переменной - k. Присвойте этой переменной какую-нибудь цифру от 1 до 9.
    Используя цикл на ваше усмотрение (for или while), выведите в консоль таблицу умножения для этой цифры в следующем формате:
     1 x k = …
2 x k = …
3 x k = …
……
9 x k = …
*/
   public static void main(String[] args) {
       int k = 8;
       for (int i = 1; i <= 9; i++) {
           System.out.println(i + " x " + k + " = " + i * k);
//           System.out.print(i);
//           System.out.print(" x ");
//           System.out.print(k);
//           System.out.print(" = ");
//           System.out.print(i * k);
//           System.out.println();


       }



   }
}
