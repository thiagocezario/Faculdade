#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char texto1[40];
	char texto2[40];
	int i;
	
	printf("Entre com uma string: ");
	gets(texto1);
	
	for (i = 0; i < 40; i++){
		texto2[i] = texto1[i];
	}
	
	printf("String 1:\n%s\nString 2:\n%s\n", texto1, texto2);
	
	return 0;
}
