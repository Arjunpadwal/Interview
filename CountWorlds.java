import java.io.*;
import java.util.*;

class program15
{
    public static void main(String arg[])
    {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the string : ");
            String str = sobj.nextLine();

            String newstr = str.replaceAll("\\s+"," ");	//replaseAll ha multiple space in string madhle single space madhy convert karat
            String newstr2 = newstr.trim();		//first and last che white spaces remove karato

            String arr[] = newstr2.split(" ");		//

            System.out.println("Number of words are : "+arr.length);
     }
}