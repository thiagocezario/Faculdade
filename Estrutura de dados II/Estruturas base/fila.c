#include <stdio.h>
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

int main (int argc, char *argv[]) {
	int tam = 3;
	Fila *f = create_queue (tam);
	int e1 = 1;
	int e2 = 2;
	int e3 = 4;
	
	enqueue (f, e1);
	enqueue (f, e2);
	enqueue (f, e3);
	
	while(!empty(f) ) {
		int e = dequeue(f);
		printf("%d\n", e);
	}
	
	free_queue (f);
	return 0;
}
