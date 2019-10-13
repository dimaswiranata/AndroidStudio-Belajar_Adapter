package myadapterfg.wiranata.com;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Response{
	private List<CoachesItem> coaches;
	private List<PlayersItem> players;
	@SerializedName("team_key")
	private String teamKey;
    @SerializedName("team_name")
	private String teamName;
    @SerializedName("team_badge")
	private String teamBadge;
	private int CoachNum;
	private int PlayerNum;

	public int getCoachNum() {
		return CoachNum;
	}

	public void setCoachNum(int coachNum) {
		CoachNum = coachNum;
	}

	public int getPlayerNum() {
		return PlayerNum;
	}

	public void setPlayerNum(int playerNum) {
		PlayerNum = playerNum;
	}

	public void setCoaches(List<CoachesItem> coaches){
		this.coaches = coaches;
	}

	public List<CoachesItem> getCoaches(){
		return coaches;
	}

	public void setPlayers(List<PlayersItem> players){
		this.players = players;
	}

	public List<PlayersItem> getPlayers(){
		return players;
	}

	public void setTeamKey(String teamKey){
		this.teamKey = teamKey;
	}

	public String getTeamKey(){
		return teamKey;
	}

	public void setTeamName(String teamName){
		this.teamName = teamName;
	}

	public String getTeamName(){
		return teamName;
	}

	public void setTeamBadge(String teamBadge){
		this.teamBadge = teamBadge;
	}

	public String getTeamBadge(){
		return teamBadge;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"coaches = '" + coaches + '\'' + 
			",players = '" + players + '\'' + 
			",team_key = '" + teamKey + '\'' + 
			",team_name = '" + teamName + '\'' + 
			",team_badge = '" + teamBadge + '\'' + 
			"}";
		}
}