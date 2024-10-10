package com.amazon.application.products;

public class Amazon {
  String products[]=new String[4];
  public int index=0;
  
  public int getlength() {
    return products.length; 
  }
  public String createbyproducts (String element) {
	  if (this.index<this.getlength()) {
		  products[index]=element;
		  index++;
	  }
	  return"Error";
	  
  }
  public void readbyproducts() {
	  for(int index=0;index<this. getlength();index++) {
		  System.out.println(products[index]);
	  }
  }
	public String updatebyproducts(String oldname,String newname){
		for(int index=0;index<this.getlength();index++){
			if(products[index]==oldname){
				products[index]=newname;
				System.out.println("Products Are :"+newname);
				return "updated successfully";
			}
			}return"updatefail";
	}
	public String deletebyproducts(String name){
		for(int index=0;index<this.getlength();index++){
			if(products[index]==name){
				products[index]=null;
				System.out.println("Products Are :"+name);
			}
		}return "Notdeleted";
	}
	public String searchbyproducts(String names) {
		for(String name:products) {
			if(names==name) {
				return"Found";
			}
		}return"Notfound";
	}
}
