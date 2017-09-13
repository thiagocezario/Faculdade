#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	int linha = 0;
	int coluna = 0;
	int i = 0;
	
	printf("Tabela de hexadecimais: ");
	printf("\n");
	
	for(linha = 0; linha<16; linha++){
		for(coluna = 0; coluna <16; coluna++){
			printf("%2x ", i);
			i++;
		}
		printf("\n");	
	}
	printf("\n");
	printf("Tabela de numeros octais: ");
	printf("\n");
	
	i = 0;
	
	for(linha = 0; linha<16; linha++){
		for(coluna = 0; coluna <16; coluna++){
			printf("%3o ", i);
			i++;
		}
		printf("\n");	
	}
	
	printf("\n");
	printf("Tabela ASCII: ");
	printf("\n");
	
	i = 0;
	for(linha = 0; linha < 16; linha++){
		for(coluna = 0; coluna < 16; coluna++){
			if(i < 32){
				printf("32  ");
			}
			else{
				printf("%c   ", i);
			}
			i++;
		}
		printf("\n");	
	}
	//&& == and, || == or, ^ == xor
	//em comparações sem simbolo de comparação, 0 é false e qualquer coisa diferente de 0 é true
	//ex: if(5){} -- [retorna true], if(0){} -- [retorna false]
	return 0;
}
