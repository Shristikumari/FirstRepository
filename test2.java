class test2{
	public static void main(String[] args) {
		System.out.println(args.length);
		if(args.length>0)
			System.out.println("the args are:");
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
	}
	else

	System.out.println("No args entered from commandlin:");
}
