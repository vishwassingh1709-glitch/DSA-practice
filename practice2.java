import java .util.*;
 class vish {
	 void shortarray0and1( int arr []){
		 int n = arr.length;
		 int i= 0;
		 int j = n-1;
		 while ( i<j)
		 {
			 if ( arr[i]==1 &&arr[ j]==0){
				 int temp= arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
			 else{
				 if ( arr[i]==0){
				 i++;}
				 if(arr[j]==1){
				 j--;}
			 }
	 }
	 }
 }
		
class main {
	 public static void main( String arry[]){
		 int arr []= { 0,1,0,1,0,1};
		 vish v1 = new vish();
		 v1.shortarray0and1(arr);
		 for ( int k : arr){
			 System.out.print(k);
		 }
	 }
 }