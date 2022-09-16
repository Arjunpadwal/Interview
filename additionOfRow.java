import java.io.*;
import java.util.*;

class program16
{
    public static void main(String arg[])
    {
            Scanner sobj = new Scanner(System.in);

			System.out.println("Enter the row: ");
            int irow=sobj.nextInt();
			
            System.out.println("Enter the coloumns: ");
            int iCol=sobj.nextInt();
			
			int i,j=0;
			int iSum=0;
			int Arr[][]=new int[irow][iCol];
			
			for(i=0; i<Arr.length; i++)
			{
				for(j=0; j<Arr[i].length; j++)
				{
					Arr[i][j]=sobj.nextInt();
				}
			}
			for(i=0; i<Arr.length; i++)
			{
				for(j=0; j<Arr[i].length; j++)
				{
					iSum=iSum+Arr[i][j];
				}
				System.out.println("Addition is:"+iSum);
				iSum=0;
				
			}
			
			

            
     }
}