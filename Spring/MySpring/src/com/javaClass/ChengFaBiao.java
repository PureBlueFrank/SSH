package com.javaClass;

 class ChengFaBiao {
	public static void main(String[] arg){
		ChengFaBiao c1 = new ChengFaBiao();
		c1.chengfa(9);
	}
	public void someMethod(){
		
	}
	public void chengfa(int i){
		for(int j =1 ; j<=i;j++){
			for(int k =1;k<=j;k++){
				System.out.print(k+"x"+j+"="+(k*j)+"  ");
			}
			System.out.println();
		}
	}
}

