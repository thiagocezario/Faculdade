#include <stdio.h>
#include <stdlib.h>
#include <assert.h>
#include "graph.h"

int marked[];

void profundidade(Graph G, int v) {
    int vizinho;
    link t;

    printf("Visitando o vertice %d\n", v);
    marked[v] = 1;

    //para cada vzinho de v ainda nao visitado chamar a funcao profundidade novamente
    for(t = G->adj[v]; t != NULL; t = t->next) {
        vizinho = t->w;
        if(marked[vizinho] == 0) {
            profundidade(G, vizinho);
        }
    }
}

int main(void) {
    int v, w, i;
    Graph G;

    // read in graph
    G = GRAPHscan();

    GRAPHshow(G);
    for(i = 0; i<G->V; i++)
        marked[i] = (int *)malloc(sizeof(int) *G->V);
    for(i = 0; i < G->V; i++) {
        marked[i] = 0; //todos os nao visitados iniciam com 0
    }

    profundidade(G, 0);
    return 0;
  }
