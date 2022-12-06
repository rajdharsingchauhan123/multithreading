package com.stream;

import lambda.Arraylist;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Allarraylist {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,4,56666,67,89,122);

        List<Integer>listofinteger =list.stream().collect(Collectors.toList());
        System.out.println(listofinteger);

        ArrayList<Integer>alist=list.stream().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(alist);
        // stream to linkedlist
        LinkedList<Integer>linkedList=list.stream().collect(Collectors.toCollection(() -> new LinkedList<Integer>()));
        System.out.println(listofinteger);

        Set<Integer>set = list.stream().collect(Collectors.toSet());
        System.out.println(set);

        HashSet<Integer>hashSet =list.stream().collect(Collectors.toCollection(HashSet::new));
        System.out.println(hashSet);

        Map<Integer,String>map =list.stream().collect(Collectors.toMap(Function.identity(),String::valueOf ,(K1,K2)->K1));

        System.out.println(map);


    }

}
