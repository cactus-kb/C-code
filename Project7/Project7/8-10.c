#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<windows.h>
#if 0
//дһ���������ز����������� 1 �ĸ��� 
int count_one_bits(unsigned int n)
{
	int count = 0;
	while (n != 0)
	{
		n = n & (n - 1);
		count++;
	}
	return count;
}
int main()
{
	printf("%d\n", count_one_bits(-1));
	system("pause");
	return 0;

}


// ���һ��������ÿһλ�� 
void print(int n)
{
	if (n > 9)
	{
		print(n / 10);
	}
	printf("%d ", n % 10);
}

int main()
{
	int num = 12345;
	print(num);
	system("pause");
	return 0;
}
#endif

//��ȡһ�������������������е�ż��λ������λ,�ֱ�������������С�
void print_num(unsigned n)
{
	int count = 0;//��������� λ��
    int a[32] = { 0 };
	int i = 0;
   while (n)
   {
       a[i++] = n % 2;
	   n /= 2;
	  count++;
	}
	 printf("��������\n");
  for (i = count; i >= 0; i -= 2)
  {
	   printf("%d ", a[i]);
		
	}
	   printf("\n");
    printf("ż������\n");
    for (i = count - 1; i >= 0; i -= 2) 
	{
	        printf("%d ", a[i]);
	}
	   printf("\n");
 }
int main()
{
	//printf(\n");
	int n = 11;//01011
	print_num(n);
	system("pause");
	return 0;
}