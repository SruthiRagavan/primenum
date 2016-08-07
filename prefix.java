package com.java2novice.algos;
 
import java.util.HashSet;
import java.util.Set;
 
public class Test{
 public static void main(String[] args){
    String s1 = "Mary Had a Little Lamb";
    String s2 = "Mary Had a Big Lamb";
    int minStrLen = s1.length();
    if ( minStrLen > s2.length()){
        minStrLen = s2.length();
    }

    StringBuilder output = new StringBuilder();
    for(int i=0; i<minStrLen; i++){
        if ( s1.charAt(i) ==  s2.charAt(i)){
         output.append(s1.charAt(i));
        }else{
          break;
        }
    }       
    System.out.println(output.toString());
  }
}