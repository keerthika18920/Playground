#include <iostream> 
using namespace std;
int main() 
{
	// Type your code here 
  int n,r,t=0; 
  cin>>n; 
  while(n!=0) 
  { 
    r=n%10; 
    t=t*10+r; 
    n=n/10; 
  } 
  cout<<t<<endl; 
  return 0;
}