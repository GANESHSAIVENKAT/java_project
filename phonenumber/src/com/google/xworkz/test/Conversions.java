package com.google.xworkz.test;

public class Conversions {

	public static void main(String[] args) {
		
        int values = 10;
        Integer value = Integer.valueOf(values);
        System.out.println("1.int to Integer:"+value);

        byte value1 = 5;
        Byte data = Byte.valueOf(value1);
        System.out.println("2.byte to Byte:"+data);
       
        short num = 100;
        Short detail = Short.valueOf(num);
        System.out.println("3.short to Short:"+detail);
         
        long nums = 1000L;
        Long number = Long.valueOf(nums);
        System.out.println("4.long to Long:"+number);

        double no = 10.5;
        Double no1 = Double.valueOf(no);
        System.out.println("5.double to Double:"+no1);

        float floatno = 5.5f;
        Float floatvalue = Float.valueOf(floatno);
        System.out.println("6.float to Float:"+floatvalue);

        char charValue = 'M';
        Character chardata = Character.valueOf(charValue);
        System.out.println("7.char to Character:"+chardata);
  
        boolean booleanValue = true;
        Boolean booleandata = Boolean.valueOf(booleanValue);
        System.out.println("8.boolean to Boolean:"+booleandata);
        
        char charvalues='k';
        int chartoint=Integer.valueOf(charvalues);
        System.out.println("9.char to int :"+chartoint);
        
        int intvalues=65;
        Character c=Character.valueOf((char) intvalues);
        System.out.println("9.Int to char :"+c);
        
        
        String byteString = "123";
        byte stringToByte = Byte.parseByte(byteString);
        System.out.println("10.String to byte: " + stringToByte);
        
        String shortString = "12345";
        short stringToShort = Short.parseShort(shortString);
        System.out.println("11.String to short: " + stringToShort);

        String intString = "123456";
        int stringToInt = Integer.parseInt(intString);
        System.out.println("12.String to int: " + stringToInt);

        String longString = "12345678901234";
        long stringToLong = Long.parseLong(longString);
        System.out.println("13.String to long: " + stringToLong);

        String floatString = "3.14";
        float stringToFloat = Float.parseFloat(floatString);
        System.out.println("14.String to float: " + stringToFloat);

        String doubleString = "2.71828";
        double stringToDouble = Double.parseDouble(doubleString);
        System.out.println("15.String to double: " + stringToDouble);

        String booleanString = "true";
        boolean stringToBoolean = Boolean.parseBoolean(booleanString);
        System.out.println("16.String to boolean: " + stringToBoolean);

        byte byteValue = 50;
        String byteToString = Byte.toString(byteValue);
        System.out.println("17.byte to String: " + byteToString);

        short shortValue = 50;
        String shortToString = Short.toString(shortValue);
        System.out.println("18.short to String:"+shortToString);

        int intValue = 560;
        String intToString = Integer.toString(intValue);
        System.out.println("19.int to String:"+intToString);

        long longValue = 876;
        String longToString = Long.toString(longValue);
        System.out.println("20.long to String:"+longToString);
 
        float floatValue = 43;
        String floatToString = Float.toString(floatValue);
        System.out.println("21.float to String:"+floatToString);

        double data1 = 567;
		String doubleToString = Double.toString(data1);
        System.out.println("22.double to String:"+doubleToString);


        String charToString = Character.toString(charValue);
        System.out.println("23.char to String:"+charToString);

        String booleanToString = Boolean.toString(booleanValue);
        System.out.println("24.boolean to String:"+booleanToString);
    }
	
}
	
