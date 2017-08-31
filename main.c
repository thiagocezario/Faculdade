#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char vet[80];
	char *p;
	int i = 0;
	
	gets(vet);
	
	while(i<80 && vet[i] != '\0'){
	
		if(vet[i] > 96 && vet[i] < 123){
			vet[i] += -32;
			
		}
		i++;
	}
	printf("%s\n", vet);
	
	p = vet;
	

	
	printf("%s  %c  %x  %d", p, *p, p, &vet);
	
	
	return 0;
}
