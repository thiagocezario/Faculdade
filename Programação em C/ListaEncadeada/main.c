#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define LIST_SIZE 80
typedef struct _CELL {
	char num[LIST_SIZE];
	struct _CELL *prox;
} CELL;


int main (int argc, char *argv[]){
	char aux[LIST_SIZE];
	CELL *raiz = NULL,
	*novo,
	*tmp;
	
	do{
		printf("Entre com um numero, 0 encerra");
		scanf("%d", &aux);
		if(aux[0] != 0){
			novo = (CELL *)malloc(sizeof(CELL));
			if(novo != NULL){
				strcpy(novo->num, aux);
			}
		}
	}while (aux != 0);
}































/*
int main(int argc, char *argv[]) {
	int aux;
	CELL *raiz = NULL,
	*novo,
	*tmp;
	do {
		printf("Informe o nome: ");
		gets(aux);
		if( aux != '0' ) {
			novo = (CELL *)malloc( sizeof(CELL) );
			if( novo != NULL ) {
				strcpy(novo->num, aux);
				novo->prox = NULL;
				if( raiz == NULL ) {
					raiz = novo;
				} else {
				tmp = raiz;
				while( tmp->prox != NULL ) {
					tmp = tmp->prox;
				}
				tmp->prox = novo;
				}		
			}
		}
	} while( aux != '0');
// percorre a lista e apresenta os nomes
	tmp = raiz;
	while( tmp != NULL ) {
	printf("%d\n",tmp->num);
	tmp = tmp->prox;
	}
}
