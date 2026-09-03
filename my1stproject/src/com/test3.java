package com;

public class test3 {
	 public static void main(String[] args) {
	        int[] arr = {5, 6, 7, 9, 10};
	        int n = arr.length; // Total number of elements including the missing one
	        int k=-1;

	        for (int i=0;i<n-1;i++){ {
	            if(arr[i+1]!=arr[i]+1){
	                 k = arr[i]+1;
	                break;
	            }
	        }

	        
	        System.out.println("The missing element is: " + k);}
	    }
}
