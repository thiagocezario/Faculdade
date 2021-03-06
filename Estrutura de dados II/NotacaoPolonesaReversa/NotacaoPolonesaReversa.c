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

int notacao_polonesa(Pilha* p, char vetor[]) {
    int i = 0;
    for (i; i<sizeof(vetor);i+=2) {
        int num1;
        int num2;
        char op;

        if (vetor[i] == '+' || vetor[i] == '-' || vetor[i] == '*' || vetor[i] == '/') {
            op = vetor[i];
            num1 = (int)pop(p);
            num2 = (int)pop(p);

            switch(op) {
            case '+':
                push(p, num1 + num2);
                break;
            case '-':
                push(p, num1 - num2);
                break;
            case '*':
                push(p, num1 * num2);
                break;
            case '/':
                push(p, num1 / num2);
                break;
            }
        } else {
            push(p, (int)(vetor[i] - '0'));
        }
    }
}

int main () {
	int tam = 7;

	Pilha *p = create_stack (tam+1);

    notacao_polonesa(p, "1 2 � 4 5 + *");
	printf("%d\n", (int)pop(p));
	free_stack (p);
	return 0;
}
