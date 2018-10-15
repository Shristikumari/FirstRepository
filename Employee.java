class Employee
{
	int salary=4000;
}
class programmer extends Employee
{
	int bouns=1000;
	public static void main(String[] args) {
		programmer p=new programmer();
		System.out.println(" programmer salary is:"+p.salary);
		System.out.println("bouns of programmer  is:"+p.bouns);
	}
}