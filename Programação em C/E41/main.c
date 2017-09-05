#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char phrase[30];
	char backwards[30];
	int i = 0;
	int j = 0;
	int p = 0;
	int start = 0;
	int itIs = 0;
	
	gets(phrase);
	
	for(start = 0; start < 30; start++){
		if(phrase[start] == '\0'){
			break;
		}
	}
	
	for(i = 0; i <= start; i ++){
		if(phrase[i] >= 'A' && phrase[i] <= 'Z'){
			phrase[i] += 32;
		}
	}
	for(i = 0, j = start; i <= start, j >= 0; i++, j--){
		if(phrase[i] == '\0'){
			break;
		}
		if((phrase[i] < 'a' || phrase[i] > 'z')){
			i++;
		}
		
		backwards[j] = phrase[i];
	}
	
	for(i = 0, j = 0; phrase[i] != '\0', j <= start; i++, j++){
		if(phrase[i] == backwards[j]){
			itIs = 1;
		}
		else{
			itIs = 0;
			break;
		}
	}
	if(itIs){
		printf("It is");
	}
	if(itIs == 0){
		printf("It isnt");
	}
	
	printf("%s\n%s\n", phrase, backwards);	
	return 0;
}
