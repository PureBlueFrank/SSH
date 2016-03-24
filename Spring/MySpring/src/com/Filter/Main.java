package com.Filter;

public class Main {

	public static void main(String[] args) {
		MsgProssor mp = new MsgProssor();
		String r = "网页<javaScript>.  :)  敏感   中国 被就业  over";
		System.out.println(r);
		mp.setMsg(r);
		String afterProcesss = mp.process();
		System.out.println(afterProcesss);
	}

}
