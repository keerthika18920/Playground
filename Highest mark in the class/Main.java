#include<iostream>
int main()
{
  // Type your code here 
  int i,n,max=0; 
  std::cin>>n; 
  int arr[n]; 
  for(i=0;i<n;i++) 
  { 
    std::cin>>arr[i]; 
  } 
  for(i=0;i<n;i++) 
  { 
    if(arr[i]>max) 
      max=arr[i]; 
  } 
  std::cout<<max; 
  return 0; 
}