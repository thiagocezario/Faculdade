#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char text[20];
	char letter;
	int position[20];
	int i = 0;
	int p = 0;
	
	printf("Entre com uma string: ");
	gets(text);
	printf("Entre com a letra que deseja checar: ");
	scanf("%c", &letter);
	while(text[i] != '\0'){
		if(text[i] == letter){
			if(i == '\0'){
				position[p] = i + 1;
				p++;
			}
			else{
				position[p] = i + 1;
				p++;
			}
		}
		i++;
	}
	
	printf("A letra '%c' aparece %d vezes, nas posicoes\n", letter, p);
	i = 0;
	while(position[i] != '\0'){
		printf("%d ", position[i]);
		i++;
	}
	
	printf("\nDe tras pra frente: \n");
	for(i = p-1; i >= 0; i--){
		
		printf("%d ", position[i]);
	}
			
	return 0;
}
