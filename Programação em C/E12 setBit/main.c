#include <stdio.h>
#include <stdlib.h>

/* Fa�a uma fun��o setBit que receba dois par�metros (nro e bit), a fun��o deve modificar o
valor de nro de tal forma que o n-bit seja modificado para 1 e retornar o novo valor */

int setBit(int nro, int nbit)
{
	return nro | (0x01 << nbit);
	/*essa parte vai deslocar o bit 1 (0001) para a esquerda o nbit vezes, se nbit for 1, ele vai deslocar 1 vez
	transformando 1 em 2 (0010), com isso � feita a opera��o de OR com o valor do nro, por exemplo, se nro for 5
	(0101), e nbit for 3, teremos 0101 | 1000, oq resultaria em 1101	0101
																		1000
																	    ----
																		1101	*/
}

int main(int argc, char** argv)
{
	int nro = 0x00;
	int nbit = 0x00;
	
	scanf("%d", &nro);
	scanf("%d", &nbit);
	printf("setBit(%d,%d) = %d\n", nro, nbit, setBit(nro, nbit));
	return 0;
}
