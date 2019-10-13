package myadapterfg.wiranata.com;

public class PlayersItem{
	private long playerKey;
	private String playerMatchPlayed;
	private String playerAge;
	private String playerRedCards;
	private String playerNumber;
	private String playerCountry;
	private String playerGoals;
	private String playerName;
	private String playerYellowCards;
	private String playerType;

	public void setPlayerKey(long playerKey){
		this.playerKey = playerKey;
	}

	public long getPlayerKey(){
		return playerKey;
	}

	public void setPlayerMatchPlayed(String playerMatchPlayed){
		this.playerMatchPlayed = playerMatchPlayed;
	}

	public String getPlayerMatchPlayed(){
		return playerMatchPlayed;
	}

	public void setPlayerAge(String playerAge){
		this.playerAge = playerAge;
	}

	public String getPlayerAge(){
		return playerAge;
	}

	public void setPlayerRedCards(String playerRedCards){
		this.playerRedCards = playerRedCards;
	}

	public String getPlayerRedCards(){
		return playerRedCards;
	}

	public void setPlayerNumber(String playerNumber){
		this.playerNumber = playerNumber;
	}

	public String getPlayerNumber(){
		return playerNumber;
	}

	public void setPlayerCountry(String playerCountry){
		this.playerCountry = playerCountry;
	}

	public String getPlayerCountry(){
		return playerCountry;
	}

	public void setPlayerGoals(String playerGoals){
		this.playerGoals = playerGoals;
	}

	public String getPlayerGoals(){
		return playerGoals;
	}

	public void setPlayerName(String playerName){
		this.playerName = playerName;
	}

	public String getPlayerName(){
		return playerName;
	}

	public void setPlayerYellowCards(String playerYellowCards){
		this.playerYellowCards = playerYellowCards;
	}

	public String getPlayerYellowCards(){
		return playerYellowCards;
	}

	public void setPlayerType(String playerType){
		this.playerType = playerType;
	}

	public String getPlayerType(){
		return playerType;
	}

	@Override
 	public String toString(){
		return 
			"PlayersItem{" + 
			"player_key = '" + playerKey + '\'' + 
			",player_match_played = '" + playerMatchPlayed + '\'' + 
			",player_age = '" + playerAge + '\'' + 
			",player_red_cards = '" + playerRedCards + '\'' + 
			",player_number = '" + playerNumber + '\'' + 
			",player_country = '" + playerCountry + '\'' + 
			",player_goals = '" + playerGoals + '\'' + 
			",player_name = '" + playerName + '\'' + 
			",player_yellow_cards = '" + playerYellowCards + '\'' + 
			",player_type = '" + playerType + '\'' + 
			"}";
		}
}
