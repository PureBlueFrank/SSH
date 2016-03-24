package com.javaClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassIntroduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.name = "李时俊";
		p1.age = 23;
		p1.sex = "man";
		Person p2;
		p2 = p1;
		p2 = null;
	    p1.speak();
	    p1.jisuan(100);
	    p1.add(10, 9);
	}

}

class Person {
	int age;
	String name;
	String sex;
	public void speak(){
		System.out.println(this.name+"是一个好人！");
	}
	public void jisuan(int j){
		int sum = 0;
		for(int i = 0; i <= j; i++){
			sum = sum + i;
		}
		System.out.println("从1到"+j+"的和是："+sum);
	}
	public void add(int i , int j){
		int sum = i+j;
		System.out.println("i加j的和是："+sum);
	}
	public String add(int i ,String j){
		return (i+j);
	}
}