#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<windows.h>
//�ݹ鷽ʽʵ�ִ�ӡһ��������ÿһλ 
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
	int num = 1234;
	print(num);
	system("pause");
	return 0;
}


#if 0
//�ݹ�ͷǵݹ�ֱ�ʵ����n�Ľ׳� 
int fac(int n)
{
	if (n <= 1)
	{
		return 1;
	} 
	else
	{
		return n * fac(n - 1);
	}
}
int main() 
{
	int n = 25;
	int fac(n);
	printf("%d\n", fac(n));
	system("pause");   
	return 0;
}


int fac(int n) 
{ 
	int ret = 1; 
	int i = 0;  
	for (i = 1; i <= n; i++)
	{ 
		ret = ret * i;
	}   
	return ret;
    }
int main()
{
	int n = 3;
	int fac(n);
	printf("%d\n", fac(n));  
	system("pause");  
	return 0;
}


//�ݹ�ͷǵݹ�ֱ�ʵ��strlen 
int mystrlen(char* string)
{
	if (*string != '\0')
	{
		return 1 + mystrlen(string + 1);
	}
	else
	{
		return 0;
	}
}
int main()
{
	char string[] = "abcde";
	int ret = mystrlen(string);
	printf("%d\n", ret);
	system("pause");
	return 0;
}


int mystrlen(char* string)
{
	int count = 0;
	while (*string != '\0')
	{
		count++;
		string++;
	}
	return count;
}
int main()
{
	char string[] = "abcde";
	int ret = mystrlen(string);
	printf("%d\n", ret);
	system("pause");
	return 0;
}


//��дһ������ reverse_string(char * string)���ݹ�ʵ�֣� 
//ʵ�֣��������ַ����е��ַ��������С�
//Ҫ�󣺲���ʹ��C�������е��ַ�������������
char * reverse_string(char *string)
{
	int n = 0;	
	char temp;	
	char *q;	
	q = string;	
	while( *string != 0 )	
	{	
		n++;	
		string++;	
	}
	if( n > 1)
	{		
		temp = q[0];	
	    q[0] = q[n-1];	
	    q[n - 1] = '\0';	
	    reverse_string( q+1 );	
	    q[n - 1] = temp;	
	}	
	return q;
} 

int main()
{	
	char string[] = "good";
	printf("ԭ�ַ�����%s\n", string);
	printf("�������к�%s\n", reverse_string(string));
	system("pause");
	return 0;
}
	

//дһ���ݹ麯��DigitSum(n)������һ���Ǹ����������������������֮�ͣ� 
//���磬����DigitSum(1729)����Ӧ�÷���1 + 7 + 2 + 9�����ĺ���19
int DigitSum(int x) {
	if (x > 0)
	{
		return x % 10 + DigitSum(x / 10);
	}
	return 0;
}
int main()
{
	int number, k;
	printf("����������:\n");
	scanf("%d", &number);
	int print = DigitSum(number);
	printf("%d", print);
	system("pause");
	return 0;
}


//��дһ������ʵ��n^k��ʹ�õݹ�ʵ�� 
int funC(int n, int k)
{
	if (k <= 0)
	{
		return 0;
	}
	else if (n == 1)
	{
		return 1;
	}
	else if (k == 1)
	{
		return n;
	}
	else
	{
		return n * funC(n, k - 1);
	}
}
  
int main()
{
	int k = 5;
	int n = 2;
	printf("%d\n", funC(n, k));
	system("pause");
	return 0;
}
		
		
//1.�ݹ�ͷǵݹ�ֱ�ʵ�����n��쳲���������
int Fabonaci(int n)
{
	int f1 = 1;
	int f2 = 1;
	int f3 = 0;
	int i = 0;
	for (i = 3; i <= n; i++)
	{
		f3 = f1 + f2;
		f1 = f2;
		f2 = f3;
	}
	return f3;
}
int main()
{
	printf("%d\n", Fabonaci(40));
	system("pause");
	return 0;
}

int Fabonaci1(int n)
{
	if (n == 1 || n == 2)
	{
		return 1;
	}
	return Fabonaci1(n - 1) + Fabonaci1(n - 2);
}
int main()
{
	printf("%d\n", Fabonaci1(6));
	system("pause");
	return 0;
}
#endif

# if 0
/*
4.
����һ�����飬
ʵ�ֺ���init������ʼ�����顢
ʵ��empty����������顢
ʵ��reverse���������������Ԫ�ص����á�
Ҫ���Լ���ƺ����Ĳ���������ֵ��
*/
void InitArr(int arr[], int sz)
{
	for (int i = 0; i < sz; i++)
		arr[i] = i;
}

void EmptyArr(int arr[])
{
	memset(arr, 0, 40);
}

void ReverseArr(int arr[], int sz)
{
	for (int i = 0; i < sz / 2; i++)
	{
		int tmp = arr[i];
		arr[i] = arr[sz - 1 - i];
		arr[sz - 1 - i] = tmp;
	}
}

int main()
{
	int arr[10] = { 1 };
	int sz = sizeof(arr) / sizeof(arr[0]);	
	system("pause");
	return 0;
}

//int init(int *arr,int len)
//{
//	int i = 0;
//	for (i = 0; i < len; i++)
//	{
//		arr[i] = i + 1;
//	}
//	printf("���г�ʼ����");
//	for (i = 0; i < len; i++)
//	{
//		printf("%d", arr[i]);
//	}
//	printf("\n");
//}


/*int main()
{
	int arr[5] = { 2,5,9,6,3 };
	int i = 0;
	for (i = 0; i < 5; i++)
		{
			arr[i] = 0;
		}
		printf("������գ�");
		for (i = 0; i < 5; i++)
		{
			printf("%d", arr[i]);
		}
		printf("\n");

	system("pause");
	return 0;
}
*/

/*1.ʵ��һ����������ӡ�˷��ھ����ھ���������������Լ�ָ����
����9�����9 * 9�ھ�������12�����12 * 12�ĳ˷��ھ���*/
void Mul(int n)
{
	int i = 0;
	int j = 0;
	for (i = 1; i <= n; i++)
	{
		for (j = 1; j <= i; j++)
		{
			printf("%d * %d\t ",i,j,j * i);
			if (i == j)
			{
				printf("\n");
			}
			}
	}
}
int main()
{
	int n = 10;
    Mul(n);
	system("pause");
	return 0;
}


//3.ʵ��һ�������ж�year�ǲ������ꡣ
int Leapyear(int year)
{
	if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
	{
		return 0;
	}
	return 1;
}

int main()
{
	int year = 2000;
	if (Leapyear(year) == 0)
	{
		printf("is Leapyear\n");
	}
	else
	{
		printf("is not Leapyear\n");
	}
	system("pause");
	return 0;

}


//2.ʹ�ú���ʵ���������Ľ���
void Swap(int *pa, int *pb)
{
	int tmp = 0;
	tmp = *pa;
	*pa = *pb;
	*pb = tmp;
}
int main()
{
	int a = 1;
	int b = 2;
	printf("%d,%d\n", a, b);
	Swap(&a,&b);
	printf("%d,%d\n", a, b);
	system("pause");
	return 0;
}

5.ʵ��һ���������ж�һ�����ǲ�������
int Prime(int num)
{
	int i;
	for (i = 2; i < num; i++)
	{
		if(num%i == 0 )
		{
			return 0;
		}
	}
	return 1;
}
int main()
{
	int ret = Prime(100);
	if (ret == 1)
	{
		printf("is prime\n");
	}
	else
	{
		printf("is not prime\n");
	}
	system("pause");
	return 0;
}

//��ӡ�ַ�������
int MyStrlen(char *p)
{
	if (*p == '\0')
	{
		return 0;
	}
	return 1 + MyStrlen(p+1);
}
int main()
{
	char *p = "abcd";
	printf("%d", MyStrlen(p));
	system("pause");
	return 0;
}

//1234 1 2 3 4
void func(unsigned int n)
{
	if (n >= 9)
	{
		func(n / 10);
	}
	printf("%d ", n%10);
}
int main()
{
	int n;
	func(n = 1234);
	system("pause");
	return 0;
}
#endif

