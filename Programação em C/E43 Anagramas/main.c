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
	char word1[10], word2[10], chr[94];
	int i, counter1[94], counter2[94];
	int equals;
	
	printf("Entre com uma palavra: ");
	gets(word1);
	
	printf("Entre com outra palavra: ");
	gets(word2);
	
	for(i = 0; i < 94; i++){
		chr[i] = i + 32;
	}
	
	for(i = 0; i < 94; i++){
		counter1[i] = Counter(chr[i], word1);
		counter2[i] = Counter(chr[i], word2);
	}
	
	//por erro de logica, nunca vai entrar nessa condição pq os tamanhos sao os mesmos sempre
	if(StrSize(counter1) != StrSize(counter2)){
		printf("As palavras '%s' e '%s' nao sao anagramas\n", word1, word2);
	}
	else{
		i = 0;
		while(counter1[i] != '\0' && counter2[i] != '\0'){
			if(counter1[i] == counter2[i]){
				equals = 1;
			}
			else{
				equals = 0;
				break;
			}
			
			i++;
		}
		if(equals){
			printf("As palavras '%s' e '%s' sao anagramas\n", word1, word2);
		}
		else{
			printf("As palavras '%s' e '%s' nao sao anagramas\n", word1, word2);
		}
	}
	
	return 0;
}
