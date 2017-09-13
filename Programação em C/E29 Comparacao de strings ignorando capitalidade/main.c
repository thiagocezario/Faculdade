#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char stringA[20];
	char stringB[20];
	int compare = 0;
	int i = 0;
	int sizeA, sizeB;
	
	gets(stringA);
	gets(stringB);
	
	while(stringA[i] != '\0'){
		sizeA++;
		i++;
	}
	
	i = 0;
	while(stringB[i] != '\0'){
		sizeB++;
		i++;
	}
	
	i = 0;

	
	
	for(i = 0; i < 20; i++){
		if(stringA[i] >= 'A' && stringA[i] <= 'Z'){
			stringA[i] += 32;
		}
		if(stringB[i] >= 'A' && stringB[i] <= 'Z'){
			stringB[i] += 32;
		}
	}

	
	i = 0;
	while(stringA[i] != '\0' || stringB[i] != '\0'){
		if((stringA[i+1] == '\0' && stringB[i+1] != '\0') || (stringA[i+1] != '\0' && stringB[i+1] == '\0')){
			compare = 0;
			break;
		} 
		if(stringA[i] == stringB[i]){
			compare = 1;
		}
		else{
			compare = 0;
			break;
		}
		i++;
	}
	compare ? printf("Strings iguais\n") : (sizeA > sizeB) ? printf("Strings diferentes, A > B\n") : (sizeA < sizeB) ? printf("Strings diferentes, A < B\n") : printf("");
	
	
	
	return 0;
}
