import java.util.*;
class ReverseString{
public static String reverseString(String t){
	return new StringBuilder(t).reverse().toString();
}
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
System.out.println("Enter a string : ");
	String uin=sc.nextLine();
	String r=reverseString(uin);
System.out.println("Original String = "+uin);
System.out.println("Reversed String = "+r);
}
}