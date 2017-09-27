#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int Counter(char str[]){
	int i = 0, j = 0;
	int counter = 0, hasSpace = 0;
	
	while(str[i] != 0){
		if(str[i] == ' '){
			counter++;
		}
		i++;
	}
	return counter;
}


int main(int argc, char *argv[]) {
	char str[30];
	int i;
	
	printf("Entre com uma string: ");
	gets(str);
	
	printf("A string tem %d palavras\n", Counter(str));	
	
	
	return 0;
}
