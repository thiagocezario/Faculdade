#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int i = 0;
	int a = 0;
	int b = 0;
	int c = 0;
	
	scanf("%d", &a);		//passa a variavel por referencia, getch pega o código da tecla
	for(i = 0; i<10; i++)
	{
		if(b > a && b > c)
		{
			c = b;
		}
		else if(a > b && a > c)
		{
			c = a;
		}
		scanf("%d", &a);
	}
	printf("%d", c);	
	return 0;
}
