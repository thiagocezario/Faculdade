#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char text[80];
	int i = 0;
	gets(text);
	
	printf("text typed: %s\n", text);
	
	for(i = 0; i < 80; i++){
		if(text[i] >= 'a' && text[i] <= 'z'){
		text[i] += -32;
		}
	}
	printf("All Capital: %s\n", text);
	
	for(i = 0; i < 80; i++){
		if(text[i] >= 'A' && text[i] <= 'Z'){
		text[i] += 32;
		}
	}
	printf("No Capital: %s\n", text);
	
	for(i = 0; i < 80; i++){
		if(text[0] >= 'a' && text[0] <= 'z')
			text[0] += -32;
		if(text[i] == ' '){
		text[i+1] += -32;
		}
	}
	printf("First letter of word capital: %s\n", text);
	
	return 0;
}
