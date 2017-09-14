#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
char SubStringCopy(char str[], int position, int nchar){
	
}


int main(int argc, char *argv[]) {
	char str[30];
	int position, int nchar;
	
	printf("Entre com uma string: ");
	gets(str);
	
	printf("Entre com a posicao que quer copiar: ");
	scanf("%d", &position);
	
	printf("Entre com quantos caracteres quer copiar: ");
	scanf("%d", &nchar);
	
	printf("Substring copiada:\n%s", SubStringCopy(str, position, nchar));
	
	return 0;
}
