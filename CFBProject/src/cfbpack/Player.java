package cfbpack;

public class Player 
{
	private int rating;
	private String year;
	private String position;
	
	public Player(String pos, String yr, int rating)
	{
		this.rating = rating;
		this.position = pos;
		this.year = yr;
	}

	public int getRating() 
	{
		return rating;
	}

	public void setRating(int rating) 
	{
		this.rating = rating;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
