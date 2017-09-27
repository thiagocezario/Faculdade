#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int main(int argc, char *argv[]) {
	int m = 0, n = 0, i = 0, j = 0;
	
	
	printf("Entre com as dimensoes m e n da matriz: ");
	scanf("%d %d", &m, &n);
	
	int mat[m][n];
	int transposta[n][m];
	
	printf("Entre com os valores da matriz: ");
	for(i = 0; i < m; i++){
		for(j = 0; j < n; j++){
			scanf("%d", &mat[i][j]);
		}
	}
	
	for(i=0; i<m; ++i)
        for(j=0; j<n; ++j)
        {
            transposta[j][i] = mat[i][j];
        }
	/*
	for(i = 0, k = 0; i < m, k < n; i++, k++){
		for(j = 0, l = 0; j < n, l < m; j++, l++){
			
		}
	}*/	
	transposta;
	mat;
	for(i = 0; i < m; i++){
		for(j = 0; j < n; j++){
			printf("%d  ", mat[i][j]);
		}
		printf("\n");
	}
	printf("\n\n");
	
	for(i = 0; i < n; i++){
		for(j = 0; j <m; j++){
			printf("%d  ", transposta[i][j]);
		}
		printf("\n");
	}
	
	return 0;
}
