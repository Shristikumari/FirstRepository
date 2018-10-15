class test10{
	public static void main(String[] args) {
		int x[]={1,8,7,9};
		System.out.println("traverse by for loop");
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
			System.out.println("traverse by foreach loop");
			int c=0;
			for(int a:x){
				System.out.println(a);
			}
		}
	}
}