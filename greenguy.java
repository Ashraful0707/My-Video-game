package game;

public class greenguy extends Sprite{
	    
	
	

	private static final String[] action = {"up","dn", "lt","rt"};
	
	public static final int UP = 0;
	public static final int DN = 1;
	public static final int LT = 2;
	public static final int RT = 3;
	//public static final int f = 4;
	
	public greenguy(int x, int y) {
		super(x,y,100,150,"g",5,10,action);// call base class constructor;
		
	}
    
}
