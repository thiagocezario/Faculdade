#include <stdlib.h>

typedef struct fila {
	/*guarda o inicio da fila*/
	int ini;
	/*guarda o fim da fila*/
	int fim;
	/*tamanho da fila*/
	int tam;
	/*vetor de elementos*/
	int *vetor;
} Fila;

int empty (Fila *f);
int full (Fila *f);
Fila* create_queue (int tam);
void enqueue (Fila *f, int e);
int dequeue (Fila *f);
void free_queue (Fila *f);

int main (int argc, char *argv[]) {
	/*1) Escreva um programa que, dado uma sequência de números (gerados através de um for), determina se o número é par ou ı́mpar e
insere o número em uma fila para pares ou em uma outra fila para ı́mpares e no final imprime o conteúdo de ambas as filas.
Use apenas operações de enqueue, dequeue, empty para adicionar, remover e imprimir elementos.*/
    int tamanho = 100;

    Fila* pares = create_queue(tamanho/2);
	Fila* impares = create_queue(tamanho/2);

    for(int i=1; i<=tamanho; i++) {
        if(i%2){
            enqueue(impares, i);
        } else {
            enqueue(pares, i);
        }
    }

    int j = 0;
    while(j < pares->fim) {
       printf("%d\n", dequeue(pares)) ;
       j++;
    }

    int k = 0;
    while(k < impares->fim) {
        printf("%d\n", dequeue(impares));
        k++;
    }

	return 0;
}

int empty (Fila *f) {
	return (f->ini == f->fim);
}

int full (Fila *f) {
	return (f->fim == f->tam);
}

Fila* create_queue (int tam) {
	Fila *f = (Fila *)malloc(sizeof(Fila));
	f->ini = 0;
	f->fim = 0;
	f->tam = tam;
	f->vetor = (int*)malloc(tam*sizeof(int));
	return f;
}

void enqueue (Fila *f, int e) {
	if (full(f)) {
		printf("fila cheia: capacidade esgotada!");
		exit(1); /*aborta programa*/
	}
	f->vetor[f->fim] = e; /*insere elemento*/
	f->fim = f->fim + 1; /*incremento*/
}

int dequeue (Fila *f) {
	if (empty(f)) {
		printf("fila vazia!");
	exit(1); /*aborta programa*/
    }

    int v = f->vetor[f->ini]; /*guarda o elemento*/
	    f->ini = f->ini + 1; /*incremento*/
	    return v;
}

void free_queue (Fila *f) {
	free(f->vetor);
	free(f);
}
