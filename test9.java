class test9{

	public static void main(String[] args) {
		int num1=10,num2=20,num3=5;
		int result=num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);
		if(num1>num2){
			if(num1>num3)
				System.out.println(num1+"is big");
			else
				System.out.println(num3+"iss big");
		}
		else  if(num2>num3)
			System.out.println(num2+"is big");

		else
			System.out.println(num3+"is big");
		System.out.println("..............");
		if(num1>num2&&num1>num3)
			System.out.println(num1+"is big");
		   if(num2>num1&&num2>num3)
			System.out.println(num2+"is big");
		if(num3>num1&&num3>num2)
         System.out.println(num3+"is big");
}
}