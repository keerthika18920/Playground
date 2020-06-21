#include<iostream>
using namespace std;
int main()
{
  //Type your code here. 
  int i,b,c,n; 
  //a=121; 
  b=11; 
  cin>>n;
  for(i=1;i<=n;i++) 
  { 
    if(i==1) 
    { 
      cout<<"121"<<" "; 
    }
    else 
    { 
      b=b+4; 
      c=b*b; 
      cout<<c<<" "; 
    } 
  } 
}