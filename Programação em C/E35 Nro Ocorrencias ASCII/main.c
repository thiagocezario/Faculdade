#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int StrSize(char str[]){
	int i = 0, size = 0;
	
	while(str[i] != '\0'){
		size++;
		i++;
	}
	return size;
}

int Counter(char chr, char str[]){
	int i = 0, size, counter = 0;
	
	size = StrSize(str);
	
	for(i = 0; i < size; i++){
		if(str[i] == chr){
			counter++;
		}
	}
	return counter;
}


int main(int argc, char *argv[]) {
	char str[30], ascii[94];
	int i, counter[94];
	
	printf("Entre com uma string: ");
	gets(str);
	
	for(i = 0; i < 94; i++){
		ascii[i] = i + 32;
	}
	
	for(i = 0; i < 94; i++){
		counter[i] = Counter(ascii[i], str);
	}
	
	ascii;
	counter;
	printf("Caracter\tNro Ocorrencias\n");
	for(i = 0; i < 94; i++){
		if(counter[i] != 0){
			printf("%c\t%d\n", ascii[i], counter[i]);
		}
	}	
	
	return 0;
}
