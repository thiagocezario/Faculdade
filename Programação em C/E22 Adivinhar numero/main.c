#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a;
	int r;
	int i;
	
	srand(time(NULL));   //deve ser chamado apenas uma vez
	r = rand() % 101;   //gera um numero aleatorio entre 0 e RAND_MAX, no caso, 0 a 100
	
	for(i = 0; i < 10; i++){
		printf("Tentativa %d de 10, adivinhe o numero: \n", i+1);
		scanf("%d", &a);
		if(a < r){
			printf("Errou, o numero eh maior do que %d\n\n", a);
		}
		if(a > r){
			printf("Errou, o numero eh menor do que %d\n\n", a);
		}
		if (a == r){
			printf("Acertou, o numero eh %d\n", a);
			break;
		}	
	}
	
	printf("Voce tentou %d vezes\n", i+1);
		
	return 0;
}
