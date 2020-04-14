// Java program to find Gravitational force. (F = 6.67x10^-11) 

import java.util.*;
public class GravitationalForce{
public static void main (String args[]){
double G = 6.67*(Math.pow(10,-11));
System.out.println ("Enter the values of m1,m2 and r respectively. ");
Scanner s = new Scanner (System.in);
int m1 = s.nextInt();
int m2 = s.nextInt();
int r = s.nextInt();
double F = (G*m1*m2) / (Math.pow(r,2));
System.out.println ("The value of F = " + F); 
}
} 