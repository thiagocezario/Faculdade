#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int ReadMatrix(int matrix[][]){
	int i = 0;
	int j = 0;
	
	for(i = 0; i < 2; i++){
		for(j = 0; j < 2; j++){
			printf("Insert the value of the position %d - %d:\n", i, j);
			scanf("%d", matrix[i][j]);
		}
	}
}

int ThirdMatrix(int matrixA[][], int matrixB[][]){
	int matrixC[2][2];
	int i = 0;
	int j = 0;
	
	for(i = 0; i < 2; i++){
		for(j = 0; j < 2; j++){
			matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
		}
	}
	return matrixC;
}

int main(int argc, char *argv[]) {
	int matrixA[2][2];
	int matrixB[2][2];
	
	printf("%d\n",ThirdMatrix(ReadMatrix(matrixA), ReadMatrix(matrixB)));
	
	return 0;
}
