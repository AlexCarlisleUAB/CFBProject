package cfbpack;

import java.util.ArrayList;
import java.util.Random;

public class CFBDriver 
{
	private static ArrayList<Team> ncaa;
	private static ArrayList<Conference> ncaaC;
	
	public static void defaultTeams()
	{
		Team ala = new Team ("Alabama", "Crimson Tide", "SEC");
		ncaa.add(ala);
		Team aub = new Team ("Auburn", "Tigers", "SEC");
		ncaa.add(aub);
		Team clem = new Team ("Clemson", "Tigers", "ACC");
		ncaa.add(clem);
		Team ou = new Team ("Oklahoma", "Sooners", "Big 12");
		ncaa.add(ou);
		
		aub.toString();
	}
	
	public static void defaultConferences()
	{
		Conference acc = new Conference("ACC");
		Conference big10 = new Conference("Big 10");
		Conference big12 = new Conference("Big 12");
		Conference pac12 = new Conference("Pac-12");
		Conference sec = new Conference("SEC");
		Conference aac = new Conference("American");
		Conference mwc = new Conference("Mountain West");
		Conference cusa = new Conference("C-USA");
		Conference sbc = new Conference("Sun Belt");
		Conference mac = new Conference("MAC");
		
		ncaaC.add(acc);
		ncaaC.add(big10);
		ncaaC.add(big12);
		ncaaC.add(pac12);
		ncaaC.add(sec);
		ncaaC.add(aac);
		ncaaC.add(mwc);
		ncaaC.add(cusa);
		ncaaC.add(sbc);
		ncaaC.add(mac);
	}
	
	public static void addToConferences()
	{
		for (int count = 0;count < ncaa.size();count++)
		{
			Team t = ncaa.get(count);
			String cF = t.getConference();
			for (int count2 = 0; count2 < ncaaC.size(); count2++)
			{
				Conference c = ncaaC.get(count2);
				String cN = c.getConfName();
				if (cF.equals(cN))
				{
					c.add(t);
				}
			}
		}
	}
	
	public static void generatePlayers()
	{
		Random rand = new Random();
		int count;
		int count2;
		for (count = 0; count < ncaa.size(); count++)
		{
			for(count2 = 0; count2 < 70; count2++)
			{
				Team t = ncaa.get(count);
				int yearInt = (rand.nextInt(4) + 1);
				String year = null;
				int rating = ((rand.nextInt(50) + 1)/ 10);
				int posInt = (rand.nextInt(21) + 1);
				String pos = null;
				if (yearInt == 1)
				{
					year = "FR";
				}
				else if (yearInt == 2)
				{
					year = "SO";
				}
				else if (yearInt == 3)
				{
					year = "JR";
				}
				else if (yearInt == 4)
				{
					year = "SR";
				}
				else
				{
					System.out.println("an ERROR has occured. Random int for class is " + yearInt);
					year = "null";
				}
				
				
				if (posInt == 1 || posInt == 16)
				{
					pos = "QB";
				}
				else if (posInt == 2 || posInt == 15)
				{
					pos = "HB";
				}
				else if (posInt == 3 || posInt == 14 || posInt == 17)
				{
					pos = "Receiver";
				}
				else if (posInt == 4 || posInt == 13 || posInt == 18)
				{
					pos = "OL";
				}
				else if (posInt == 5 || posInt == 12 || posInt == 19)
				{
					pos = "DL";
				}
				if (posInt == 6 || posInt == 11)
				{
					pos = "LB";
				}
				else if (posInt == 7 || posInt == 10)
				{
					pos = "CB";
				}
				else if (posInt == 8 || posInt == 9)
				{
					pos = "S";
				}
				else if (posInt == 20)
				{
					pos = "K";
				}
				else if (posInt == 21)
				{
					pos = "P";
				}
				else
				{
					System.out.println("an ERROR has occured. Random int for position is " + posInt);
					pos = "null";
				}
				
				Player p = new Player(pos, year, rating);
				t.addPlayer(p);
				
			}
			
		}
	}
	
	
	public static void  main(String [] args)
	{
		generatePlayers();
		defaultConferences();
		defaultTeams();
		addToConferences();
	}
}
