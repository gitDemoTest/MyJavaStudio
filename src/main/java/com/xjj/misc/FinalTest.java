package com.xjj.misc;



public class FinalTest {
	
	
	public static void main(String[] args) {
		FinalTest tf = new FinalTest();
		Person p = tf.new Person();
		p.setName("Li");
		p.setAge(18);
		
		System.out.println(p);
		
		tf.changeName(tf, p, "Wang");
		System.out.println(p);
			
	}
	
	private void changeName(FinalTest tf, final Person p, String newName) {
		//p = tf.new Person();
		p.setName(newName);
	}
	
	private class Person{
		private String name;
		private int age;
		
		public Person(){
			super();
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
	}
}
