package com.java.for_each;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ForEachTest {

	public static void main(String args[]){
        Collection<String> list = new ArrayList<String>();
        list.add("Android");
        list.add("iPhone");
        list.add("Windows Mobile");
 
        // Which Code will throw ConcurrentModificationException, both, 
       // none or one of them
 
        // example 1        
//        Iterator<String> itr = list.iterator();
//        while(itr.hasNext()){
//            String lang = itr.next();
//            System.out.println(lang);
//            list.remove(lang);
//        }
 
         // example 2
        for(String language: list){
//        	System.out.println(language);
            list.remove(language);
        }
    }

}
