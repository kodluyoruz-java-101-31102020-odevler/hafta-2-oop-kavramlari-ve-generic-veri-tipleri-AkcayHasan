package com.java.Soru3;

import java.util.HashSet;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		
		Set<Integer> resultList = new HashSet<>();
        int[] numberList = new int[]{2,4,5,11,33,2,5,55,100,1};
        for (int i=0; i <numberList.length; i++){
            for (int j=i+1; j<numberList.length; j++){
                if (numberList[i] == numberList[j]){
                    resultList.add(numberList[j]);
                }
            }
        }
        System.out.println(resultList.toString());

	}

}
