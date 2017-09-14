#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int matrixA[2][3] = {{1,2,3},{4,5,6}};
	int matrixB[3][2] = {{1,2},{3,4},{5,6}};
	int matrixC[2][2];
	// A matriz resultante tem o numero de linhas da matriz A e o numero de colunas da matriz B, e A tem que ter o numero de linhas igual
	// ao numero de colunas de B
	// A(mxn) * B(pxq) = C(mxq)
	int i, j, k, soma = 0;
	
	
	for (i = 0; i < 2; i++) {						//i < numero de linhas da primeira matriz
      for (j = 0; j < 2; j++) {						//j < numero de colunas da segunda matriz
        for (k = 0; k < 3; k++) {					//k < numero de linhas da segunda matriz
          soma += matrixA[i][j]*matrixB[k][j];		//isso gera algo assim           -> A(1,1)*B(1,1)+A(1,2)*B(2,1)+A(1,3)*B(3,1) 
		  											//									A(1,1)*B(1,2)+A(1,2)*B(2,2)+A(1,3)*B(3,2)
		  											//mas nesse programa fica   matrixA[0][0]*matrixB[0][0] + matrixA[0][0]*matrixB[1][0] +
		  											//							matrixA[0][0]*matrixB[2][0] para o primeiro elemento da matriz resultante
		  											//							matrixA[0][1]*matrixB[0][1] + matrixA[0][1]*matrixB[1][1] +
		  											//							matrixA[0][1]*matrixB[2][1] para o segundo elemento da matriz resultante
		  											//							matrixA[1][0]*matrixB[0][0] + matrixA[1][0]*matrixB[1][0] +
		  											//							matrixA[1][0]*matrixB[2][0] para o terceiro elemento da matriz resultante
		  											//							matrixA[1][1]*matrixB[0][1] + matrixA[1][1]*matrixB[1][1] +
		  											//							matrixA[1][1]*matrixB[2][1] para o ultimo elemento da matriz resultante
        }
 
        matrixC[i][j] = soma;
        soma = 0;
      }
    }
	
	for(i = 0; i < 2; i++){
		for(j = 0; j < 2; j++){
			printf("%d\t", matrixC[i][j]);
		}
		printf("\n");
	}
	
	return 0;
}
