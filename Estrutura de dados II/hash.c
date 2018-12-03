#include <stdio.h>
#define MAXCHAR 10000
#define WORDSIZE 50

struct dict {
    char *value;
    int frequency;
    int key;
};

void main() {
    FILE *fp;
    char* filename = "C:\\Users\\Thiago\\Documents\\Faculdade\\Faculdade\\Estrutura de dados II\\8mb.txt";
    char str[WORDSIZE];
    struct dict hash_table[MAXCHAR];

    fp = fopen(filename, "r");
    if (fp == NULL){
        printf("Could not open file %s",filename);
        return;
    }

    while (fgets(str, MAXCHAR, fp) != NULL) {
        printf("%s", str);
        int j = 0, positionValue = 0;
        char tempWord[WORDSIZE];


        for(j = 0; str[j] != EOF && str[j] != '\n'; j++) {
            if (str[j] > 32 && str[j] < 127){
                tempWord[j] = str[j];
                positionValue += str[j];
            } else {
                hash_table[positionValue%WORDSIZE].value = tempWord;
                hash_table[positionValue%WORDSIZE].frequency++;
                printf("%s\n", hash_table[positionValue%WORDSIZE].value);
                printf("%d\n", hash_table[positionValue%WORDSIZE].frequency);
                positionValue = 0;
            }
        }
    }

    fclose(fp);

    return;
}
