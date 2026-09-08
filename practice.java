 // reverse of array by two pointer techinique.
 import java .util.*;
 class vish {
	 void reversearray( int arr []){
		 
	  int i=0;
	  int n = arr.length;
	  int j =n-1;
	  while ( i<=j){
		  int tem= arr[i];
		  arr[i]= arr[j];
		  arr[j]= tem;
		  i++;
		  j--;
	  }
	 }
 }
 class main {
	 public static void main( String arry[]){
		 int arr []= { 1,2,3,4,5,};
		 vish v1 = new vish();
		 v1.reversearray(arr);
		 for ( int k : arr){
			 System.out.print(k);
		 }
	 }
 }