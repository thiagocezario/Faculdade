#include <stdio.h>
#include <stdlib.h>
#include <assert.h>
#include "digraph.h"

// Thiago Cezario e Leonardo Godoy
// b) faz uma iteraçao vertice por vertice e salva a soma dos pesos
// depois compara os valores salvos e ve qual é o maior, a posicao do array indica
// o numero do vertice


void init(int value, Digraph G, int * array){
	int i = 0;
	for(i; i < G->V; ++i){
		*(array+i) = value; 
	}
}

void show(Digraph G, int * array){
	int i = 0;
	for(i; i < G->V; ++i){
		printf("%d %d\n", i, *(array +i)); 
	}
}

void ok(Digraph G, int v, int *distTo, int *marked){
	link now  = G->adj[v];
	link t = now;
	// *(distTo+v) = 0;
	*(marked+v) = 1;

	double wt = 0;
	int w = 0;

	 for (t; t != NULL; t = t->next) {
          w = t->to;
          wt = t->wt;
          printf("%d->%d (%lf) ", v, w, t->wt);

          double sum = *(distTo+v) + wt; 
          if(*(distTo+w) > sum){
          	*(distTo+w) = sum;
          }
      }

     // printf("AA: %d\n", now->to);
	// printf("AA: %f\n", now->wt);

    int ve = smaller(G, distTo, marked);
    //printf("smaller: %d\n", ve); 
    if (ve > 0)
    {
    	ok(G, ve, distTo, marked);
    }

}

int smaller(Digraph G, int * distTo, int * marked){
	double lower = INFINITY;
	int i = 0;
	int v = -1;

	for(i; i < G->V; ++i){
		if(*(marked+i) == 0){
			if(*(distTo+i) < lower){
				lower = *(distTo+i);
				v = i;
			}
		}
		// printf("%d %d\n", i, *(array +i)); 
	}
	return v;
}

int main(void) {
    int v, w;
    Digraph G;


    int option = 0;
    // scanf("Vertice escolhido: %*c%d", &option);
	printf("%d\n", option);
    
    // read in graph
    G = DIGRAPHscan();
    DIGRAPHshow(G);

    int *distTo = malloc(G->V * sizeof(int));
    int *marked = malloc(G->V * sizeof(int));

    init(INFINITY, G, distTo);
    init(0, G, marked);

	show(G, distTo);    
    // show(G, marked);

	*(distTo+option) = 0;
	ok(G, option, distTo, marked);
    show(G, distTo);

    return 0;
  }


