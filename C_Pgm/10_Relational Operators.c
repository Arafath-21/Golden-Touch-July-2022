#include <stdio.h>
int main()
{
int a = 5, b = 5, c = 10;
printf("%d == %d is %d \n", a, b, a == b);/*Equal to*/
printf("%d == %d is %d \n", a, c, a == c);
printf("%d > %d is %d \n", a, b, a > b);/*Greater*/
printf("%d > %d is %d \n", a, c, a > c);
printf("%d < %d is %d \n", a, b, a < b);/*Lesser*/
printf("%d < %d is %d \n", a, c, a < c);
printf("%d != %d is %d \n", a, b, a != b);/*Not equal*/
printf("%d != %d is %d \n", a, c, a != c);
printf("%d >= %d is %d \n", a, b, a >= b);/*Greater than or equal to*/
printf("%d >= %d is %d \n", a, c, a >= c);
printf("%d <= %d is %d \n", a, b, a <= b);/*Less than or equal to*/
printf("%d <= %d is %d \n", a, c, a <= c);
return 0;
}
/*
true - 1
False - 0
*/
