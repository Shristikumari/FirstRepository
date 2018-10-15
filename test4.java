class test4{
	public static void main(String[] args) {
		byte x=20;
		System.out.println(x);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.SIZE);
        System.out.println(Byte.parseByte(args[0])+30);
        System.out.println(x+10);
        System.out.println(Byte.toString(x)+20);
        System.out.println("..........");
        short y=300;
        System.out.println(y);
        byte z=(byte)y;
        System.out.println(z);
        System.out.println("...............");
        System.out.println("A"+10);
        System.out.println(0x10+10);
        System.out.println("............");
        System.out.println("Integer.toBinaryString(10)");
            int zero=0; 
             int one=0;
         String binary=Integer.toBinaryString(Integer.parseInt(args[0]));
          System.out.println("value is"+args[0]);
          System.out.println("Binary is"+binary);
          for(int i=0; i<binary.length();i++){
          	if(binary.charAt(i)=='0')
          	     zero++;
          	   else
          	   	   one++;
          	  }
          	  System.out.println("No of zero:"+zero);
          	  System.out.println("No of one:"+one);
          	  System.out.println(Integer.toOctalString(10));
          	  System.out.println(Integer.toHexString(10));
          	  System.out.println(Integer.toString(10));
          	  System.out.println(Integer.parseInt("10"));
	      }
	  }

            
	
     
