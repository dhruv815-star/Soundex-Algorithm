import java.util.Scanner;

class SoundexAlgo
{
    static int digitToNum(char c)
    {
        //rules for replacing characters with codes
        if(c == 'A'||c == 'E'||c == 'I'||c == 'O'||c == 'U'||c == 'H'||c == 'W'||c == 'Y')
            return 0;
        else if (c == 'B'||c == 'P'||c == 'F'||c == 'V')
            return 1;
        else if (c=='D'||c=='T')
            return 3;
        else if (c=='L')
            return 4;
        else if (c=='M'||c=='N')
            return 5;
        else if (c=='R')
            return 6;
        else 
            return 2;
    }
    public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = ob.nextLine();
        str = str.toUpperCase();

        //First letter removal and appending it as the first character of the output string
        char front = str.charAt(0);
        StringBuilder strBuild = new StringBuilder();
        strBuild.append(front);

        //Converting letters to digits
        for(int i=1; i<str.length(); i++)
        {
            strBuild.append(digitToNum(str.charAt(i)));
        }

        //Remove adjacent duplicates
        for(int i=1; i<strBuild.length(); i++)
        {
            if(strBuild.charAt(i) == strBuild.charAt(i-1))
            {
                strBuild.replace(i-1, i,"");
            }
        }

        //Dropping 0s from the string 
        for(int i=1; i<strBuild.length(); i++)
        {
            if(strBuild.charAt(i) == '0')
            {
                strBuild.replace(i, i+1,"");
            }
        }

        //sanity checking
        if(strBuild.length()<4)
        {
            //append 0s at the end to make exactly 3 digits
            while(strBuild.length() != 4)
            {
                strBuild.append(0);
            }
            System.out.println("Phonetic value: " + strBuild.toString());
        }
        else if (strBuild.length()>4)
        {
            //take only first 3
            StringBuilder strBuild1 = new StringBuilder();
            for(int i=0; i<4; i++)
            {
                strBuild1.append(strBuild.charAt(i));
            }
            System.out.println("Phonetic value: " + strBuild1.toString());
        }
        else
        {
            System.out.println("Phonetic value: " + strBuild.toString());
        }
    }
}