#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int IsBit(char vet[], int a){
	int i, j;
	
	for(i = 0, j = 31; i < 32, j >= 0; i++, j--){
		if(a >> i & 1){
			vet[j] = '1';
		}
		else{
			vet[j] = '0';
		}
	}
}

int main(int argc, char *argv[]) {
	char vet[33];
	int a;
	vet[32] = '\0';
	
	scanf("%d", &a);
	
	IsBit(vet, a);
	
	printf("%s", vet);
	
	return 0;
}
