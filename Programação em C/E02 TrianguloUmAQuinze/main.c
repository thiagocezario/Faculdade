#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
//	E2) Faça um programa que apresente os números de 1 a 15 na forma de um triangulo, como apresentado a seguir:

//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15

//Utilize nesse exercício apenas 1 laço
	
	int a = 1;
	int b = 1;
	int c = 1;
	
	for(a = 1; a < 16; a++)
	{
		b = 1;
		while(b <= a && c < 16)
		{
			printf("%d ",c);
			b++;
			c++;
		}
		printf("\n");
	}
	
	return 0;
}
