#include<iostream>
using namespace std;
int main()
{
  //Type your code here. 
  int n1=0,n2=1,n3,n,i; 
  cin>>n; 
  for(i=2;i<n;++i) 
  { 
    n3=n1+n2; 
    n1=n2; 
    n2=n3; 
  } 
  cout<<n3; 
}