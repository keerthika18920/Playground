#include<iostream>
using namespace std;
int main()
{
  //Type your code here. 
  int num,temp,sum=0,r; 
  cin>>num; 
  temp=num; 
  while(num>0) 
  { 
    r=num%10; 
    sum=sum+r;
    num=num/10; 
  } 
  if(temp%sum==0) 
    cout<<"Harshad Number"; 
  else 
    cout<<"Not Harshad Number"; 
}