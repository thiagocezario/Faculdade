#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int StrSize(char str[]){
	int i = 0;
	int size = 0;
	
	while(str[i] != '\0'){
		size++;
		i++;
	}	
	return size;
}


int main(int argc, char *argv[]) {
	char str[30];
	int i = 0, j = 0, k = 0, size = 0, x = 1;
	
	printf("Entre com uma string: ");
	gets(str);
	
	size = StrSize(str);
	while ((x*x) < size){
		x++;
	}
	x;
	for(i = 0; i < x; i++){
		for(j = 0; j < x;j++, k++){
			printf("%c", str[k]);
		}
		printf("\n");
	}
	
	return 0;
}
