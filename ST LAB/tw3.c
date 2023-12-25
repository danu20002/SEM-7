#include<stdio.h>

int main()
{
    int a, b, c;
    
    printf("Enter three sides of the triangle: ");
    scanf("%d%d%d", &a, &b, &c);
    if((a > 10) || (b > 10) || (c > 10))
    {
        printf("Out of range");
        exit(0);
    }
    if((a<b+c)&&(b<a+c)&&(c<a+b))
    {
        if((a==b)&&(b==c))
        {
            printf("Equilateral triangle");
        }
            else if((a!=b)&&(a!=c)&&(b!=c))
        {
            printf("Scalene triangle");
        }
        else
            printf("Isosceles triangle");
    }
    else
    {
        printf("triangle cannot be formed");
    }
    return 0;
}
//outputs range need to be changed be carefull when giving output ranges

// Valid triangles:
// Equilateral: (5, 5, 5)
// Isosceles: (2, 2, 4), (4, 5, 5)
// Scalene: (3, 4, 5), (6, 7, 8)

// Invalid triangles:
// Sides less than 1: (0, 1, 2)
// Sides greater than 10: (5, 11, 8)
// Violating triangle inequality: (1, 1, 11), (5, 2, 2)

// Degenerate triangles:
// (1, 1, 0)
