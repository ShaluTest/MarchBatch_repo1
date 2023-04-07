package Project_Test;

public class Student
{
	int a;
	public void shalu()
	{
	System.out.println("Welcome to all of you");
}
public static void main(String[] args)
{
	Student abc=new Student();
	abc.shalu();
	abc.a=122;
	System.out.println("changes done");
	System.out.println(abc.a);
}

}
