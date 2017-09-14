#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int IsPresent(int listOne[], int value){
	int i = 0;
	int isPresent = 0;
	
	for(i = 0; i < 5; i++){
		if(listOne[i] == value){
			isPresent = 1;
			break;
		}
		else{
			isPresent = 0;
		}
	}
	return isPresent;
}

int ReadList(int value){
	int i = 0;
	
	scanf("%d", &value);
	return value;
}

int main(int argc, char *argv[]) {
	int listOne[5];
	int listTwo[50];
	int i = 0;
	
	printf("Insira os valores da primeira lista: \n");
	for(i = 0; i < 5; i++){
		listOne[i] = ReadList(listOne[i]);	
	}
	
	printf("Insira os valores da segunda lista, 0 encerra: \n");
	for(i = 0; i < 50; i++){
		listTwo[i] = ReadList(listTwo[i]);
		if(listTwo[i] == 0){
			break;
		}
		if(IsPresent(listOne, listTwo[i])){
			printf("O numero %d esta na lista\n", listTwo[i]);
		}
		else{
			printf("O numero %d nao esta na lista\n", listTwo[i]);
		}
	}
	
	return 0;
}
