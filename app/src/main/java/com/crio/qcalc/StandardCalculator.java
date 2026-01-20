package com.crio.qcalc;

public class StandardCalculator {

    private int result;

    public int getResult() {
        return result;
    }

    private void setResult(int value) {
        this.result = value;
    }

    

    public void operation1(int temp) {
        //int temp = 5;
        int sq = temp*temp;
       //. System.out.println("sq = " + sq);
        setResult(sq);

    }

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

    
    public void add(int num1, int num2){  
        result = num2 + num1;
    }

    public void subtract(int num1, int num2){
        result = num1 - num2;  
    }

    public void multiply(int num1, int num2){
        result = num1*num2;
    }

    public void divide(int num1, int num2){
        result = num1/num2 ;
    }

    public void clearResult() {
        result =0;
        System.out.println("Resetting the results !!");
    }

    public void printResult() {
        System.out.println("Standard calculator result: " + getResult());
    }

}
