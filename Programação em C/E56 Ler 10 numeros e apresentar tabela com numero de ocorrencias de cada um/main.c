#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int isRepeated(int vet[], int values, int count){
	int i = 0;
	int repeated = 0;
	
	for(i = 0; i < count; i++){
		if(values == vet[i]){
			repeated++;
		}
	}
	if (repeated > 0){
		return 1;
	}
	else{
		return 0;
	}
}

int Occurrence(int vet[], int values){
	int i = 0;
	int repeatedTimes = 0;
	
	for(i = 0; i < 10; i++){
		if(values == vet[i]){
			repeatedTimes++;
		}
	}
	return repeatedTimes;
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
	printf("Entrada\tNumero de ocorrencias\n");
	for(count = 0; count < 10; count++){
		if(!isRepeated(vet, vet[count], count)){
			printf("%d\t%d\n", vet[count], Occurrence(vet, vet[count]));
		}	
	}
	
	
	return 0;
}

