#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int matrixA[2][3] = {{1,2,3},{4,5,6}};
	int matrixB[3][2] = {{1,2},{3,4},{5,6}};
	int matrixC[2][2];
	// the resulting matrix has tem number of lines of the first one and columns of the second one
	int i, j, k, soma = 0;
	
	
	for (i = 0; i < 2; i++) {						//i < number of lines of the first matrix
      for (j = 0; j < 2; j++) {						//j < number of columns of the second matrix
        for (k = 0; k < 3; k++) {					//k < number of lines of the second matrix
          soma += matrixA[i][j]*matrixB[k][j];		//this makes something like this -> A(1,1)*B(1,1)+A(1,2)*B(2,1)+A(1,3)*B(3,1) 
		  											//									A(1,1)*B(1,2)+A(1,2)*B(2,2)+A(1,3)*B(3,2)
		  											//but on this programn it's matrixA[0][0]*matrixB[0][0] + matrixA[0][0]*matrixB[1][0] +
		  											//							matrixA[0][0]*matrixB[2][0] for the first element of the resulting matrix
		  											//							matrixA[0][1]*matrixB[0][1] + matrixA[0][1]*matrixB[1][1] +
		  											//							matrixA[0][1]*matrixB[2][1] for the second element of the resulting matrix
		  											//							matrixA[1][0]*matrixB[0][0] + matrixA[1][0]*matrixB[1][0] +
		  											//							matrixA[1][0]*matrixB[2][0] for the third element of the resulting matrix
		  											//							matrixA[1][1]*matrixB[0][1] + matrixA[1][1]*matrixB[1][1] +
		  											//							matrixA[1][1]*matrixB[2][1] for the last element of the resulting matrix
        }
 
        matrixC[i][j] = soma;
        soma = 0;
      }
    }
	
	for(i = 0; i < 3; i++){
		for(j = 0; j < 3; j++){
			printf("%d\t", matrixC[i][j]);
		}
		printf("\n");
	}
	
	return 0;
}
