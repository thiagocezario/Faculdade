#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char phrase[30];					//frase digitada pelo usuario, apenas layout
	char backwards[30];					//frase digitada pelo usuario de tras pra frente, apenas layout
	char phraseNoSpaces[30];			//frase sem espaços, vai ser usada na comparação
	char backwardsNoSpaces[30];			//frase sem espaços de tras pra frente, vai ser usada na comparação
	int i = 0;
	int j = 0;
	int p = 0;
	int k = 0;
	int size = 0;
	int itIs = 0;
	
	printf("Entre com a frase: ");
	gets(phrase);
	
	//calcula o tamanho da frase, pra delimitar a string que vai receber a frase de tras pra frente
	for(size = 0; size < 30; size++){
		if(phrase[size] == '\0'){
			break;
		}
	}
	
	//deixa tudo minusculo para fazer comparaçao ignorando capitalidade
	for(i = 0; i < size; i ++){
		phraseNoSpaces[i] = phrase[i];
		if(phrase[i] >= 'A' && phrase[i] <= 'Z'){
			phraseNoSpaces[i] += 32;
		}
	}
	
	//inverte a frase e armazena em um segundo array
	for(i = 0, j = size - 1; i < size, j >= 0; i++, j--){
		if(phrase[i] == '\0'){
			break;
		}
		
		if((phrase[i] < 'a' || phrase[i] > 'z') && phrase[i] != ' '){
			i++;
		}
		
		backwards[j] = phrase[i];
	}
	
	//retira os espaços e pontuações da string e armazena de tras pra frente em um outro array
	for(i = 0, j = size - 1, k = 0; phraseNoSpaces[i] != '\0', j >= 0, k <= size; i++, j--, k++){
		if((phrase[k] > 0 && phrase[k] < 48) || (phrase[k] >= 58 && phrase[k] <= 64) || (phrase[k] >= 91 && phrase[k] <= 96) || (phrase[k] >= 123)){
			k++;
		}		
		phraseNoSpaces[i] = phrase[k];
		
		//trocar pra um loop especifico, nao esta fucnionando aqui
		backwardsNoSpaces[j] = phraseNoSpaces[i];
	}
	phraseNoSpaces;
	backwardsNoSpaces;
	//if apenas pra debug
	if(1){
		i = 0;
	}
	//compara as duas strings
	for(i = 0, j = 0; phraseNoSpaces[i] != '\0', j < size; i++, j++){
		if(phraseNoSpaces[i] == backwardsNoSpaces[j]){
			itIs = 1;
		}
		else{
			itIs = 0;
			break;
		}
	}
	if(itIs){
		printf("Eh palindromo\n");
	}
	if(itIs == 0){
		printf("Nao eh palindromo\n");
	}
	printf("%s\n%s\n", phraseNoSpaces, backwardsNoSpaces);
	printf("%s\n%s\n", phrase, backwards);	
	return 0;
}
