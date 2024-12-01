package tpexception2;
import java.util.*;

public class Authentification {
	public final String loginCorrect="scoot";
	public final String PwdCorrect="tiger";
	Scanner sc=new Scanner(System.in);
	
	public String getLoginCorrect() {
		return loginCorrect;
	}
	public String getPwdCorrect() {
		return PwdCorrect;
	}
	public Authentification() throws WrongInputLength, WrongLoginException, WrongPwdException
	{
		getUserLogin();
		getUserPwd();
	}
	public  String getUserLogin() throws WrongInputLength, WrongLoginException
	{
		System.out.println("donner un login");
		String login=sc.nextLine();
		if(login.length()>10)
		{
			throw new WrongInputLength("votre login ne doit pas depaser 10");
		}
		if(!(login.equals(loginCorrect)))
		{
			throw new WrongLoginException("votre login est incorrect ");
		}
		return login;
		
	}
	public String getUserPwd() throws WrongPwdException, WrongInputLength
	{
		System.out.println("donner un passworld");
		String Pwd=sc.nextLine();
		if(Pwd.length()>10)
		{
			throw new WrongInputLength("votre Pwd ne doit pas depaser 10");
		}
		if(!(Pwd.equals(PwdCorrect)))
		{
			throw new WrongPwdException("votre Pwd est incorrect ");
		}
		return Pwd;
	}
	

}
