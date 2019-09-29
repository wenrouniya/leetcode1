#include <stdio.h>
int main(void)
{
    int a[5]={3,2,5,4,7};
    int  target=8;
    int size=sizeof(a)/sizeof(a[0]);
    
    for(int i=0;i<size-1;i++)
    {
        for(int j=i+1;j<size;j++)
        {
            if(a[i]+a[j]==target)
               printf("[%d,%d]",i,j);
        }
        
    }
    
}
