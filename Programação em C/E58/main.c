#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int* ThirdMatrix(int matrixA[2][2], int matrixB[2][2], int matrixC[2][2]){
	int i = 0;
	int j = 0;
	matrixA;
	matrixB;
	
	for(i = 0; i < 2; i++){
		for(j = 0; j < 2; j++){
			matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
		}
	}
	return *matrixC;
}

int main(int argc, char *argv[]) {
	int matrixA[2][2];
	int matrixB[2][2];
	int matrixC[2][2];
	int i = 0;
	int j = 0;
	int a = 0;
	
	for(i = 0; i < 2; i++){
		for(j = 0; j < 2; j++){
			printf("Insert the value of the position %d - %d in matrix A:\n", i, j);
			scanf("%d", &a);
			matrixA[i][j] = a;
		}
	}
	for(i = 0; i < 2; i++){
		for(j = 0; j < 2; j++){
			printf("Insert the value of the position %d - %d in matrix B:\n", i, j);
			scanf("%d", &a);
			matrixB[i][j] = a;
		}
	}
	ThirdMatrix(matrixA, matrixB, matrixC);
	for(i = 0; i < 2; i++){
		for(j = 0; j < 2; j++){
			printf("%d ", matrixC[i][j]);
		}
		printf("\n");
	}
	
	
	return 0;
}
