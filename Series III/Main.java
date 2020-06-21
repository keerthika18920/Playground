#include<iostream> 
using namespace std; 
int main() 
{ 
  int i,n,sum=6; 
  cin>>n; 
  for(i=1;i<=n;i++) 
  { 
    if(i==1) 
    { 
      //sum=6; 
      cout<<"6 "; 
    } 
    else 
    {  
      sum=sum+((i-1)*5); 
      cout<<sum<<" "; 
    }
  } 
}
  