#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char palavra1[10];
	char palavra2[10];
	char concat[20];
	int i  = 0;
	int length = 0;
	
	gets(palavra1);
	gets(palavra2);
	
	/*strcpy(concat, palavra1);*/
	while(palavra1[i] != '\0'){
		concat[i] = palavra1[i];
		length++;
		i++;
	}
	for(i = 0; i < 20; i++){
		concat[i+length] = palavra2[i];
	}
	
	printf("Resultado: %s", concat);
	
	return 0;
}
