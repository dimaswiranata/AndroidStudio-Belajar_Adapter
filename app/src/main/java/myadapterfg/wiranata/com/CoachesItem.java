package myadapterfg.wiranata.com;

public class CoachesItem{
	private String coachAge;
	private String coachName;
	private String coachCountry;

	public void setCoachAge(String coachAge){
		this.coachAge = coachAge;
	}

	public String getCoachAge(){
		return coachAge;
	}

	public void setCoachName(String coachName){
		this.coachName = coachName;
	}

	public String getCoachName(){
		return coachName;
	}

	public void setCoachCountry(String coachCountry){
		this.coachCountry = coachCountry;
	}

	public String getCoachCountry(){
		return coachCountry;
	}

	@Override
 	public String toString(){
		return 
			"CoachesItem{" + 
			"coach_age = '" + coachAge + '\'' + 
			",coach_name = '" + coachName + '\'' + 
			",coach_country = '" + coachCountry + '\'' + 
			"}";
		}
}
