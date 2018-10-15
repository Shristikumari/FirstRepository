class test7{
	void show(){
		System.out.println("show().....");
	}
	static{
		test t1=new test();
		t1.show();
		System.out.println("static block 1");
	}
	public static void main(String[] args) {
		System.out.println("main()");
	}
	static{
		System.out.println("static block 2");
	}
}