#include<iostream>
using namespace std;
int main()
{
  //Type your code here. 
  int fa,fd,fs,sa,sd,ss,aa,ad,as,fr,sr,ar,ft,st,at; 
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as; 
  fr=(fa*fd)/100; 
  ft=fa-fr+fs; 
  sr=(sa*sd)/100; 
  st=sa-sr+ss; 
  ar=(aa*ad)/100; 
  at=aa-ar+as; 
  cout<<"In Flipkart Rs."<<ft; 
  cout<<"\nIn Snapdeal Rs."<<st; 
  cout<<"\nIn Amazon Rs."<<at; 
  if((ft<=st)&&(ft<=at)) 
    cout<<"\nHe will prefer Flipkart"; 
  else if(st<=at) 
    cout<<"\nHe will prefer Snapdeal"; 
  else 
    cout<<"\nHe will prefer Amazon"; 
}