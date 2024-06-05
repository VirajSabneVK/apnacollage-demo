
class AppnaCollage
{
	String name ;
	String Address;
	int id;
	int roll_no;
	
	void name()
	{
		System.out.println("Vishal");
	}
	void Address(){
		System.out.println("Aurangabad");
	}
	void id()
	{
		System.out.println(2341);
	}
	void roll_no()
	{
       System.out.println(23);
	}
}

class Csmss 
{
	public static void main(String[] args)
	{
		AppnaCollage a = new AppnaCollage();
		a.name();
		a.Address();
		a.id();
		a.roll_no();
	}
}