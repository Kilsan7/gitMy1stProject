// ConsoleApplication1.cpp : �ܼ� ���� ���α׷��� ���� �������� �����մϴ�.
// Static variable�� ���� Class �ٱ����� ���� Setting�ϸ� ��� �Ǵ��� Test

#include "stdafx.h"
#include <iostream>
using namespace std;
template <class T>
void f(T) {
	static int i = 1;
	cout << "Static variable i �� = " << ++i << endl;
}
int main()
{
	f(1);
	f(1.0);  // (1) float�� class ����
	f(1);
	f(9);    // static (class ����)�̶� �� ���� �� �ȴ�. class ȣ�⿡ ���� �� ����(�� ������ class ���ο��� �ؾ� ��)
	f(0);
	f(100);
	f(110);
	f(5.24); // class ȣ�⿡ ���� (1) ���� ++i
	cout << "Class���� ����� Static variable�� ���������� �ܺο��� ���� ������ �� ����." << endl << endl;

	// �Ʒ� �� ���� ��� array�� �� ��° element ���� ����Ѵ�.
	int arr[] = { 5, 6, 7, 8 };
	int *ptr = arr;
	//cout << arr (1);
	cout << "    prt[1] : " << ptr[1] << endl;
	cout << "*(ptr + 1) : " << *(ptr + 1) << endl;
	cout << "    arr[1] : " << arr[1] << endl;
	cout << "Array element�� access �ϴ� ��� array[index], pointer[index], *(pointer + index)" << endl;
}