package com.google.project.task;

public class Bankinfo {
	int ten=0;
	int fifty=0;
	int hundread=0;
	int fivehundread=0;
	int twothousand=0;
	
	public void getinfo(int amount[]) {
		
		for(int i=0;i<amount.length;i++) {
			if(amount[i]==10) {
				ten++;
			}else if(amount[i]==50){
				fifty++;
			}else if(amount[i]==100){
				hundread++;
			}else if(amount[i]==500){
				fivehundread++;
			}else if(amount[i]==2000){
				twothousand++;
			}
		}
		System.out.println("Count Of Ten's are"+ten);
		System.out.println("Count Of fifty are"+fifty);
		System.out.println("Count Of hundread are"+hundread);
		System.out.println("Count Of fivehundread are"+fivehundread);
		System.out.println("Count Of twothousand are"+twothousand);
	}

}
