import java.io.*;
import java.util.*;

class pr1
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
		System.out.println("Enter first number:");
		int ivalue1=sobj.nextInt();
		
		System.out.println("Enter Second number:");
		int ivalue2=sobj.nextInt();
		
										//ivalue1=25	//ivalue2=23
		ivalue1=ivalue1+ivalue2;		//25+23
		
		ivalue2=ivalue1-ivalue2;		//48-23=25
		
		ivalue1=ivalue1-ivalue2;		//48-25=23
		
		
		System.out.println(ivalue1);
		System.out.println(ivalue2);
		
		
		
		
      }
}