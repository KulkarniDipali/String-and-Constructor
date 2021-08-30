/*2. Write a program in JAVA to print the sum of two numbers.   
Sample Output:
Print the sum of two numbers :
-----------------------------------
The sum of 29 and 30 is : 59
*/
import java.util.Scanner;
class prq2
{
 public static void main (String args[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Print the sum of two numbers:");
 int x = sc.nextInt();
 int y = sc.nextInt();
 int sum = x + y;
 System.out.printf("The sum %d and %d is:"+sum,x,y);
}
}