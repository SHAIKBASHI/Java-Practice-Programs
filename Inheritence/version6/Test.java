package com.version6;

public class Test {

	public static void main(String[] args) {
		//Employee obj=(Employee)new Manager(11,"Manager",35000.00);
		Employee obj=new Manager(11,"Manager",35000.00);//Upcasting
		 
		((Manager)obj).setDop("14/1/2026");//Downcasting
		System.out.println(((Manager)obj).getDop());
		 System.out.println(obj.bonus());

	}

}
