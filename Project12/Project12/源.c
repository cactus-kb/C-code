#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<windows.h>
#if 0
int Fun() {
	int a = 0x12345678;
	char* p = (char *)&a;
	if (*p == 0x78) {
		return 1;//С��
	}
	return 0;
}
int main() {
	int ret = Fun();
	if (ret == 1) {
		printf("��С�ˣ�\n");
	}
	else {
		printf("�Ǵ�ˣ�\n");
	}
	system("pause");
	return 0;
}


//���ַ�����һ�������洢���ڴ��еĶ�������1�ĸ���
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

//���������������һ������ģ�����Ҫ��-1���洢���ڴ��еĶ�������1�ĸ�����
//��Ϊ��-1�����ڴ������Բ������ʽ�洢�ģ�����֪����Ϊ���ͣ�����32��1����������δ����ӡ�����Ľ��Ϊ0��
//��Ҫ��-1�������Խ�int Num(int n)��Ϊint Num(unsigned int n)��

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

//�����������λ��Ҫһֱ�Ƶ�32�Σ�����5�Ķ�������1�ĸ�����ֻ��Ҫ�ƶ�3�ξͿ����ˣ�ʣ�µĶ�Ϊ0������Ҫ���ƣ�
//���ô����һֱ�ƶ�32�Ρ������Ż�Ϊ���´��룺����һλ���жϵ�ǰ�����Ƿ�Ϊ0�����ǣ������ѭ�������ǣ�������ƶ�ֱ����ǰ����Ϊ0.
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
		n = n & (n - 1);//ÿ��һ�ξͻ���һ��1
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
	}u;//�ӵ͵�ַ��ʼ�����ڴ�
	u.sh = 0x1234;
	return u.ch;
}
int main() {
	int ret = Fun1();
	if (ret == 0x34) {
		printf("��С�ˣ�\n");
	}
	else {
		printf("�Ǵ�ˣ�\n");
	}
	system("pause");
	return 0;
}




 
