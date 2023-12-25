#include<stdio.h>
int main()
{
    float score;
    printf("Enter score : ");
    scanf("%f",&score);

    if( score >= 90 )
        printf("Grade A \n Excellent ");
    else if( score >= 80 )
        printf("Grade B \n Very Good ");
    else if( score >= 70 )
        printf("Grade C \n Good ");
    else if( score >= 60 )
        printf("Grade D \n Bad ");
    else 
        printf("Grade F ");
}
