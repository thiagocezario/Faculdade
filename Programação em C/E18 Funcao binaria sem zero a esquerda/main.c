#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int IsBit(char vet[], int a){
	int i, j, k = 0;		
	
	
	for(k = 31; k >= 0; k--){
		if(a >> k & 1){
			break;
		}
	}
	
	for(i = 0, j = k; i < k, j >= 0; i++, j--){
		if(a >> i & 1){
			vet[j] = '1';
		}	
		else{
			vet[j] = '0';
		}
	}
	vet[k+1] = '\0';
}

int main(int argc, char *argv[]) {
	char vet[33];
	int a;
	
	scanf("%d", &a);
	
	IsBit(vet, a);
	
	printf("%s", vet);
	
	return 0;
}
