#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	
	char c = 65;
	int dec = 300;
	float f = 3.2f;
	double d = 3.2d;           //f e d no final faz a convers�o explicita
	
	//dec = c;       a variavel dec vai receber o valor de c sem aviso pois, int � maior que char
	//c = dec;       //vai dar um aviso, pois char � menor que int
	//c = (char)dec;  nao vai gerar erro, pois esta sendo feito um casting, fazendo uma "convers�o" de int para char, mudando apenas a forma de representa��o da variavel
						//e n�o o tipo dela, com perda de informa��o
	
	printf("O codigo ascii decimal %d e hexadecimal %x referem-se ao simbolo %c \n", c, c, c);    //% substitui o valor, d indica decimal, x hexadecimal e c char
	printf("a\tb texto :%10s: ", "casa");         // \t � tabula��o, %10s vai alinhar um texto de at� 10 caracteres � direita, caso queira � esquerda, usar o numero negativo
												  //exemplo, %-10s
	
	return 0;
}
