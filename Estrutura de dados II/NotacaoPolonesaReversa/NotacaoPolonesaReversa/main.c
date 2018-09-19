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

    while (vetor[i] > 31) {
        int num1;
        int num2;
        int resultado;
        char op;
        char teste = vetor[i];
        if (teste == 42 || teste == 43 || teste == 45 || teste == 47) {
            op = teste;
            num2 = (int)pop(p);
            num1 = (int)pop(p);

            switch(op) {
            case 43:
                resultado = num1 + num2;
                push(p, resultado);
                break;
            case 45:
                resultado = num1 - num2;
                push(p, resultado);
                break;
            case 42:
                resultado = num1 * num2;
                push(p, resultado);
                break;
            case 47:
                resultado = num1 / num2;
                push(p, resultado);
                break;
            }
        } else {
            push(p, (int)(vetor[i] - '0'));
        }
        i+=2;
    }
}

int main () {
	int tam = 20;
    char vetor[13] = "1 2 - 4 5 + *";
	Pilha *p = create_stack (tam+1);

    notacao_polonesa(p, vetor);
	printf("%d\n", (int)pop(p));

    //empty(p);
	char vetor2[20] = "9 0 1 + 2 3 * * +";
	notacao_polonesa(p, vetor2);
    printf("%d\n", (int)pop(p));

	free_stack (p);
	return 0;
}
