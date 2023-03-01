import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        String [] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","a","b","c"};

        System.out.println("Are we encrypting a cipher? (opposite: decryption) (Y/N)");
        String n = input.nextLine();
        if(n.equalsIgnoreCase("Y")){
            System.out.println("What is the message to be encrytped? (no spaces)");
            String mes = input.nextLine();
            mes = mes.toLowerCase();

            String meme = "";
            System.out.println("Encrypted cipher: ");
            for (int lcv = 0; lcv < mes.length(); lcv++)
            {
                meme = mes.substring(lcv, lcv + 1);
                int code = 0;
                if (meme.equals("a")){ code = 0;}
                if (meme.equals("b")){ code = 1;}
                if (meme.equals("c")){ code = 2;}
                if (meme.equals("d")){ code = 3;}
                if (meme.equals("e")){ code = 4;}
                if (meme.equals("f")){ code = 5;}
                if (meme.equals("g")){ code = 6;}
                if (meme.equals("h")){ code = 7;}
                if (meme.equals("i")){ code = 8;}
                if (meme.equals("j")){ code = 9;}
                if (meme.equals("k")){ code = 10;}
                if (meme.equals("l")){ code = 11;}
                if (meme.equals("m")){ code = 12;}
                if (meme.equals("n")){ code = 13;}
                if (meme.equals("o")){ code = 14;}
                if (meme.equals("p")){ code = 15;}
                if (meme.equals("q")){ code = 16;}
                if (meme.equals("r")){ code = 17;}
                if (meme.equals("s")){ code = 18;}
                if (meme.equals("t")){ code = 19;}
                if (meme.equals("u")){ code = 20;}
                if (meme.equals("v")){ code = 21;}
                if (meme.equals("w")){ code = 22;}
                if (meme.equals("x")){ code = 23;}
                if (meme.equals("y")){ code = 24;}
                if (meme.equals("z")){ code = 25;}

                System.out.print(alpha[code + 3]);
            }
        }
        else
        {
            System.out.println("What is the message to be decrytped? (no spaces)");
            String mes = input.nextLine();
            mes = mes.toLowerCase();

            String meme = "";
            System.out.println("Decrypted cipher: ");
            for (int lcv = 0; lcv < mes.length(); lcv++)
            {
                meme = mes.substring(lcv, lcv + 1);
                int code = 0;
                if (meme.equals("a")){ code = 26;}
                if (meme.equals("b")){ code = 27;}
                if (meme.equals("c")){ code = 28;}
                if (meme.equals("d")){ code = 3;}
                if (meme.equals("e")){ code = 4;}
                if (meme.equals("f")){ code = 5;}
                if (meme.equals("g")){ code = 6;}
                if (meme.equals("h")){ code = 7;}
                if (meme.equals("i")){ code = 8;}
                if (meme.equals("j")){ code = 9;}
                if (meme.equals("k")){ code = 10;}
                if (meme.equals("l")){ code = 11;}
                if (meme.equals("m")){ code = 12;}
                if (meme.equals("n")){ code = 13;}
                if (meme.equals("o")){ code = 14;}
                if (meme.equals("p")){ code = 15;}
                if (meme.equals("q")){ code = 16;}
                if (meme.equals("r")){ code = 17;}
                if (meme.equals("s")){ code = 18;}
                if (meme.equals("t")){ code = 19;}
                if (meme.equals("u")){ code = 20;}
                if (meme.equals("v")){ code = 21;}
                if (meme.equals("w")){ code = 22;}
                if (meme.equals("x")){ code = 23;}
                if (meme.equals("y")){ code = 24;}
                if (meme.equals("z")){ code = 25;}

                System.out.print(alpha[code - 3]);
            }
        }
    }

}
