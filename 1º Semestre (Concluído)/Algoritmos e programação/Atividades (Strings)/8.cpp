#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <windows.h>
#include <string.h>

int main()
{
    UINT CPAGE_UTF8 = 65001;
    SetConsoleOutputCP(CPAGE_UTF8);





}

//FUP que leia uma string e um caracter, o programa deve escrever a string lida, sendo que a cada caracter da string deve ser adicionado o caracter lido. Por exemplo, lê a string AULA e o caracter T, escreve ATUTLTAT.