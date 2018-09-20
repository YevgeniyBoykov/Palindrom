import java.util.Scanner;

import static java.lang.Math.rint;

public class Palindrom
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        String aspal = in.nextLine();
        char[] aspala = aspal.toCharArray();
        short result = 0;

        for(int symb = 0; symb < aspal.length()/2; symb++)
        {

                if(aspalinom (aspala[symb], aspala[aspal.length()-symb-1])==1)
                {
                    result++;
                }

        }

        if (result == rint(aspal.length()/2))
            System.out.println("It's a pollyndrom!!!");
        else
            System.out.println("It's NOT!");

    }

    private static int aspalinom(char first, char second)
    {
        if(first == second)
            return 1;
        else
            return 0;
    }

}
