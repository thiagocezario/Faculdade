#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a = 1;
	
	while(a != 0)
	{
		printf("Entre com um valor: ");
		scanf("%d", &a);
		if(a ==0){
			break;	
		}
		else if(a%2==0){
			printf("par");
			printf("\n");
		}
		else{
			printf("impar");
			printf("\n");
		}
		
	}
	return 0;
}
