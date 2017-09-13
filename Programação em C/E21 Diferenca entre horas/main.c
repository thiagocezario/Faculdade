#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int hora1, min1, seg1, hora2, min2, seg2, hora3, min3, seg3;
	
	do{
		printf("Entre com os valores da hora1: ");
		scanf("%d", &hora1);
	}while(hora1<0 || hora1 > 23);
	
	do{
		printf("Entre com os valores do min1: ");
		scanf("%d", &min1);
	}while(min1<0 || min1 > 59);
	
	do{
		printf("Entre com os valores do seg1: ");
		scanf("%d", &seg1);
	}while(seg1<0 || seg1 > 59);
	
	printf("\n");
	printf("\n");
	
	do{
		printf("Entre com os valores da hora2: ");
		scanf("%d", &hora2);
	}while(hora2<0 || hora2 > 23);
	
	do{
		printf("Entre com os valores do min2: ");
		scanf("%d", &min2);
	}while(min2<0 || min2 > 59);
	
	do{
		printf("Entre com os valores do seg2: ");
		scanf("%d", &seg2);
	}while(seg2<0 || seg2 > 59);
	
	printf("\n");
	printf("\n");
	
	printf("Primeiro horario %d:%d:%d\n", hora1, min1, seg1);
	printf("Segundo horario %d:%d:%d\n", hora2, min2, seg2);
	
	if(seg1 > seg2){
		seg3 = (60 - seg1) + seg2;
		min1 += 1;
	}
	else{
		seg3 = seg1 - seg2;
		if(seg3 < 0){
			seg3 *= -1;
		}
	}
	
	if(min1 > min2){
		min3 = min2 + (60 - min1);
		hora1 += 1;
	}
	else{
		min3 = min1 - min2;
		if(min3 < 0){
			min3 *= -1;
		}
	}
	hora3 = hora1 - hora2;
	if(hora3 < 0){
			hora3 *= -1;
		}
	
	printf("A diferenca entre os horarios informados eh %d:%d:%d\n", hora3, min3, seg3);
	
	
	return 0;
}
