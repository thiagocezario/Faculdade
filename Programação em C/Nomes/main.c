#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char nome[1024];
	
	//gets(nome);           //gets == ler string, scanf("%s", nome); tbm le, diferença é que gets passa o endereço de memória, é uma passagem por referencia
						  //scanf interrompe a leitura da string ao chegar em espaços
						  //gets é considerado inseguro
	//fgets(nome, tamanho, stdin); //versao do gets mais segura
	//puts(nome);			  //mostra na tela todo o conteudo da string até chegar no \0
						  //printf("%s", nome); 
	//getch(nome);			//le letra a letra
	return 0;
}
