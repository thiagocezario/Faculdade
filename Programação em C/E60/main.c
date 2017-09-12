#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int matrix[20][20];
	int n = 0;
	int i, j = 0;
	
	printf("Insert the number of rows and columns of the matrix: ");
	scanf("%d", &n);
	
	for(i = 0; i < n; i++){
		for(j = 0; j < n; j++){
			matrix[i][j] = i*n+j;
		}
	}
	
	printf("The matrix is: \n");
	for(i = 0; i < n; i++){
		for(j = 0; j < n; j++){
			printf("%d\t", matrix[i][j]);
		}
		printf("\n");
	}
	
	printf("The main diagonal is: \n");
	for(i = 0; i < n; i++){
		for(j = 0; j < n; j++){
			if(i == j)
				printf("%d\t", matrix[i][j]);
			else{
				printf("\t");
			}
		}
		printf("\n");
	}
	
	printf("The secondary diagonal is: \n");
	for(i = 0; i < n; i++){
		for(j = 0; j < n; j++){
			if(j == n-1-i)
				printf("%d\t", matrix[i][j]);
			else{
				printf("\t");
			}
		}
		printf("\n");
	}
	
	printf("The superior triangle is: \n");
	for(i = 0; i < n; i++){
		for(j = 0; j < n; j++){
			if(j >= i)
				printf("%d\t", matrix[i][j]);
			else{
				printf("\t");
			}
		}
		printf("\n");
	}
	
	return 0;
}
