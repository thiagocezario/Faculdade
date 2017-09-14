#include <stdio.h>
#include <stdlib.h>

/* esse trecho da erro de segmentação*/
int StrSize(char str[]){
	int i = 0, size = 0;
	str;
	while(str[i] != '\0'){
		size++;
		i++;
	}
	return size;	
}

int Counter(char chr, char str[]){
	int i, size, counter = 0;
	
	size = StrSize(str);
	
	for(i = 0; i < size; i++){
		if(str[i] == chr){
			counter++;
		}
	}
	return counter;	
}


int main(int argc, char *argv[]) {
	char str[30];
	char chr, chrAux = 0;
	int a = 0, b = 0;
	
	printf("Entre com uma string: ");
	gets(str);
	
	//por algum motivo na hora de rodar o programa "trava" se colocar o intervalo de 1 a 127 da tabela ascii
	for(chr = ' '; chr <= '~' ; chr++){
		a = Counter(chr, str);
		if(a > b){
			b = a;
			chrAux = chr;
		}
	}
	
	printf("O caracter %c ocorreu %d vezes\n", chrAux, b);
	
	
	return 0;
}
