package com.javaClass;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		Emp emp1 = new Emp("芈月",81,8000.0f);
		Emp emp2 = new Emp("郑凯",11,8000.0f);
		hm.put("81", emp1);
		hm.put("11", emp2);
		if(hm.containsKey("81")){
			System.out.println("有该员工！");
		}else{
			System.out.println("没有该员工！");
		}
		ChengFaBiao cf = new ChengFaBiao();
		cf.someMethod();
	}

}
