/*********************************************************************
 *  Undirected graph.
 *
 *  This code is from "Algorithms in C, Third Edition,
 *  by Robert Sedgewick, Addison-Wesley, 2002.
 *
 *  Simplified by Alex Kutzke, 2018.2
 *********************************************************************/

#include <stdio.h>
#include <stdlib.h>
#include <assert.h>
#include "digraph.h"
/*********************************************************
 *  Initialize and return a new Edge.
 *********************************************************/
 Edge EDGE(int from, int to) {
    Edge e;
    e.from = from;
    e.to = to;
    return e;
 }

/*********************************************************
 *  Initialize and return a new adjacency list element.
 *********************************************************/
 link NEW(int w, link next, double wt) {
    link x = malloc(sizeof *x);
    x->to = w;
    x->next = next;
    x->wt = wt;
    return x;                         
 }

/*********************************************************
 *  Initialize and return a new graph with V vertices
 *  and no edges.
 *********************************************************/
 Digraph DIGRAPHinit(int V) {
    int v;
    Digraph G = malloc(sizeof *G);
    G->V = V; G->E = 0;
    G->adj     = malloc(V * sizeof(*G->adj));
    if (G->adj == NULL){
       fprintf(stderr, "Out of memory in GRAPHinit()\n");
       exit(EXIT_FAILURE);
    }

    for (v = 0; v < V; v++) G->adj[v]  = NULL;

    return G;
 }

/*********************************************************
 *  Insert Edge e into Graph g.
 *********************************************************/
void DIGRAPHinsertE(Digraph G, Edge e, double d) {
    int v = e.from;
    int w = e.to;
    //double d = POINTdist(G->points[v], G->points[w]);
    G->adj[v] = NEW(w, G->adj[v], d);
    //G->adj[w] = NEW(v, G->adj[w], d); 
    G->E++;
 }


/*********************************************************
 *  Print graph for debugging.
 *********************************************************/
 void DIGRAPHshow(Digraph G) {
    link t; 
    int v, w;
    printf("%d vertices, %d edges\n", G->V, G->E);
    for (v = 0; v < G->V; v++) {
       printf("%6d ", v);
       printf(" :  ");
       for (t = G->adj[v]; t != NULL; t = t->next) {
          w = t->to;
          printf("%d->%d (%lf) ", v, w, t->wt);
       }
       printf("\n");
    }
 }

/*********************************************************
 *  Read in a graph from a file, bare bones error checking.
 *  V E
 *  edges: from to weight
 *********************************************************/
Digraph DIGRAPHscan(void) {
    int i, v, w;
    int V, E;
		double d;
    Digraph G;

    scanf("%d %d", &V, &E);
    G = DIGRAPHinit(V);

    // read in and insert vertices
    //for (i = 0; i < V; i++) {
    //     scanf("%d", &v);
    //     assert(0 <= v && v < V);
    //}

    // read in and insert edges
    for (i = 0; i < E; i++) {
       scanf("%d %d %lf", &v, &w, &d);
       assert(0 <= v && v < V);
       assert(0 <= w && w < V);
       DIGRAPHinsertE(G, EDGE(v, w), d);
    }
    return G;
}

