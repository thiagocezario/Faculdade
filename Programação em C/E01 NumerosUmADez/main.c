#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[])
{
	//E1) Fa�a um programa que apresente os n�meros de 1 a 10, sendo que cada n�mero deve ser impresso em uma linha e os n�meros �mpares deslocados (\t) a direita.	
	int i = 0;
	
	for(i = 1; i < 11; i++)
	{
		if(i%2 == 0)
		{
			printf("%d\n", i);
		}
		else
		{
			printf("\t%d\n", i);
		}
	}
		
	return 0;
}
