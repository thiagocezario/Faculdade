#include <stdio.h>
#include <stdlib.h>

/* https://stackoverflow.com/questions/19387737/compare-words-in-two-strings */

int main(int argc, char *argv[]) {
	char text[80];
	char word[10];
	char occurrence[80];
	int i = 0;
	int n = 0;
	int p = 0;
	int w = 0;
	int compare = 0;
	
	printf("Entre com a string: ");
	gets(text);
	printf("Entre com a palavra que deseja buscar: ");
	gets(word);
	
	
	while(text[i] != '\0'){
		w = 0;
		while((text[p] != ' ' && text[p] != '\0') && word[w] != '\0'){
			
			if(text[p] == word[w]){
				compare = 1;
			}
			else{
				compare = 0;
				break;
			}
			p++;
			w++;
		}
		if(text[p] != '\0'){
			p+=1;
		}
		if(compare){
			if(i == '\0'){
				occurrence[n] = i + 1;
				n++;
			}
			else{
				occurrence[n] = i;
				n++;
			}
		}
		compare = 0;
		i++;
	}
	i = 0;
	printf("A palavra '%s' aparece %d vezes, nas posicoes: ", word, n);	
	while(occurrence[i] != '\0'){
		printf("%d ", occurrence[i]);
		i++;
	}
	
	
	return 0;
}
