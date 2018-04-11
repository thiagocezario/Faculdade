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
void insere_ordenado_lista(Nodo **N, int dado, int posicao);//
int remove_inicio_lista(Nodo **N);//
int remove_fim_lista(Nodo **N);
void remove_elemento_lista(Nodo **N, int dado);//
int quantidade_lista(Nodo *N);
void exibe_lista(Nodo *N);//
int pesquisa_lista(Nodo **N, int dado);//
void apaga_lista(Nodo**N);//
Nodo* Cria_Nodo();

int main(int argc, char *argv[]) {
	Nodo *lista;
	int menu, valor, posicao;

	inicializa_lista(&lista);
	do {
		printf("\n1. Insere no fim da lista");
		printf("\n2. Insere no inicio lista");
		printf("\n3. Insere ordenado");
		printf("\n4. Exclui do inicio");
		printf("\n5. Exclui do final da lista");
		printf("\n6. Remove elemento");
		printf("\n7. Apaga Lista");
		printf("\n8. Imprime lista");
		printf("\n9. Pesquisa lista");
		printf("\n10. Sair\n");

		scanf("%d", &menu);
		switch (menu) {
			case 1:
				printf("\nValor a ser inserido:  ");
				scanf("%d",&valor);
				insere_fim_lista(&lista, valor);
				break;
			case 2:
				printf("\nValor a ser inserido:  ");
				scanf("%d",&valor);
				insere_inicio_lista(&lista, valor);
				break;
			case 3:
				printf("\nValor a ser inserido:  ");
				scanf("%d", &valor);
				printf("\nNa frente de quem? ");
				scanf("%d", &posicao);
				insere_ordenado_lista(&lista, valor, posicao);
				break;
			case 4:
				if(remove_inicio_lista(&lista) == 0) {
					printf ("\nLista vazia");
				} else {
					printf("\nValor excluido");
				}
				break;
			case 5:
			    if(remove_fim_lista(&lista) == 0) {
					printf ("\nLista vazia");
				} else {
					printf("\nValor excluido");
				}
                break;
            case 6:
                printf("\nValor a ser inserido: ");
                scanf("%d", &valor);
                remove_elemento_lista(&lista, valor);
                break;
            case 7:
                apaga_lista(&lista);
                printf("\nLista apagada");
                break;
            case 8:
                exibe_lista(lista);
				break;
            case 9:
                printf("Entre com um valor: ");
                scanf("%d", &valor);
                printf("\nValor %d na posicao %d", valor, pesquisa_lista(&lista, valor));
                break;
            case 10:
				printf("\nFim");
				break;
			default:
				printf("\nOpcao invalida");
				break;
		}
		printf("\n\n");
	} while (menu != 10);

	return 0;
}


void inicializa_lista(Nodo **N) {
	*N = NULL;
}

Nodo *Cria_Nodo() {
	Nodo* p;
    p = (Nodo *)malloc(sizeof(Nodo));

	if(!p) {
		printf("\nProblema de alocação");
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

		if (remove->prox == NULL){
            free(remove);
            return 0;
        }
		free(remove);


		return 1;
	}

	return 0;
}

int remove_fim_lista(Nodo **N) {
    Nodo *remove = *N;
    Nodo *aux;

    while (remove->prox != NULL) {
        aux = remove;
        remove = remove-> prox;
    }

    if (*N) {
        aux->prox = NULL;
        free(remove);
        return 1;
    }

    return 0;
}

void apaga_lista(Nodo **N) {
	int i = 1;
    Nodo *remove;

	while (i == 1) {
		/*if (*N != NULL) {
            remove = *N;
            *N = remove->prox;
            free(remove);

            i = 1;
            continue;
        }

        i = 0;*/
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

int pesquisa_lista(Nodo **N, int dado) {
	Nodo *busca;
	int iteracao = 0;

    if (N != NULL){
        busca = *N;
        while (busca != NULL) {
            iteracao++;
            if (busca->dado == dado) {
                return iteracao;

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
        printf("\nLista: ");

		while (lista != NULL) {
			printf("%d ", lista->dado);
			lista = lista->prox;
		}

		printf ("\nFim");
	}
}

void insere_fim_lista(Nodo **N, int dado) {
    Nodo *novo;
    Nodo *proximo = *N;

    if(proximo == NULL) {
        novo = Cria_Nodo();
        novo -> dado = dado;
        novo -> prox = *N;
        *N = novo;
        return;
    }

    while (proximo->prox != NULL) {
        proximo = proximo->prox;
    }

    novo = Cria_Nodo();
    novo->dado = dado;
    novo->prox = NULL;
    proximo->prox = novo;
}

void insere_ordenado_lista(Nodo **N, int dado, int posicao) {
    Nodo *novo;
    Nodo *anterior = NULL;
    Nodo *proximo = *N;

    while (proximo != NULL && proximo->dado != posicao) {
        anterior = proximo;
        proximo = proximo->prox;
    }

    novo = Cria_Nodo();
    novo->dado = dado;

    if (anterior == NULL) {
        novo->prox = *N;
        *N = novo;
    }
    else if(proximo == NULL){
        novo->prox = NULL;
        proximo->prox = novo;
    }
    else {
        //novo->prox = anterior->prox;
        anterior->prox = novo;
        novo->prox = proximo;
    }

}
