#include <stdio.h>
#include <string.h>

#define MAXCHAR 100000

void main()
{
    FILE *fp;
    char str[MAXCHAR];
    char ch;
    char* filename = "C:\\Users\\Thiago\\Documents\\Faculdade\\Faculdade\\Estrutura de dados II\\8mb.txt";
    int count = 0, i, j = 0;

    fp = fopen(filename, "r");
    if (fp == NULL){
        printf("Could not open file %s",filename);
        return 1;
    }
    /*
    while (fgets(str, MAXCHAR, fp) != NULL) {
        printf("%s", str);
        str[j] = fgets(str, MAXCHAR,fp);
        j++;
        for (i = 0;str[i] != '\0';i++)
        {
            if (str[i] == ' ')
                count++;
        }
    }*/

    while(ch != EOF)
    {
        str[j]=ch;
        printf("Str na iteracao %d do while", j);
        printf(" %s\n", str);
        j++;
        ch=fgetc(fp);
        if (ch = '\n') {
            count++;
        }
    }

    fclose(fp);


    printf("%s","--------\n--------\n--------\n--------\n--------\n--------\n--------\n--------\n--------\n");
    printf("%s","--------\n--------\n--------\n--------\n--------\n--------\n--------\n--------\n--------\n");
    printf("%s","--------\n--------\n--------\n--------\n--------\n--------\n--------\n--------\n--------\n");
    printf("%s", str);

    printf("number of words in given string are: %d\n", count + 1);
}
