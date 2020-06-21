#include<iostream>
using namespace std;
int main()
{
  //Type your code here. 
  int b,c,x,y; 
  cin>>b>>c; 
  if(b>c) 
  { 
    x=1900+b; 
    y=2000+c; 
    cout<<y-x; 
  } 
  else 
    cout<<c-b; 
}