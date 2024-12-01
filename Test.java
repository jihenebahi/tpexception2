package tpexception2;

public class Test {
	public static void main(String[] args)
	{
		try {
			Authentification a=new Authentification();
		}
		catch (WrongInputLength Wl)
		{
			System.out.println(Wl.getMessage());
			System.exit(0);
		}
		catch ( WrongLoginException Wle)
		{
			System.out.println(Wle.getMessage());
		}
		catch ( WrongPwdException Wpe)
		{
			System.out.println(Wpe.getMessage());
		}
	}

}
