/*3. Write a program in JAVA to find Size of fundamental data types.   
Sample Output:
Find Size of fundamental data types :
------------------------------------------
The sizeof(char) is : 1 bytes
The sizeof(short) is : 2 bytes
The sizeof(int) is : 4 bytes
The sizeof(long) is : 8 bytes
The sizeof(long long) is : 8 bytes
The sizeof(float) is : 4 bytes
The sizeof(double) is : 8 bytes
The sizeof(long double) is : 16 bytes
The sizeof(bool) is : 1 bytes
*/
import java.util.*;
class prq3
{
 public static void main (String[] args)
 {
  System.out.println("The sizeof(char) is :" + (Integer.SIZE/1) + " bytes.");
  System.out.println("The sizeof(short) is : " + (Integer.SIZE/2) + " bytes.");
  System.out.println("The sizeof(int) is :" + (Integer.SIZE/4) + " bytes.");
  System.out.println("The sizeof(long) is :" + (Integer.SIZE/8) + " bytes.");
  System.out.println("The sizeof(long long) is :" + (Integer.SIZE/8) + " bytes.");
  System.out.println("The sizeof(float) is :" + (Integer.SIZE/4) + " bytes.");
  System.out.println("The sizeof(double) is :" + (Integer.SIZE/8) + " bytes.");
  System.out.println("The sizeof(long double) is :" + (Integer.SIZE/16) + " bytes.");
  System.out.println("The sizeof(bool) is :" + (Integer.SIZE/1) + " bytes.");
  }
}
