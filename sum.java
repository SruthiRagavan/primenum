package com.java2novice.algos;
 
public class MyNumberSumRec {
 
    int sum1 = 0;
     
    public int getNumberSum(int number){
         
        if(number1 == 0){
            return sum1;
        } else {
            sum1 += (number1%10);
            getNumberSum(number1/10);
        }
        return sum1;
    }
     
    public static void main(String a[]){
        MyNumberSumRec mns = new MyNumberSumRec();
        System.out.println("Sum is: "+mns.getNumberSum(223));
    }
}
