#include<iostream> 
#include<cstdlib> 
using namespace std;
int main(){
  // Type your code here 
  int *p; 
  int n,count=0,m=0; 
  cin>>n; 
  p=(int *)malloc(2* sizeof(int)); 
  for(int i=0;i<n;i++) 
 { 
   cin>> *(p + i); 
   if(*(p+i)%2!=0) 
 { 
   count++; 
 } 
   else if(*(p+i)%2==0) 
     m++; 
 } 
  cout<<count<<"\n"<<m; 
  return 0;
}