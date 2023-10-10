package edu.uoc.ds.adt;

public class PROFibArray {
    private int[] fibArray;

    public PROFibArray(){
        fibArray= new int[20];
        initializeFibArray();
    }

    private void initializeFibArray(){
        fibArray[0]=0;
        fibArray[1]=1;
        for (int i=2; i<20; i++){
            fibArray[i]= fibArray[i-1]+fibArray[i-2];
        }
    }

    public int[] getFibArray(){
        return fibArray;
    }
}
