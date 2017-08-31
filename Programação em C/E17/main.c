#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {
	char strBin[33];
	int num, i;
	
	scanf("%d",&num);
	
	for(i = 0; i < 32; i++){
		strBin[i] = isBit(num,i) == 0 ? '0' : '1';
	}

	
	strBin[32] = '\0';
	printf("%s\n\n", strBin);
	
	return 0;
}
