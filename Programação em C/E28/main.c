#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char stringA[20];
	char stringB[20];
	int compare = 0;
	int i = 0;
	
	gets(stringA);
	gets(stringB);
	
	while(stringA[i] != '\0' && stringB[i] != '\0'){
		if(stringA[i] == stringB[i]){
			compare = 1;
		}
		else{
			compare = 0;
			break;
		}
		i++;
	}
	compare ? printf("Strings iguais") : printf("Strings diferentes");
	
	
	
	return 0;
}
