#include <stdio.h>
#include <stdlib.h>

/* Fa�a uma fun��o isBit que receba dois par�metros (nro e bit), a fun��o deve retornar
FALSO (0) se o n-bit estiver com valor 0 ou, no caso contr�rio, retornar VERDADEIRO. */

int isBit(int nro, int nbit)
{
	int b = 0;
	if(nro >> nbit & 1)
	{
		return b = 1;
	}
	if(nro >> nbit & 0)
	{
		return b = 0;
	}
}

int main(int argc, char** argv)
{
	int nro = 0x01;
	int nbit = 0x00;
	
	scanf("%d", &nro);
	scanf("%d", &nbit);
	
	printf("isBit(%d,%d) = %d\n", nro, nbit, isBit(nro, nbit));
	return 0;
}
