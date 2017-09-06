#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	printf("%d\t%d\n", ~0x55, 0x55);
	printf("%d\t%d\n",  0x09 << 2, 0x09);
	printf("%d\t%d\n",  0x09 >> 2, 0x09);
	printf("%d\t%d\n", 0xFF >> 2, 0xFF);
	printf("%d\t%d\n", 0xFF << 2, 0xFF);
	
	return 0;
}
