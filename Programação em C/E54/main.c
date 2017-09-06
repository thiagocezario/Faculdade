#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int isBit(int nro, int nbit)
{
	int b = 0;
	if(nro >> nbit & 1)
	{
		return b = '1';
	}
	else
	{
		return b = '0';
	}
}

int main(int argc, char** argv)
{
	int nro;
	int i;
	int j;
	char bin[33];
	scanf("%d", &nro);
	
	for(i = 0, j = 31; i < 33,  j >= 0; i++, j--){
		bin[j] = isBit(nro, i);
	}
	
	printf("%s\n", bin);
	return 0;
}
