#include <stdio.h>
#include <stdlib.h>

typedef struct node {
	int info;
	struct node* next;
} Lista;

Lista* criar (void) {
	return NULL;
}

Lista* inserir (Lista* lista, int elem) {
	Lista* novo =(Lista*)malloc(sizeof(Lista));
	
	novo->info = elem;
	novo->next = lista;
	return novo;
}


void imprimir (Lista *lista) {
	Lista *v; /*var. para percorrer a lista*/
	
	for (v = lista; v != NULL; v = v->next) {
		printf("Valor: %d\n", v->info);
	}
}

Lista* remover (Lista *lista, int elem){
	Lista* prv = NULL; Lista* v = lista;

	while ((v != NULL) && (v->info != elem)) {
		prv = v;
		v = v->next;
	}

	if (v == NULL) { return lista; }
	if (prv == NULL) { lista = v->next; }
	else { prv->next = v->next; }

	free (v);
	return lista;
}

void liberar (Lista *lista) {
	while (lista != NULL) {
		Lista *aux = lista->next; /*guarda ref. p/ prox.*/
		free (lista); /*libera a memoria apontada por v*/
		lista = aux; /*faz v apontar p/ o prox. elem.*/
	}
}

int main () {
	Lista *lista;
	
	lista = criar ();
	
	lista = inserir (lista, 1);
	lista = inserir (lista, 2);
	lista = inserir (lista, 4);
	imprimir (lista);

	lista = remover (lista, 2);
	imprimir (lista);

	liberar (lista);
	return 0;
}
