import java.util.*;
public class UserAccount {

	private Date DateCreated;
	private String email;
	private String password;
	private String userName;
	private FriendList friends;
	private ArrayList<String> feed = new ArrayList<String>();
	private ArrayList<String> posts = new ArrayList<String>();
	private String gender;
	private Date dateOfBirth;
	
	
	UserAccount(String email, String password, String userName){
		this.email = email;
		this.password = password;
		this.userName = userName;
	}
	
	public void login( String email, String password) { 
		if(email.equals(this.email) && password.equals(this.password)) {
			System.out.println("Login Successful");
			/* Display data */
		}
	}
	
	
	
	
	
}
