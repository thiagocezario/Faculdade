#include <stdio.h>
#include <stdlib.h>
#include <assert.h>
#include "graph.h"

int main(void) {
    int v, w;
    Graph G;

    // read in graph
    G = GRAPHscan();

		GRAPHshow(G);

    return 0;
  }

