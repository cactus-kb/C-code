#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<windows.h>
#if 0
int Fun() {
	int a = 0x12345678;
	char* p = (char *)&a;
	if (*p == 0x78) {
		return 1;//小端
	}
	return 0;
}
int main() {
	int ret = Fun();
	if (ret == 1) {
		printf("是小端！\n");
	}
	else {
		printf("是大端！\n");
	}
	system("pause");
	return 0;
}


//四种方法求一个整数存储在内存中的二进制中1的个数
int Num(int n) {
	int count = 0;
	while (n != 0) {
		if (n % 2 == 1) {
			count++;
		}
		n = n / 2;
	}
	return count;
}
int main() {
	printf("%d\n", Num(13));
	system("pause");
	return 0;
}

//但是这个代码是有一定问题的，倘若要求“-1”存储在内存中的二进制中1的个数；
//因为“-1”在内存中是以补码的形式存储的，我们知道其为整型，就有32个1；但是用这段代码打印出来的结果为0；
//若要求“-1”，可以将int Num(int n)改为int Num(unsigned int n)。

int Num1(unsigned int n) {
	int i = 0;
	int count = 0;
	for (i = 0; i < 32; i++) {
		if ((n & 1) != 0) {
			count++;
		}
		n = n >> 1;
	}
	return count;
}
int main() {
	printf("%d\n", Num1(15));
	system("pause");
	return 0;
}

//用这个代码移位需要一直移到32次，若求5的二进制中1的个数，只需要移动3次就可以了，剩下的都为0，不需要再移；
//但该代码会一直移动32次。所以优化为如下代码：移完一位后，判断当前数字是否为0，若是，则结束循环，不是，则继续移动直至当前数字为0.
int Num2(unsigned int n) {
	int i = 0;
	int count = 0;
	while(n != 0) {
		if ((n & 1) != 0) {
			count++;
		}
		n = n >> 1;
	}
	return count;
}
int main() {
	printf("%d\n", Num2(15));
	system("pause");
	return 0;
}

int Num3(unsigned int n) {
	int count = 0;
	while (n != 0) {
		count++;
		n = n & (n - 1);//每与一次就会少一个1
	}
	return count;
}
int main() {
	printf("%d\n", Num3(15));
	system("pause");
	return 0;
}
#endif



int Fun1() {
	union un {
		short sh;
		char ch;
	}u;//从低地址开始共用内存
	u.sh = 0x1234;
	return u.ch;
}
int main() {
	int ret = Fun1();
	if (ret == 0x34) {
		printf("是小端！\n");
	}
	else {
		printf("是大端！\n");
	}
	system("pause");
	return 0;
}




 
