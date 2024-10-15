package com.xworkz.collections.runner;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> details = new LinkedList<String>();
		details.add("Asus");
		details.add("Vivo");
		details.add("samsung");
		details.forEach(i -> System.out.println(i));
		LinkedList<String> info = new LinkedList<String>();
		info.add("Redme");
		info.add("Realme");
		System.out.println("---------------toarray------------------------------");
		Object[] array = details.toArray();
		for (Object a : array) {
			System.err.println(a);

		}
		System.out.println("---------------sublist------------------------------");
		System.err.println(details.subList(0, 2));
		System.out.println("---------------add all------------------------------");
		details.addAll(info);
		details.forEach(i -> System.out.println(i));
		details.add(1, "Iphone");
		details.forEach(i -> System.out.println(i));
		System.out.println("---------------add first&last------------------------------");
		details.addFirst("Micromax");
		details.addLast("Samsung");
		details.forEach(i -> System.err.println(i));
//		details.clear();
//		details.forEach(i -> System.err.println(i));
		System.out.println(details.clone());
		System.out.println("---------------contains------------------------------");
		System.out.println(details.contains("Asus"));
		System.out.println("---------------contains all------------------------------");
		System.out.println(details.containsAll(info));
		System.out.println("---------------element------------------------------");
		System.out.println(details.element());
		System.out.println("---------------equals------------------------------");
		System.out.println(details.equals(info));
		System.out.println("---------------get index------------------------------");
		System.out.println(details.get(1));
		System.out.println("---------------get first------------------------------");
		System.out.println(details.getFirst());
		System.out.println("---------------get last------------------------------");
		System.out.println(details.getLast());
		System.out.println("---------------indexof------------------------------");
		System.out.println(details.indexOf("Vivo"));
		System.out.println("---------------is empty------------------------------");
		System.out.println(details.isEmpty());
		System.out.println("---------------last index of------------------------------");
		System.out.println(details.lastIndexOf("Samsung"));
		System.out.println("---------------offerfirst------------------------------");
		details.offerFirst("Iqoo");
		details.forEach(i -> System.err.println(i));
		System.out.println("--------------offerlast-----------------");
		details.offerLast("Redmi13C");
		details.forEach(i -> System.out.println(i));
		System.out.println("--------------offer-----------------");
		details.offer("Redmi13C");
		details.forEach(i -> System.out.println(i));
		System.out.println("-------------peek ------------------");
		details.peek();
		details.forEach(i -> System.err.println(i));
		System.out.println("-------------peek first------------------");
		details.peekFirst();
		details.forEach(i -> System.err.println(i));
		System.out.println("---------------peeaklast----------------");
		details.peekLast();
		details.forEach(i -> System.err.println(i));
		System.out.println("-------------poll------------------");
		details.poll();
		details.forEach(i -> System.err.println(i));
		System.out.println("--------------poll first-----------------");
		details.pollFirst();
		details.forEach(i -> System.out.println(i));
		System.out.println("-------------poll last------------------");
		details.pollLast();
		details.forEach(i -> System.out.println(i));
		System.out.println("-------------pop------------------");
		System.out.println(details.pop());
		details.forEach(i -> System.err.println(i));
		System.out.println("-------------push------------------");
		details.push("Asus");
		details.forEach(i -> System.err.println(i));
		System.out.println("-------------remove------------------");
		System.out.println(details.remove(2));
		details.forEach(i -> System.err.println(i));
		System.out.println("-------------removefirst------------------");
		details.removeFirst();
		details.forEach(i -> System.out.println(i));
		System.out.println("-------------removelast------------------");
		details.removeLast();
		details.forEach(i -> System.err.println(i));
		System.out.println("-------------removeLastOccurrence------------------");
		System.out.println(details.removeLastOccurrence("Redme"));
		System.out.println("-------------tostring------------------");
	      String detailsString = details.toString();
	      System.out.println("LinkedList converted to String: " + detailsString);
	}
}
