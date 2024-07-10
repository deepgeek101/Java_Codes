#include <iostream>
using namespace std;
void prin(int *arr,int n){
    for(int i=0;i<n;i++)
        cout<< arr[i] <<" ";
}
int findMaxInArray(int a[],int n){
    int m=a[0];
    for(int i=1;i<n;i++)
        if(a[i]>m)
            m=a[i];
return m;
}
//stable sorting algorithm
/*void countingSort(int a[],int n,int d){
    int max=findMaxInArray(a,n);
    int output[n];
    int ct[10];
    
}
*/
void countingSort(int a[],int n,int d){
    int output[n];
    int i,count[10]={0};
    for(i=0;i<n;i++)
        count[(a[i]/d)%10]++;
    for (i = 1; i < 10; i++)
        count[i] += count[i - 1];
    //did not understand the previous two lines and the following three lines
    for (i = n - 1; i >= 0; i--) {
        output[count[(a[i] / d) % 10] - 1] = a[i];
        count[(a[i] / d) % 10]--;
}
  for (i = 0; i < n; i++)
        a[i] = output[i];       
    }
void radixSort(int a[],int n){
    int max=findMaxInArray(a,n);
    
    for(int i=1;max/i>0;i*=10)
        countingSort(a,n,i);
}
int main()
{
    int arr[]={21,29,12,54,11,32,10,26};
    int n=sizeof(arr)/sizeof(arr[0]);
    cout<<"Original Array"<<endl;
    prin(arr,n);
    cout<<endl<<endl<<"Sorted Array"<<endl;
    radixSort(arr,n);
    prin(arr,n);
    return 0;
}