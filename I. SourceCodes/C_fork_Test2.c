#include<stdio.h> 

main() 
{ 
   int x=1004; 
   printf("fork() 호출전 데이터 :%d\n",x); 

   fork(); 
   x=x+2; 
   printf("변수값 변화여부 확인 :%d\n",x);   //부모 프로세스와 자식 프로세스 동시 수행
 
   fork();    //두 번째 fork() 호출, 리턴값 받아서 찍어볼 수 있다. ...fork1.c 참조
   x=x+3; 
   
   printf("프로세스 숫자와 변수값 비교 :%d\n",x); 
} 