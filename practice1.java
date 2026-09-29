











import java .util.*;
 class vish {
	 void rightshiftarray( int arr []){
		 int n = arr.length;
		 int tem = arr[n-1];
		 for ( int i= n-1; i>0; i--){
			 arr[i]=arr[i-1];
		 }
		 arr[0]=tem;
	 }
 }
			 

class main {
	 public static void main( String arry[]){
		 int arr []= { 1,2,3,4,5,};
		 vish v1 = new vish();
		 v1.rightshiftarray(arr);
		 for ( int k : arr){
			 System.out.print(k);
		 }
	 }
 }