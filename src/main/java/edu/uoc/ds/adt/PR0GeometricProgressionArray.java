package edu.uoc.ds.adt;

public class PR0GeometricProgressionArray {
    private int[] array;

    public PR0GeometricProgressionArray(int a1, int r, int n){
        array= new int[n];
        initializeArray(a1, r);
    }

    private void initializeArray(int a1, int r){
        array[0]= a1;
        for(int i= 1; i< array.length; i++){
            array[i]= array[i-1]*r;
        }
    }

    public int[] getArray(){
        return array;
    }

    public int getIndexOf(int element){
        for(int i=0; i< array.length; i++){
            if (array[i]==element){
                return i;
            }
        }
      return  -1;
    }

    public int binarySearch(int element){
        int left=0;
        int right= array.length-1;
        while (left<=right){
            int mid= (right+left)/2;
            if (array[mid] == element) {

                return mid;
            } else if (array[mid]<element){
                left= mid+1;
            } else {
                right= mid-1;
            }
        }
        return -1;
    }
}
