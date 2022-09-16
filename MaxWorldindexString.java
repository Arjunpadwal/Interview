import java.io.*;
import java.util.*;

class program15
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sobj.nextLine();
		
		String newstr=str.replaceAll("\\s+"," ");
		String newstr2=newstr.trim();
		
		String Arr[]=newstr2.split(" ");
		
		int iMax=0;
		int ipos=0;
		for(int i=0; i<Arr.length; i++)
		{
			if(Arr[i].length()>iMax)
			{
				iMax=Arr[i].length();
				ipos=i;
			}
		}
		
		System.out.println("Largest worlds Length is:"+iMax);
		System.out.println("Largest worlds in string is:"+Arr[ipos]);
     }
}