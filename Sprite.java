package game;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
public class Sprite extends Rect{
 
//	int x;
//	int y;
//	int w;
//	int h;
	Animation[ ] animation;
	
	
	public static final int UP = 0;
	public static final int DN = 1;
	public static final int LT = 2;
	public static final int RT = 3;
	//public static final int DIE = 4;
    int action = RT;
	boolean moving = false;
	
	
	public Sprite(int x, int y, int h,int w,String filename,int count,int duration, String [] action)
	{
//		this.x=x;
//		this.y =y;
//		this.w =w;
//		this.h=h;
		//image= image = Toolkit.getDefaultToolkit().getImage("ken.gif");
		super(x,y,h,w);
		animation = new Animation[action.length];
		for(int i =0; i<animation.length;i++)
		animation [i]= new Animation ( filename +"_"+ action[i]+ "_",count, duration);
	}
	
	
	
	
	
	public void moveBy( int dx, int dy)
	{
		x += dx;
		y +=dy;
	}
	
	public void moveLeftBy( int dx)
	{
		x -=dx;
		action =LT;
		moving =true;
	}
	
	public void moveRightBy( int dx)
	{
		x += dx;
		action =RT;
		moving =true;
	}
	
	public void moveUpBy( int dy)
	{
		y -= dy;
		action =UP;
		moving =true;
	}
	
	public void moveDownBy( int dy)
	{
		y += dy;
		action =DN;
		moving =true;
	}
	
//	public void DIE( int dx)
//	{
//		x += dx;
//		action =DIE;
//		moving =true;
//	}
	public void draw(Graphics g) {
		//g.drawImage(animation[action].nextImage(), x, y, null);
		if(moving) g.drawImage(animation[action].nextImage(), x, y, null);
		else
			g.drawImage(animation[action].staticImage(), x, y, null);
		moving = false;
		//g.drawRect( x, y,w,h);
		
	}

	
}

