#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char phrase[30];
	char matrix[30][30];
	int line;
	int column;
	int i = 0;
	
	gets(phrase);
	
	for(line = 0; phrase[line] != '\0' ; line++){
		for(column = 0; column < 30; column++){
			printf("  ");
			if(column == line){
				printf("%c", phrase[line]);
			}
		}
		printf("\n");
	}
	
	/*printf("Using Matrix: \n");
	i = 0;
	for(line = 0; line < 30; line++){
		for(column = 0; column < 30; column++){
			if(phrase[line] == '\0'){
				break;
			}
			else if(column == line && phrase[line] != '\0'){
				
				matrix[line][line] = phrase[line]; 
				printf("%c", matrix[line][line]);
			}
		}
	}*/

	return 0;
}
