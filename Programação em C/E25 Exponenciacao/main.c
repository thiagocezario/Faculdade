#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a, b, i, result=1;

	printf("Entre com um numero: ");
	scanf("%d", &a);
	
	printf("Entre com um expoente: ");
	scanf("%d", &b);

    for (i = 0; i < b; ++i)
        result *= a;

	printf("A exponenciacao eh %d\n", result);

	
	
	return 0;
}
