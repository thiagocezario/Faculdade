#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char phrase[30];
	char matrix[30][30];
	int line;
	int column;
	int i;
	
	gets(phrase);
	
	for(line = 0, i = 0; phrase[i] != '\0' ; line++, i++){
		for(column = 0; column < 30; column++){
			printf("  ");
			if(column == line){
				printf("%c", phrase[i]);
			}
		}
		printf("\n");
	}
	
	printf("Using Matrix: \n");
	
	for(line = 0, i = 0;  phrase[i] != '\0' ; line++, i++){
		for(column = 0; phrase[i] != '\0'; column++){
			if(column == line){
				matrix[line][column] = phrase[i]; 
				printf("%c", matrix[line][column]);
			}
		}
	}

	return 0;
}
