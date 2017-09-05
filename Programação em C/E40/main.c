#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char phrase[25];
	int start = 0;
	int i = 0;
	
	gets(phrase);
	
	for(start = 0; start < 25; start++){
		if(phrase[start] == '\0'){
			break;
		}
	}
	for(i = start - 1; i >= 0; i--){
		printf("%c", phrase[i]);
	}
	
	
	return 0;
}
