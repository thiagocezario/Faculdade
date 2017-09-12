#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
int EvenOrOdd(int value){
	int i = 0;
	
	if(value & 1){
		return 1;
	}
	else if(value & 0){
		return 0;
	}
	
}

int ReadList(int value){
	int i = 0;
	
	scanf("%d", &value);
	return value;
}

int main(int argc, char *argv[]) {
	int list[50];
	int i = 0;
	
	printf("Insert the values for the list: \n");
	for(i = 0; i < 50; i++){
		list[i] = ReadList(list[i]);
		if(list[i] == 0){
			break;
		}
		if(EvenOrOdd(list[i])){
			printf("The number %d is odd\n", list[i]);
		}
		else{
			printf("The number %d is even\n", list[i]);
		}
	}
	
	return 0;
}
