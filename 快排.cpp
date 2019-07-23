//快排 
#include<stdio.h>
#include<string.h>
//定义全局变量 两个函数都可以调用 
	int a[101];
 void quicksort(int left,int right)
{
	printf("已经进入循环!");
	if(left>right)
	return ;
	
	int i,j,temp,t;
	i=left;
	j=right;
	temp=a[left];
	
	while(i!=j)
	{
		while(a[j]>=temp&&j>i)
		j--;
		while(a[i]<=temp&&i<j)
		i++;
		if(i<j) 
		{
			t=a[i];
			a[i]=a[j];
			a[j]=t;	
		}
	 } 
	 //让基准数归位
	a[left]=a[i];
	a[i]=temp;
	quicksort(left,i-1);
	quicksort(i+1,right);
	return ;	 
}
 int main(void){
 	int i,n;
 
 	printf("请输入要排序的数的个数:");
 	scanf("%d",&n);
 	for(i=1;i<=n;i++)
 	{
	 scanf("%d",&a[i]);
	}

	quicksort(1,n);
	//输出排序后的数
	for(i=1;i<=n;i++) 
	printf("%d   ",a[i]);
	
	getchar();
	getchar();
	return 0;
 }
 
 
