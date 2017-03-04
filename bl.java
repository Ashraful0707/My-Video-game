package game;

public class bl extends Sprite{
	
	public bl(int x, int y) {
		super(x,y,110,115,"g", 5, 10,action);// call base class constructor;
		
	}

	private static final String[] action = {"up","dn", "lt","rt"};

}


