#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	float number;
	int intPart;
	float decimalPart;
	
	scanf("%f", &number);
	printf("%f\n", number);
	
	intPart = (int)number;
	decimalPart = number - intPart;
	
	printf("%f\n%d\n%f", number, intPart, decimalPart);
	
	return 0;
}
