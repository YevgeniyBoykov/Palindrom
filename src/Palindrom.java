import java.util.Scanner;
import static java.lang.Math.floor;

public class Palindrom
{
     public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        String aspal = in.nextLine();

        int res = Palindrom(aspal);
    }

    private static int Palindrom(String stroka)
    {
        short result = 0;
        int symb = 0;

        do
        {
            if(stroka.charAt(symb) == stroka.charAt(stroka.length()-symb-1))
            {
                result++;
                if (result == floor(stroka.length()/2))
                {
                    System.out.println("It's a pollyndrom!!!");
                    break;
                }
            }
            else
            {
                System.out.println("It's NOT!");
                break;
            }
            symb++;

        } while (symb < stroka.length()/2);
        return 0;
    }
 }
