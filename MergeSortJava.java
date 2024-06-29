class MergeSortJava{
public static void merge(int A[],int s,int e){
int i=s;
int k=(s+e)/2;
int t=k+1;
int[] temp=new int[e-s+1];
int c=0;
while(i<=k && t<=e){
	if(A[i]<A[j])
		temp[c++]=A[i++];
	else
		temp[c++]=A[j++];
}
while(i<=k)
	temp[c++]=A[i++];
while(j<=e)
	temp[c++]=A[j++];
for(int g=s;g<=e;g++)
	A[g]=temp[g-s];
return ;
}
public static void mergeSort(int A[],int s,int e){
if(s>=e) return ;
int mid=(s+e)/2;
mergeSort(A,s,mid);
mergeSort(A,mid+1,e);
merge(A,s,e);
}
public static void main(String args[]){
System.out.println("Enter the number of items to sort");
java.util.Scanner sc=new java.util.Scanner(System.in);
int n=sc.nextInt();
System.out.println("Enter the items");
int[] x = new int[n];
for(int i=0;i<n;i++)
	x[i]=sc.nextInt();
System.out.println("You have entered: ");
for(int i=0;i<n;i++)
	System.out.print(x[i]+", ");
mergeSort(x,0,n-1);
System.out.printf("\nSorted Array: \n");
for(int c=0;c<n;c++)
	System.out.print(x[c]+", ");
System.out.println();
}
}