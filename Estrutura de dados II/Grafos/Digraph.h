/*********************************************************************
 *  This code is from "Algorithms in C, Third Edition,
 *  by Robert Sedgewick, Addison-Wesley, 2002.
 *********************************************************************/

#define INFINITY 9999999
#define EPSILON  0.000001

typedef struct { int v; int w; } Edge;
Edge EDGE(int v, int w);
typedef struct graph *Graph;

/*********************************************************
 *  Adjacency list data type.
 *********************************************************/
 typedef struct node *link;
 struct node {
    int w;               // destination node of edge
    link next;           // next element in adjacency list
    double wt;           // cost of edge
 };

/*********************************************************
 *  Graph data type.
 *********************************************************/
 struct graph {
    int V;               // number of vertices
    int E;               // number of edges
    link *adj;           // adjacency list
 };



Graph  GRAPHinit(int V);
Graph  GRAPHscan(void);
void   GRAPHshow(Graph G);
void	 GRAPHinsertE(Graph G, Edge e, double d);
