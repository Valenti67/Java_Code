#include <stdio.h>
#include <math.h>
#include <assert.h>
#include <windows.h>

void Print(int *arr, int num)
{
	assert(arr);
	for (int i = 0; i < num; i++){
		printf("%d ", *(arr + i));
	}
	printf("\n");
	//int *end = arr + num;
	//for (; arr < end; arr++){
	//	printf("%d ", *arr);
	//}
}
void ReverseString(char *str)
{
	assert(str);

	char *start = str;
	char *end = str + strlen(str) - 1;

	while (start < end){
		char temp = *start;
		*start = *end;
		*end = temp;
		start++, end--;
	}
}

int SnTotal(int base, int num)
{
	int total = 0;
	for (int i = 0; i < num; i++){
		int sum = base;
		for (int j = 0; j < i; j++){
			sum = sum * 10 + base;
		}
		printf("----- %d\n", sum);
		total += sum;
	}

	return total;
}
//0, 1
int IsNarcissus(int x)
{
	//1. ��λ��
	int num = 0;
	int temp = x;
	while (temp){
		temp /= 10;
		num++;
	}

	//2. ���
	//3. ��num�η�
	//4. ���ۼ�
	int result = 0;
	temp = x;
	while (temp){
		int data = temp % 10;
		result += (int)pow(data, num);
		temp /= 10;
	}

	return result == x;
}

int DrinkSoda(int money)
{
	int total = money;
	int empty = money;

	while (empty > 1){
		total += empty / 2;
		empty = empty / 2 + empty % 2;
	}

	return total;
}

int Strlen(const char *str)
{
	//int count = 0;
	//while (*str){
	//	str++;
	//	count++;
	//}

	//return count;

	//if (*str == '\0'){
	//	return 0;
	//}

	//return 1 + Strlen(str + 1);
	//"abc"
	//assert(str);

	//const char *end = str; //"abc\0"
	//while (*end){
	//	end++;
	//}
	//return end - str;
}

char *MyStrcpy(char *dst, const char *src)
{
	assert(dst);
	assert(src);
	char *ret = dst; //?????

	while (*dst = *src){
		dst++, src++;
	}

	return ret;
}

//10-> 1010 -> 2*(1*2^1..1*2^0)+0*2^0

void SwitchOdd2Even(int arr[], int num)
{
	int left = 0;
	int right = num - 1;
	while (left < right){
		while (left < right && (arr[left] & 1)){
			left++;
		}
		while (left < right && !(arr[right] & 1)){
			right--;
		}

		if (left < right){
			arr[left] ^= arr[right];
			arr[right] ^= arr[left];
			arr[left] ^= arr[right];
		}
	}
}
int main()
{
	char diamond[10][10] = {
		"    *",
		"   ***",
		"  *****",
		" *******",
		"*********",
		" *******",
		"  *****",
		"   ***",
		"    *"
	};
	int num = sizeof(diamond) / sizeof(diamond[0]);
	for (int i = 0; i < num; i++){
		printf("%s\n", diamond[i]);
	}

	//��������ʹ����ȫ����λ��ż��ǰ��(��α�֤����ż��ԭʼ˳�򲻱�)
	//int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	//int num = sizeof(arr) / sizeof(arr[0]);
	//SwitchOdd2Even(arr, num);
	//strcpy(dst, src)ʵ��
	//const char *src = "hello world";
	//char dst[16] = { '\0' };
	//MyStrcpy(dst, src);
	//printf("%s\n", dst);

	//ģ��ʵ�ֿ⺯��strlen
	//const char *str = "aaaaaa";
	//int len = Strlen(str);
	//printf("%d\n", len);
	//����ˮ��1ƿ��ˮ1Ԫ��2����ƿ���Ի�һƿ��ˮ��
	//��20Ԫ�����Զ�����ˮ�����ʵ�֣���
	//int money = 20;
	//int total = DrinkSoda(money);
	//printf("total = %d\n", total);
	//��ӡˮ�ɻ���
	//��Ŀ���� :
	//���0��100000֮������С�ˮ�ɻ������������
	//��ˮ�ɻ�������ָһ��nλ�������λ���ֵ�n�η�֮
    //��ȷ�õ��ڸ��������� : 153��1 ^ 3��5 ^ 3��3 ^ 3��
	//��153��һ����ˮ�ɻ�������

	//for (int i = 0; i < 100000; i++){
	//	if (IsNarcissus(i)){
	//		printf("%d ", i);
	//	}
	//}
	//printf("\n");
	//��Sn = a + aa + aaa + aaaa + aaaaa��ǰ5��֮�ͣ�����a��һ�����֣�
	//���磺2 + 22 + 222 + 2222 + 22222
	//int sn = SnTotal(2, 5);
	//printf("total:%d\n", sn);
	//unsigned long pulArray[] = { 6, 7, 8, 9, 10 };
	//unsigned long *pulPtr;
	//pulPtr = pulArray;
	//*(pulPtr + 3) += 3;
	//printf("%d, %d\n", *pulPtr, *(pulPtr + 3));

	//�ַ�������
	//char str[] = "abcd1234";
	//printf("Before: %s\n", str);
	//ReverseString(str);
	//printf("After : %s\n", str);
	//int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
	//int num = sizeof(arr) / sizeof(arr[0]);

	//Print(arr, num);
	system("pause");
	return 0;
}