#include <stdio.h>
#include <math.h>
int main()
{
    int a, b, i, temp, temp1, rem, n = 0, res = 0;

    printf("Enter two numbers(intervals): ");
    scanf("%d %d", &a, &b);
    printf("Armstrong numbers between %d an %d are: ", a, b);

    for(i = a+1; i<b; ++i)
    {
        temp1 = i;
        temp = i;
        while (temp != 0)
        {
            temp /= 10;
            ++n;
        }
        while (temp1 != 0)
        {
            rem = temp1%10;
            res += pow(rem, n);
            temp1 /= 10;
        }
        if (res == i) {
            printf("%d ", i);
        }

        n = 0;
        res = 0;

    }
    return 0;
}