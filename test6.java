class test6{
	Final static int x=10,c=80;//call by class name as  it is static
	static short b;
	Final int y=20;//call by object name as it is non-static
	public static void main(String[] args) {
		int z=30,a;//call by directly as it is local
		System.out.println(a);//local variable should be initialized before using
		System.out.println(test.b);
		test.x++;
		System.out.println(test.x);
		test t1=new test();
		test t2=new test() ;
	}
}