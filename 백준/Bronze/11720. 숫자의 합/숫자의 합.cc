#include<iostream>
#include<string>
using namespace std;

int main()
{
	int i,N,a;
	int result = 0;
	string num;
	cin >> N;
	cin >> num;
	for (i = 0; i < N; i++) {
		result += atoi(num.substr(i, 1).c_str());
	}
    cout << result << endl;
}