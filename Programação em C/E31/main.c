#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char text[20];
	char letter;
	int position[20];
	int i = 0;
	int p = 0;
	
	gets(text);
	scanf("%c", &letter);
	while(text[i] != '\0'){
		if(text[i] == letter){
			if(i == '\0'){
				position[p] = (char)48;
				p++;
			}
			else{
				position[p] = i;
				p++;
			}
		}
		i++;
	}
	
	printf("The letter '%c' appears %d times and in the positions \n", letter, p);
	i = 0;
	while(position[i] != '\0'){
		printf("%d ", position[i]);
		i++;
	}
	
	printf("\nBackwards: \n");
	for(i = p-1; i >= 0; i--){
		
		printf("%d ", position[i]);
	}
			
	return 0;
}
