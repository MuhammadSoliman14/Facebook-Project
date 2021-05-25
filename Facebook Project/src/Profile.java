import java.util.*;
public class Profile {
 
	private String Bio ;
	private ArrayList <String> Friends = new ArrayList <String>();  
	private ArrayList <String> Groups = new ArrayList <String>();
	private String School;
	private String Workplace;
	private String Relationship;
	private String Hometown;
	
	
	 public Profile(String Bio,FriendList Friends, ArrayList Groups, String School, String workplace, String Relationship) {
		 
		this.Bio = Bio;
		this.School = School;
		this.Workplace = Workplace;
		this.Relationship = Relationship;
	
	 }

	 public static void editProfile(String Bio, String School, String workplace, String Relationship) {
		
		String newBio = Bio;
		String newSchool = School;
		String newWorkplace = workplace;
		String newRelationship = Relationship;
		
	 }
	 
	 public static ArrayList viewGroups( ArrayList Groups) {
		 return Groups;
	 }
}
