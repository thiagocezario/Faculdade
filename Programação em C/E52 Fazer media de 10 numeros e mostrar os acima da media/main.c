#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int number[10];
	int i = 0;
	float media;
	
	printf("Insira 10 numeros: ");
	for(i = 0; i < 10; i++){
		scanf("%d", &number[i]);
		media += number[i];	
	}
	media /= 10;
	printf("media: %.2f \n", media);
	printf("numeros acima ou igual a media: ");
	
	for (i = 0; i < 10; i++){
		if(number[i] >= media)
		 printf("%d ", number[i]);
	}
	
	return 0;
}
