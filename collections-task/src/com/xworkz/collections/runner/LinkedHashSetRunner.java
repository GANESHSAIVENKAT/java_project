package com.xworkz.collections.runner;


import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Spliterator;

public class LinkedHashSetRunner {

	public static void main(String[] args) {
		Set<String> prd=new LinkedHashSet<String>();
		System.out.println("Electronics");
		prd.add("Fan");
		prd.add("Laptop");
		prd.add("Mobile");
		prd.add("Tab");
		prd.add("TV");
		prd.forEach(i->System.out.println(i));
		Set<String> prd1=new LinkedHashSet<String>();
		System.out.println("Electronics");
		prd1.add("Heater");
		prd1.add("AC");
		prd.addAll(prd1);
		boolean contain=prd.contains("TV");
        System.err.println("is item prsent:"+contain);
       
        System.out.println(prd.containsAll(prd1));
      
        boolean equal= prd.contains(prd);
       System.err.println("is item equals:"+equal);
       
       boolean empty=prd.isEmpty();
       System.err.println("is item empty:"+empty);
       
//       int result4=items.hashCode();
//       System.out.println("Hash code:"+result4);
       
       boolean remove=prd.remove("Mobile");
       System.out.println("remove:"+remove);
       prd.forEach(s->System.err.println(s));
       
       prd.removeAll(prd1);
       prd.forEach(s->System.out.println(s));
      int result= prd.size();
      System.out.println("size:"+result);
      
      Spliterator<String> result1=prd.spliterator();
      System.err.println("Spliterator:"+result1);
      

      
      Object[] arr=prd.toArray();   
      for(Object array:arr) {
    	   System.out.println("To Array:"+ array);
          }
      
      prd.clear();
      System.err.println("After clear");
      prd.forEach(s->System.out.println(s));
		
	}
	
}
