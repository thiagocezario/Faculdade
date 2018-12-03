/*********************************************************************
 *  This code is from "Algorithms in C, Third Edition,
 *  by Robert Sedgewick, Addison-Wesley, 2002.
 *********************************************************************/

#define INFINITY 9999999
#define EPSILON  0.000001

typedef struct { int from; int to; } Edge;
Edge EDGE(int from, int to);

typedef struct digraph *Digraph;

/*********************************************************
 *  Adjacency list data type.
 *********************************************************/
 typedef struct node *link;
 struct node {
    int to;               // destination node of edge
    link next;           // next element in adjacency list
    double wt;           // cost of edge
 };

/*********************************************************
 *  Graph data type.
 *********************************************************/
 struct digraph {
    int V;               // number of vertices
    int E;               // number of edges
    link *adj;           // adjacency list
 };



Digraph  DIGRAPHinit(int V);
Digraph  DIGRAPHscan(void);
void   DIGRAPHshow(Digraph G);
void	 DIGRAPHinsertE(Digraph G, Edge e, double d);
