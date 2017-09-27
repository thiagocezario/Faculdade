#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char num[10];
	int i = 0;
	int nro = 0;
	int start = 0;
	int a = 1;
	
	printf("Entre com um numero: ");
	gets(num);
	
	if(num[0] == '-'){
		start = 1;
		a = -1;
	}
	
	for (i = start; num[i] != '\0'; i++) {
    	nro = a*nro * 10 + num[i] - '0';
	}
	
	printf("String '%s' e inteiro '%d'", num, nro);
	
	return 0;
}
