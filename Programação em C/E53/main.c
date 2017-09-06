#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char matrix[4][4][4];
	int x, y, z;
	
	for(x = 1; x <= 3; x++){
		for(y = 1; y <= 3; y ++){
			for(z = 1; z <= 3; z++){
				matrix[x][y][z] = x*y*z;
				printf("%d ", matrix[x][y][z]);
			}
			//printf("\n");
		}
	}
	
	
	
	return 0;
}
