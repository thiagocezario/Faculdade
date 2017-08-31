#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int num1=0;
	int num2=0;
	int resto=0;
	int result = 0;
	
	scanf("%d", &num1);
	scanf("%d", &num2);
	
	if(num1 > num2)
	{
		result = num1/num2;
		resto = num1%num2;
		num1 = num2;
		num2 = resto;
		while(resto != 0)
		{
			resto = num1%num2;
			result = num1/num2;
			num1 = num2;
			if(resto != 0)
			{
				num2 = resto;
			}
		}
		printf("%d", num2);
	}
	else if(num1 < num2)
	{
		result = num2/num1;
		resto = num2%num1;
		num2 = num1;
		num1 = resto;
		while(resto != 0)
		{
			resto = num2%num1;
			result = num2/num1;
			num2 = num1;
			if(resto != 0)
			{
				num1 = resto;
			}
		}
		printf("%d", num1);
	}
	return 0;
}
