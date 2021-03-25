import java.util.Scanner;
import java.lang.Math;
class Main {

public static void main(String[] args){
Scanner nice = new Scanner(System.in);


System.out.println("Before you type in your numbers, please press enter one time. Then enter your Length, Width, Height, and Radius in that order. Don't forget to press enter after each number you enter in:");


    String name = nice.nextLine();

 int l = nice.nextInt();
  int w = nice.nextInt();
   int h = nice.nextInt();
   int r = nice.nextInt();


Box b1 = new Box(l, w, h);
Pyramid p1 = new Pyramid(l, w, h);
Sphere s1 = new Sphere(r);
System.out.println("The volume for box is " + b1.calcVol());
System.out.println("The surface area for box is " + b1.calcSurf());

System.out.println("The volume for pyramid is " + p1.calcVol());

System.out.println("The surface area for pyramid is " + p1.calcSurf());

System.out.println("The volume for sphere is " + s1.calcVol());

System.out.println("The surface area for sphere is " + s1.calcSurf());

}
}
