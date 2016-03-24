package com.javaClass;

import java.util.HashMap;
import java.util.Iterator;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cleck s1 = new Cleck("s001",23,6000.0);
		Cleck s2 = new Cleck("s002",23,7000.0);
		Cleck s3 = new Cleck("s003",23,8000.0);
		HashMap hm = new HashMap();
		hm.put("s001", s1);
		hm.put("s002", s2);
		hm.put("s003", s3);
		if(hm.containsKey("s004")){
			System.out.println("map中含有s004");
		}else{
			System.out.println("map中不含有s004");
		}
		Iterator it = hm.keySet().iterator();
		while(it.hasNext()){
			String key = it.next().toString();
			Cleck temp = (Cleck) hm.get(key);
			System.out.println("年龄："+temp.getAge()+"员工号："+temp.getNo()+"薪水"+temp.getSalary());
		}
	}

}
class Cleck{
	private String no;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	private int age;
	private double salary;
	public Cleck(String no,int age,double salary){
		this.no = no;
		this.age = age;
		this.salary = salary;
	}
}