//���� 
#include<stdio.h>
#include<string.h>
//����ȫ�ֱ��� �������������Ե��� 
	int a[101];
 void quicksort(int left,int right)
{
	printf("�Ѿ�����ѭ��!");
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
	 //�û�׼����λ
	a[left]=a[i];
	a[i]=temp;
	quicksort(left,i-1);
	quicksort(i+1,right);
	return ;	 
}
 int main(void){
 	int i,n;
 
 	printf("������Ҫ��������ĸ���:");
 	scanf("%d",&n);
 	for(i=1;i<=n;i++)
 	{
	 scanf("%d",&a[i]);
	}

	quicksort(1,n);
	//�����������
	for(i=1;i<=n;i++) 
	printf("%d   ",a[i]);
	
	getchar();
	getchar();
	return 0;
 }
 
 
