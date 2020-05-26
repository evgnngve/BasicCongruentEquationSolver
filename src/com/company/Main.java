package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static com.sun.tools.sjavac.Util.intersection;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();
        int limit = 20;

        for(int i = 0; i <limit; i++){
            one.add(i*4);
        }

        for (int i = 0; i <limit; i++){
            two.add((5*i)+1);
        }

        for(int i = 0; i<limit; i++){
            three.add((7*i)+6);
        }

        for (Integer i : one){
            System.out.println(i);
        }
        System.out.println("_____________________");
        for (Integer i : two){
            System.out.println(i);
        }
        System.out.println("_____________________");
        for (Integer i : three){
            System.out.println(i);
        }


        Set<Integer> oneS = new HashSet(one);
        Set<Integer> twoS = new HashSet<>(two);
        Set<Integer> threeS = new HashSet<>(three);

        intersection(threeS, (intersection(oneS, twoS)));
        ;
        //        oneS.retainAll(twoS.retainAll(threeS));






    }


}
