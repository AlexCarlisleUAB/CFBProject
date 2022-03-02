package cfbpack;

import java.util.ArrayList;

public class Conference
{
	private String confName;
	private ArrayList<Team> teamList;
	
	public Conference (String name)
	{
		this.confName = name;
	}
	
	public void add(Team t)
	{
		teamList.add(t);
	}
	
	public void remove(Team t)
	{
		teamList.remove(t);
	}
	
	public String getConfName() 
	{
		return confName;
	}
	public void setConfName(String confName) 
	{
		this.confName = confName;
	}
}
