#include<iostream>
int main()
{
  // Type your code here 
  int i,n,rno; 
  std::cin>>n; 
  int arr[n],flag=0; 
  for(i=0;i<n;i++) 
  { 
    std::cin>>arr[i]; 
  } 
  std::cin>>rno;
  for(i=0;i<n;i++) 
  { 
    if(arr[i]==rno) 
    { flag=1; 
      break; 
    }
  } 
  if(flag==1) 
     std::cout<<"She passed her exam"; 
  else 
    std::cout<<"She failed"; 
  return 0; 
} 
