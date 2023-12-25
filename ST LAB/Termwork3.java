import java.util.*;

public class Termwork3 {
    public static  void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Values of A,B,C respectively");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a <= 0 || b <= 0 || c <= 0 || a > 10 || b > 10 || c > 10) {
            System.out.println("Not In a Range");
        }

         if(a + b <= c || a + c <= b || b + c <= a){
             System.out.println("NOT a Triangle");
         }else {
             System.out.println("It's Triangle");
             if (a == b && b == c) {
                 System.out.println("Equilateral triangle");
             } else if (a == b || a == c || c == b) {
                 System.out.println("Isosceles Triangle");
             } else {
                 System.out.println("Scelene Triangle");
             }
         }
    }
}
//outputs range need to be changed be carefull when giving output ranges

// Valid triangles:
// Equilateral: (5, 5, 5)
// Isosceles: (2, 2, 4), (4, 5, 5)
// Scalene: (3, 4, 5), (6, 7, 8)

// Invalid triangles:
// Sides less than 1: (0, 1, 2)
// Sides greater than 10: (5, 11, 8)
// Violating triangle inequality: (1, 1, 11), (5, 2, 2)

// Degenerate triangles:
// (1, 1, 0)
