#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int matrix[20][20];
	int n = 0;
	int i, j = 0;
	
	printf("Insira o numero de linhas e colunas da matriz: ");
	scanf("%d", &n);
	
	for(i = 0; i < n; i++){
		for(j = 0; j < n; j++){
			matrix[i][j] = i*n+j;
		}
	}
	
	printf("A matriz eh: \n");
	for(i = 0; i < n; i++){
		for(j = 0; j < n; j++){
			printf("%d\t", matrix[i][j]);
		}
		printf("\n");
	}
	
	printf("A diagonal principal eh: \n");
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
	
	printf("A diagonal secundaria eh: \n");
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
	
	printf("O triangulo superior eh: \n");
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
