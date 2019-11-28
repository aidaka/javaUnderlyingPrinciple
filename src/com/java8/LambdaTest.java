package com.java8;

import com.sun.xml.internal.fastinfoset.algorithm.IntEncodingAlgorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class LambdaTest {

    public static void main(String[] args) {
	// write your code here
        List<Integer> list  = Arrays.asList(1,2,3,4,5,6,7,8);
        for (int i=0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("-----------");
        for (Integer i : list){
            System.out.println(i);
        }
        System.out.println("------------");
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("----------");

    }
}
