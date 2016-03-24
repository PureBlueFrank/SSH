package com.javaClass;

import java.util.LinkedList;
import java.util.Vector;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		Emp emp1 = new Emp("李静",0001,5000.0f);
		Emp emp2 = new Emp("邓超",0002,6000.0f);
		ll.addFirst(emp1);
		ll.addFirst(emp2);
		for (int i = 0;i<ll.size();i++){
			System.out.println(((Emp)ll.get(i)).getName());
		}
		Vector vv = new Vector();
		Emp emp3 = new Emp("陈军",32,7000.0f);
		for(int i = 0;i<vv.size();i++){
			System.out.println(((Emp)vv.get(i)).getName());
		}
	}

}
class Emp{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	private String name;
	private int no;
	private float sal;
	public Emp(String name,int no,float sal){
		this.name = name;
		this.no = no;
		this.sal = sal;
	}
}