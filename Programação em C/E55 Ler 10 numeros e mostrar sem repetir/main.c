#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int isRepeated(int vet[], int values, int count){
	int i = 0;
	int repeatedTimes = 0;
	
	for(i = 0; i < count; i++){
		if(values == vet[i]){
			repeatedTimes++;
		}
	}
	if (repeatedTimes > 0){
		return 1;
	}
	else{
		return 0;
	}
}

int main(int argc, char *argv[]) {
	int count = 0;
	int vet[10];
	int a = 0;
	
	for(count = 0; count < 10; count++){
		do{
		printf("Entre com um valor entre 1 e 5 para a posicao %d: ", count);
		scanf("%d", &a);
		}while(a < 1 || a > 5);
		vet[count] = a;
	}
	
	for(count = 0; count < 10; count++){
		if(!isRepeated(vet, vet[count], count)){
			printf("%d ", vet[count]);
		}	
	}
	
	
	return 0;
}
