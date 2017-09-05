#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char text[80];
	int i = 0;
	
	gets(text);
	
	printf("Text typed: %s\n", text);
	while (text[i] != '\0'){
		if((text[i] >= 'a' && text[i] < 'z') || (text[i] >= 'A' && text[i] < 'Z')){
			if(text[i] == 'x'){
				text[i] = 'a';
			}
			else if(text[i] == 'y'){
				text[i] = 'b';
			}
			else if(text[i] == 'z'){
				text[i] = 'c';
			}
			else if(text[i] == 'X'){
				text[i] = 'A';
			}
			else if(text[i] == 'Y'){
				text[i] = 'B';
			}else if(text[i] == 'Z'){
				text[i] = 'C';
			}
			else{
				text[i] += 3;	
			}	
			
		}
		i++;
	}
	printf("Text codified: %s\n", text);
	
	return 0;
}
