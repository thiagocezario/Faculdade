#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char nome[30];
	int i = 0;
	int size = 0;

	gets(nome);
	printf("Nome digitado: %s\n", nome);
	
	while(nome[i] != '\0'){
		if((nome[i] >='a' && nome[i] <= 'z') || (nome[i] >= 'A' && nome[i] <= 'Z'))
		size++;
		i++;
	}
	printf("O tamanho eh: %d\n", size);
	
	return 0;
}
