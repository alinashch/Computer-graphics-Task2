package com.company;
public class Logic {

  public static int [] OneOnThree(int [] arr1,  int m, int n, double A){
      int [] result=multiplicationOnMandN( multiplication(multiplicationOnMandN(arr1,-m,-n),A),m,n);
      return result;
  }
  public static int [] multiplication(int [] arr, double A){
      int [] result= new int[arr.length];
      result[0]= (int) Math.ceil (arr[0]*Math.cos(A)+arr[1]*(Math.sin(A)));
      result[1]= (int) Math.ceil (arr[0]*(-Math.sin(A))+arr[1]*(Math.cos(A)));
      result[2]=  arr[2]*1;
      return result;
  }
  public static int [] multiplicationOnMandN(int [] arr1,  int m, int n){
      int [] result= new int[arr1.length];
      result[0]=arr1[0]*1+ arr1[1]* 0+arr1[2]*(m);
      result[1]=arr1[0]*0+ arr1[1]* 1+arr1[2]* (n);
      result[2]=arr1[0]*0+ arr1[1]*0+arr1[2]*1;
      return result;
  }
  public static int [] Scale(int [] arr1, int x){
      int [] result=new int[arr1.length];
      for(int i=0; i< arr1.length; i++){
          result[i]=arr1[i]*x;
      }
      return result;
  }
  public static int []  multiplicationX(int [] arr, int m){
      int [] result= new int[arr.length];
      for(int i=0; i< arr.length; i++){
          result[0]=arr[0]*m;
          result[i]=arr[i];

      }
      return result;
  }
    public static int []  multiplicationY(int [] arr, int m){
        int [] result= new int[arr.length];
        for(int i=0; i< arr.length; i++){
            result[i]=arr[i];
            result[1]=arr[1]*m;
        }
        return result;
    }
}
