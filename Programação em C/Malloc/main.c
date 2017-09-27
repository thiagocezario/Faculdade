#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */


#include <string.h>
#define MAX_NOME 80
typedef struct _CELL {
	char nome[MAX_NOME];
	struct _CELL *prox;
} CELL;
int main(int argc, char *argv[]) {
char aux[MAX_NOME];
CELL *raiz = NULL,
*novo,
*tmp;
do {
	printf("Informe o nome: ");
	gets(aux);
	if( aux[0] != '\0' ) {
		novo = (CELL *)malloc( sizeof(CELL) );
		if( novo != NULL ) {
			strcpy(novo->nome, aux);
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
} while( aux[0] != '\0');
// percorre a lista e apresenta os nomes
tmp = raiz;
while( tmp != NULL ) {
printf("%s\n",tmp->nome);
tmp = tmp->prox;
}
}



/*
int main(int argc, char *argv[]){
	int *vet = NULL;
	int n, i;
	long soma;
	float media;
	
	printf("Informe o numero de elementos desejados: ");
	scanf("%d", &n);
	
	vet = (int *)malloc(sizeof(int)*n);
	if(vet == NULL){
		printf("Sem memoria");
		exit(-1);
	}
	
	for(i = 0, soma = 0; i < n; i++){
		printf("Informe %d o numero: ", i+1);
		scanf("%d", &vet[i]);
		soma += vet[i];
	}
	
	media = (float)soma/(float)n;
	printf("Media %.2f\n\n", media);
	free(vet);
	
	return 0;
}


*/



/*
int main ()
{
  int i,n;
  char * buffer;
  srand(time(NULL));
  printf ("How long do you want the string? ");
  scanf ("%d", &i);

  buffer = (char*) malloc (i+1);
  if (buffer==NULL) exit (1);

  for (n=0; n<i; n++)
    buffer[n]=rand()%26+'a';
  buffer[i]='\0';

  printf ("Random string: %s\n",buffer);
  free (buffer);

  return 0;
}*/


/*
int main(int argc, char *argv[]) {
	int *p;
	p = (int *)malloc(sizeof(int));
	if(p!=NULL){
		*p = 10;
		printf("o valor de p = %d alocado em %x\n", *p, p);
		free(p);
	}
	
	
	
	return 0;
}*/
