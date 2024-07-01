public class QuickSortJava{
/*
//public static void swap(int &a,int &b)
public static void swap(int *a,int *b){
int c=*a;
*a=*b;
*b=c;
return ;	
}*/
public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
public static int Partition(int[] A,int p,int r){
int i=p-1;
int x=A[r];
for(int j=p;j<=r-1;j++){
	if(A[j]<=x){
	i++;
	swap(&A[i],&A[j]);
	}
}
swap(&A[i+1],&A[j]);
return i+1;
}
public static void QuickSort(int[] A,int p,int r){
if(p<r){
int q=Partition(A,p,r);
QuickSort(A,p,q-1);
QuickSort(A,q+1,r);
}
}
public static void main(String args[]){
int[] a = {13,11,9,21,12,10,19};
int n = a.length;
System.out.println("Original Array:");
for(int i=0;i<n;i++)
System.out.print(a[i]+", ");
System.out.println();
QuickSort(a,0,n-1);
System.out.println("Sorted Array : ");
for(int i=0;i<n;i++)
	System.out.print(a[i]+", ");
System.out.printf("\n");

}
}