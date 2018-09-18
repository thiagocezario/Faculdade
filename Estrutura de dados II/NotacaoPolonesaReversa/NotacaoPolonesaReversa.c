#include <stdio.h>
#include <stdlib.h>

typedef struct pilha {
	/*topo da pilha*/
	int topo;
	/*tamanho da pilha*/
	int tam;
	/*elementos da pilha*/
	int *vetor;
} Pilha;

int empty (Pilha *p) {
	return (p->topo == 0);
}

int full (Pilha *p) {
	return ( p->topo == (p->tam - 1) );
}

Pilha* create_stack (int tam) {
	Pilha *p = (Pilha *)malloc(sizeof(Pilha));
	p->topo = 0;
	p->tam = tam;
	p->vetor = (int*)malloc(tam*sizeof(int));
	return p;
}

void push (Pilha *p, int e) {
	if (full(p)) {
		printf("pilha cheia: capacidade esgotada!");
		exit(1); /*aborta programa*/
	}

	p->vetor[p->topo] = e; /*insere elemento*/
	p->topo++; /*incrementa o topo*/
}

int pop (Pilha *p) {
	if (empty(p)) {
		printf("pilha vazia!");
		exit(1); /*aborta programa*/
	}
	p->topo--; /*decrementa a var. que guarda o topo*/
	int v = p->vetor[p->topo]; /*salva o elemento*/
	return v; /*retorna o elemento do topo*/
}

void free_stack (Pilha *p) {
	free(p->vetor);
	free(p);
}

int notacao_polonesa(Pilha* p) {
    int num1 = 0;
    int num2 = 0;
    int resultado = 0;
    char operacao;

    while(p->topo>0) {
        char c = pop(p);

        switch (c){
            case '+':
            case '-':
            case '*':
            case '/':
                operacao = c;
                break;
            default:
                num1 = (int)c;
                num2 = num1;
                break;
        }

    }

}

int main () {
	int tam = 3;

	Pilha *p = create_stack (tam+1);

	push (p, 1);
	push (p, 2);
	push (p, 4);

	while(!empty(p) ) {
		int e = pop (p);
		printf("%d\n", e);
	}
	free_stack (p);
	return 0;
}
