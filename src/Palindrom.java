import java.util.Scanner;

import static java.lang.Math.floor;

public class Palindrom
{
     public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        String aspal = in.nextLine();
        char[] aspala = aspal.toCharArray();
        short result = 0;
        int symb = 0;

       do
       {
           if(aspala[symb] == aspala[aspal.length()-symb-1])
           {
               result++;
               if (result == floor(aspal.length()/2))
                System.out.println("It's a pollyndrom!!!");
           }
           else
           {
               System.out.println("It's NOT!");
               break;
           }
           symb++;

        } while (symb < aspal.length()/2);
    }
 }
