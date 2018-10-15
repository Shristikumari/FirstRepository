import java.util.*;
public class Queuue_Deque_EX
{
	public static void main(String[] args) {
		Queue<Byte>q=new Linkedlist<Byte>();
		Dqueue<short>dq=new Linkedlist<short>();
		q.add((byte)11);
		q.add((byte)22);
		q.add((byte)33);
        q.add((byte)44);
		q.add((byte)55);
		System.out.println(q);
		System.out.println(q.peak);
		System.out.println(q.poll);
		System.out.println(q);
		System.out.println(q.size);
		dq.add((short)11);
		dq.addFirst((short)21);
		dq.add((short)31);
		dq.add((short)41);
		dq.addFirst((short)51);
		System.out.println(dq);
		dq.removFirst();
		dq.removeLast();
		System.out.println(dq);
     	}
}
	
