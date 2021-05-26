import java.util.*;
public class Profile {
 
	private String bio;
	private ArrayList <String> friends = new ArrayList <String>();  
	private ArrayList <String> groups = new ArrayList <String>();
	private String school;
	private String workplace;
	private String relationship;
	private String hometown;
	
	
	 public Profile(String bio,FriendList friends, ArrayList groups, String school, String workplace, String relationship) {
		 
		this.bio = bio;
		this.school = school;
		this.workplace = workplace;
		this.relationship = relationship;
	
	 }

	 public static void editProfile(String bio, String school, String workplace, String relationship) {
		
		String newBio = bio;
		String newSchool = school;
		String newWorkplace = workplace;
		String newRelationship = relationship;
		
	 }
	 
	 public static ArrayList viewGroups( ArrayList groups) {
		 return groups;
	 }
}
