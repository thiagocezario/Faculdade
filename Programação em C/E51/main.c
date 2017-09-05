#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int number[4];
	int i = 0;
	
	for(i = 0; i < 4; i++){
		scanf("%d", &number[i]);	
	}
	
	
	for (i = 3; i >= 0; i--){
		printf("%d ", number[i]);
	}
	
	return 0;
}
