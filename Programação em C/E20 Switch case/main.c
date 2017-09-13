#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int a = 0;
	
	while(a != 4){
		do{
			printf("Escolha uma opcao:\nOpcao (1)\nOpcao (2)\nOpcao (3)\nOpcao (4)\n");
			scanf("%d", &a);	
		}while(a < 1 || a > 4);
	
	
		switch(a){
			case 1:
				printf("Escolhido Opcao 1\n");
				break;
			case 2:
				printf("Escolhido Opcao 2\n");
				break;
			case 3:
				printf("Escolhido Opcao 3\n");
				break;
			case 4:
				printf("Escolhido Opcao 4\n");
				break;
			default:
				printf("...\n");
				break;
		}	
	}
	
	
	return 0;
}
