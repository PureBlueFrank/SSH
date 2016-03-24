package com.homework;

public class RewriteObjectEquals {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User();
		user1.name = "李石军";
		user1.age = 23;
		
		User user2 = new User();
		user2.name = "李时俊";
		user2.age = 23;
		if(user1.equals(user2)){
			System.out.println("user1等于user2");
		}else{
			System.out.println("user1不等于user2");
		}
	}

}

class User {
	 
	public  String name;
	public  Integer age;
	public boolean equals(Object obj){
		if (obj == null){
			return false;
		}
		if (this == obj){
			return true;
		}
		if(obj instanceof User){
			User obj1 = (User) obj;
			if((obj1.name).equals(this.name)&&(obj1.age).equals(this.age)){
				return true;
			}
		}
		return false;
	}
}
