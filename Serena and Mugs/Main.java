#include<iostream>
using namespace std;
int main()
{
  //Type your code here. 
  int n,c,i,sum=0; 
  cin>>n; 
  cin>>c; 
  int arr[n]; 
  for(i=0;i<n;i++) 
 { 
   std::cin>>arr[i]; 
 } 
  for(i=0;i<n;i++) 
 { 
   sum=sum+arr[i]; 
 } 
  if(sum<=c) 
 { 
   std::cout<<"YES"; 
 } 
  else 
 { 
   std::cout<<"NO"; 
 } 
}