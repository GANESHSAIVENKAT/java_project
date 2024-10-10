package com.xworks.programs.runner;

import java.nio.charset.StandardCharsets;

public class StringconcRunner {

	

public static void main(String[] args) {
	String string1=new String();  //String()
	System.out.println(string1);
	
	byte[] bytes = {72, 101, 108, 108, 111};
	String string2=new String(bytes);  //String(byte[] bytes)
	System.out.println(string2);
	
	
	String string9=new String(bytes, 0, bytes.length,StandardCharsets.UTF_8 );
	System.out.println("String(byte[] bytes, int offset, int length, Charset charset) ::::"+string9);  //String(byte[] bytes, int offset, int length, Charset charset)
	
	
    String string3 = new String(bytes, StandardCharsets.UTF_8);  //String(byte[] bytes, Charset charset)
    System.out.println("String from UTF-8 bytes: " + string3);
    
    char[] charArray = {'J', 'a', 'v', 'a'};
    
    String string4 = new String(charArray);  //String(char[] value)
    System.out.println("Constructor 4: " + string4);
    
    String string5 = new String(charArray, 1, 3);   //String(char[] value, int offset, int count)
    System.out.println("Constructor 5: " + string5);
    
    
    String string6 = new String("Hello, World!");    //String(String original)
    System.out.println("Constructor 6: " + string6);

    
    StringBuilder string7 = new StringBuilder();
    string7.append("Hello, ");
    string7.append("world!");
    
    // Convert the StringBuilder to a String using the String(StringBuilder builder) constructor
    String resultString = new String(string7);
    
    // Output the result
    System.out.println("String created from StringBuilder: " + resultString);
    
    StringBuffer string8=new StringBuffer();
    string8.append("Hello, ");
    string8.append("world!");
    
    // Convert the StringBuffer to a String using the String(StringBuffer buffer) constructor
    String result = new String(string8);
    
    // Output the result
    System.out.println("String created from StringBuffer: " + result);
    
    
    int[] codePoints = { 72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100, 33 };

    // Create a String from the entire array
    String fullString = new String(codePoints, 0, codePoints.length);  //String(int[] codePoints, int offset, int count ) 
    System.out.println("Full String: " + fullString);

    // Create a String from a subset of the array
    // For example, extract "Hello World"
    String subsetString = new String(codePoints, 0, 11); // "Hello World"     //subset
    System.out.println("Subset String: " + subsetString);
    
    
    byte[] byteArray = {65, 66, 67, 68, 69};
    
    
    @SuppressWarnings("deprecation")
	String resultString1 = new String(byteArray, 0, 0, 5);  //String(byte[] ascii, int hibyte, int offset, int count)
    System.out.println(resultString1);


    @SuppressWarnings("deprecation")
	String resultString2 = new String(byteArray, 0);  //String(byte[] ascii, int hibyte)
    System.out.println(resultString2);
}

}
