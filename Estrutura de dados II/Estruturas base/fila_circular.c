#include <stdio.h>
#include <stdlib.h>

typedef struct fila {
	/*guarda o inicio da fila*/
	int ini;
	/*guarda o fim da fila*/
	int fim;
	/*tamanho da fila*/
	int tam;
	/* numero de elmentos na fila */
	int n;
	/*vetor de elementos*/
	int *vetor;
} Fila;

int empty (Fila *f) {
	return (f->n == 0);
}

int full (Fila *f) {
	return (f->n == f->tam);
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
	f->fim = (f->fim + 1) % f->tam; /*incremento*/
	f->n++;
}

int dequeue (Fila *f) {
	int v = f->vetor[f->ini]; /*guarda o elemento*/

	if (empty(f)) {
		printf("fila vazia!");
		exit(1); /*aborta programa*/
	}

	f->ini = (f->ini + 1) % f->tam; /*incremento*/
	f->n--;
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
	int e;
	
	enqueue (f, e1);
	enqueue (f, e2);
	enqueue (f, e3);
	e = dequeue(f);
	printf("%d\n", e);
	enqueue (f, 6);
	e = dequeue(f);
	printf("%d\n", e);
	e = dequeue(f);
	printf("%d\n", e);
	e = dequeue(f);
	printf("%d\n", e);
	fflush(stdout);
	enqueue (f, 7);
	enqueue (f, 8);
	enqueue (f, 9);
	
	while(!empty(f) ) {
		e = dequeue(f);
		printf("%d\n", e);
	}
	
	free_queue (f);
	return 0;
}
