package com.oops;

public class InheritanceEx {
	class Animal{  
		void eat(){System.out.println("eating...");}  
		}  
		class Dog extends Animal{  
		void bark(){System.out.println("barking...");}  
		}  
		class BabyDog extends Dog{  
		void weep(){System.out.println("weeping...");}  
		}  
		public class Parent {
			
			int age=35;
			int add(int a,int b) {
				return a+b;
			}

			
		}
		public class Child extends Parent {
		int num = 10;
		 void test() {
			  System.out.println("child test method");
		 }
			
		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Child obj = new Child();
		  int sum = obj.add(20, 30);
		  System.out.println(sum);
		  System.out.println(obj.age);
		   obj.test();
			}

		}


	
	
	
	
}
