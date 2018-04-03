#include <stdio.h>
#include <string.h>
#include <conio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
typedef struct Bloco {
	int dado;
	struct Bloco *prox;
} Nodo;

void inicializa_lista(Nodo **N);//
void insere_inicio_lista(Nodo **N, int dado);//
void insere_fim_lista(Nodo **N, int dado);
void insere_ordenado_lista(Nodo **N, int dado);
int remove_inicio_lista(Nodo **N);//
int remove_fim_lista(Nodo **N);
void remove_elemento_lista(Nodo **N, int dado);//
int quantidade_lista(Nodo *N);
void exibe_lista(Nodo *N);//
int pesquisa_lista(Nodo *N, int dado);//
void apaga_lista(Nodo**N);

int main(int argc, char *argv[]) {
	Nodo *lista;
	int menu, valor;

	inicializa_lista(&lista);
	do {
		printf("\n1. Insere no fim da lista");
		printf("\n2. inicio lista");
		printf("\n3. exclui inicio");
		printf("\n4. imprime lista");
		printf("\n5. sair");
		scanf("%d", &menu);
		switch (menu) {
			case 1:
				printf("\nValor a ser inserido");
				scanf("%d",&valor);
				insere_fim_lista(&lista, valor);
				break;
			case 2:
				printf("\nValor a ser inserido");
				scanf("%d",&valor);
				insere_inicio_lista(&lista, valor);
				break;
			case 3:
				if(remove_inicio_lista(&lista) == 0) {
					printf ("\nLista vazia");
				} else {
					printf("\nValor excluido");
				}
				break;
			case 4:
				imprime_lista_encadeada(lista);
				break;
			case 5:
				printf("\nFim");
				break;
			default:
				printf("\nOpcao invalida");
				break;
		}
	} while (menu != 5);

	return 0;
}


void inicializa_lista(Nodo **N) {
	*N = NULL;
}

Nodo* Cria_nodo() {
	Nodo *p;
	p = (Nodo *)malloc(sizeof(Nodo));

	if(!p) {
		printf("Problema de alocação");
		exit(0);
	}

	return p;
}

void insere_inicio_lista (Nodo **N, int dado) {
	Nodo *novo;
	novo = Cria_Nodo();
	novo -> dado = dado;
	novo -> prox = *N;
	*N = novo;
}

int remove_inicio_lista(Nodo **N) {
	Nodo *remove;

	if (*N != NULL) {
		remove = *N;
		*N = remove->prox;
		free(remove);

		return 1;
	}

	return 0;
}

void apaga_lista(Nodo**N) {
	int i = 0;

	while (i == 1) {
		i = remove_inicio_lista(*N);
	}
}

void remove_elemento_lista(Nodo **N, int dado) {
	Nodo *remove, *anterior;

	if (*N) {
		remove = *N;
		anterior = *N;

		while (remove != NULL) {
			if (remove->dado == dado) {
				if (remove == *N) {
					*N = remove->prox;
					free(remove);

					return;

				} else {
					anterior->prox = remove->prox;
					free(remove);

					return;

				}

			} else {
				anterior = remove;
				remove = remove->prox;

			}
		}
	}

	return;
}

int pesquisa_lista(Nodo *N, int dado) {
	Nodo *busca;

	Nodo *remove = N;

	if (remove) {
		busca = N;

		while (busca != NULL) {
			if (busca->dado == dado) {
				return busca->dado;

			} else {
				busca = busca->prox;

			}
		}
	}

	return 0;
}

void exibe_lista(Nodo *N) {
	Nodo *lista;

	if (N) {
		lista = N;

		while (lista != NULL) {
			printf("\n%d ", lista->dado);
			lista = lista->prox;
		}

		printf ("\nFim");
	}
}
