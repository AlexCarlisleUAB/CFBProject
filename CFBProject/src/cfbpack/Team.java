package cfbpack;

import java.util.ArrayList;

public class Team
{
	private String univName;
	private String teamName;
	private String conference;
	private ArrayList<Player> roster;
	
	public Team (String un, String tn, String c)
	{
		this.setUnivName(un);
		this.setTeamName(tn);
		this.setConference(c);
	}
	
	public void addPlayer(Player p)
	{
		roster.add(p);
	}
	
	public String toString()
	{
		String s = ("University Name: " + this.univName + "/n" + "Team Name: " + this.teamName + "/n" + "Conference: " 
				+ this.conference);
		return s;
	}
	
	public String getUnivName()
	{
		return univName;
	}

	public void setUnivName(String univName)
	{
		this.univName = univName;
	}

	public String getTeamName()
	{
		return teamName;
	}

	public void setTeamName(String teamName)
	{
		this.teamName = teamName;
	}

	public String getConference() 
	{
		return conference;
	}

	public void setConference(String conference) 
	{
		this.conference = conference;
	}

	public ArrayList<Player> getRoster() {
		return roster;
	}

	public void setRoster(ArrayList<Player> roster) {
		this.roster = roster;
	}
}
