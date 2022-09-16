#include<stdio.h>
#include<stdbool.h>
bool CheckPrime(int iNo)
{
	int icnt=0;
	for(icnt=2; icnt<=iNo; icnt++)
	{
		if((iNo%icnt)==0)
		{
			break;
		}
	}
	if(icnt==iNo)
	{
		return true;
	}
	else
	{
		return false;
	}
}
#include<stdbool.h>
int main()
{
	int ivalue=0;
	bool bRet;
	printf("Enter number:");
	scanf("%d",&ivalue);
	
	bRet=CheckPrime(ivalue);
	if(bRet==true)
	{
		printf("%d is prime number\n",ivalue);
	}
	else
	{
		printf("%d is not prime number\n",ivalue);
	}
	
	
	
	return 0;
}