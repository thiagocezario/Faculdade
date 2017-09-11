#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int Compare(char string[]){
	int i = 0;
	int j = 0;
	int k = 0;
	int compare = 0;
	
	while(string[i] != '\0'){
		for(j = 0, k = StringLength(string); j != '\0', k >= 0; j++, k--){
			if(string[j] != string[k]){
				compare = 0;
				break;
			}
			else if(string[j] == string[k]){
				compare = 1;
			}
		}
		if(!compare){
			break;
		}
		i++;
	}
	return compare;
}

int StringLength(char string[]){
	int i = 0;
	int size = 0;
	
	while(string[i] != '\0'){
		size++;
		i++;
	}
	return size;
}

char Format(char string[]){
	int i = 0;
	int k = 0;
	
	for(i = 0; i < 20; i++){
		if(string[i] >= 'A' && string[i] <= 'Z'){
			string[i] += 32;
		}
	}
	i = 0;
	while(string[i] != '\0'){
		if((string[k] > 0 && string[k] < 48) || (string[k] >= 58 && string[k] <= 64) || (string[k] >= 91 && string[k] <= 96) || (string[k] >= 123)){
			k++;
		}		
		string[i] = string[k];
		i++;
		k++;
	}
	
	return string;
}

int main(int argc, char *argv[]) {
	char string[80];
	int i = 0;
	
	gets(string);
	
	if(Compare(Format(string))){
		printf("O texto '%s' eh palindromo\n", string);
	}
	
	return 0;
}
