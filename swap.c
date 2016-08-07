#include <stdio.h>
#include <conio.h>
#include <string.h>
void main(){
     char st[20],tmp;
     int a,b;
     clrscr();
     printf("\nEnter a string : ");
     scanf("%s",st);
     printf("\n\nOriginal String     : %s",st);
     for(a=0;a<strlen(st);a=a+2){
     tmp = st[a];
     st[a] = st[a+1];
     st[a+1] = tmp;
     }
     printf("\nAfter Swap String      : %s",st);
     getch();
}