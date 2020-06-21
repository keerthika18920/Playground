#include<iostream>
using namespace std;
int main()
{
  //Type your code here. 
  int n; 
  float h,rh; 
  cin>>n>>h; 
  switch(n) 
  { 
    case 1: 
      cout<<h; 
      break; 
    case 2: 
      rh=h+(h*50)/100; 
      cout<<rh; 
      break; 
    case 3: 
      rh=h*2.00; 
      cout<<rh; 
      break; 
    default: 
      cout<<"Number of items is more"; 
  }
}