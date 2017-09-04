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
	int compare = 0;
	
	gets(text);
	gets(word);
	
	
	while(text[i] != '\0'){
		while(text[p] != ' ' || word[p] != '\0'){
			compare = 0;
			if(text[p] == word[p]){
				compare = 1;
			}
			else{
				compare = 0;
				break;
			}
			p++;
		}
		if(compare){
			if(i == '\0'){
				occurrence[n] = 48;
				n++;
			}
			else{
				occurrence[n] = i;
				n++;
			}
		}
		i++;
	}
	i = 0;
	printf("The word '%s' appears %d times in the positions: ", word, n);	
	while(occurrence[i] != '\0'){
		printf("%d ", occurrence[i]);
		i++;
	}
	
	
	return 0;
}
