#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	float a, parteDecimal;
	int parteInteira;
	
	printf("Entre com um valor decimal: ");
	scanf("%f", &a);
	
	parteInteira = (int)a;
	parteDecimal = a - parteInteira;
	
	if(parteDecimal > .5){
		parteInteira++;
	}
	
	printf("Numero %.2f arredondado: %d\n", a, parteInteira);
	
	return 0;
}
