package game;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;

public class Drawing extends Applet implements Runnable, KeyListener, MouseListener{
    
	Tank tank = new Tank(450,400,180);

	Line L = new Line(800,750,20,200);
	Cercle c = new Cercle(500,500,20);
	//Sprite FighterPlane;
	greenguy  greenguy;
	bl battlelord;
	Sprite Attack;
	Image image;
	

	Rect r = new Rect(200,100,5,3);
	Rect r2 = new Rect(300,300,50,50);
	Thread t;
	boolean leftPressed = false;
	boolean rightPressed  = false;
	boolean upPressed = false;
	boolean downPressed = false;
	//int x= 100;
//	int y;
	public void init(){
		 greenguy = new greenguy(100,100);
	     battlelord = new bl(100,100);
		 setSize(400,400);
		
		String [] action = {"up", "dn", "lt","rt"};

		  //  String[] action= {"die"};
		setBackground(Color.cyan);
		//FighterPlane = new Sprite(100,100,"ken.gif",5,10);
	 
	//     Attack = new Sprite(300, 300, 20, 50, "At",5,5,action);
	     
		requestFocus();
		addKeyListener(this);
		addMouseListener(this);
		t= new Thread(this);
		t.start();
		
	}
	
	
	@Override
	public void run() 
	{
		while(true)
		{ 
			if(leftPressed ) tank.rotateLeftBy(6);
			if(rightPressed) tank.rotateRightBy(6);
			if(upPressed)   tank.moveForwardBy(5);
		    if(downPressed) tank.moveBackwardBy(6);
		    double d= L.distanceTo(c.x,c.y);
		    if(d< c.r)
		    	c.moveBy((int)((c.r-d)*L.yv),(int)((c.r-d)*L.xv));
		    
			repaint();// call the operating system to paint
			
		try{
			t.sleep(15);
		}
		catch (Exception x){};
		}
	}
	public void paint(Graphics g) {
		greenguy.draw(g);
		g.drawString(message, 10, 30);
		//battlelord.draw(g) ;
		//Attack.draw(g);
		r.draw(g);
		//greenguy.nextImage();
		//g.drawString(message, 0, 25);
		 L.draw(g);
		 c.draw(g);
		 tank.draw(g);
		 if(L.distanceTo(c.x, c.y)<c.r)  message = "collission";
		         message = "no";
		
		//if (r.hasCollidedWith(greenguy)) greenguy.moving = true;
		
		//r2.draw(g);
		
	}
	
	String message = "0";
	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
	message = "d="+L.distanceTo(mx, my);
		
		
//	if(r.hasCollidedWith(r2))	 message = "Collided";
//	                     
//	else message = "Missed";
	
//	if (r.hasCollidedWith(r)) message = "Collided";
//	else        message=("not Collided");
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// records which keys have been pressed
		
	}
public void mouseClicked(MouseEvent e) {
		
		
	}


	
	


	@Override
	public void mouseReleased(MouseEvent e) {
	
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
	
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		    if(e.getKeyCode()==KeyEvent.VK_LEFT )  leftPressed = true;
		
			if(e.getKeyCode()==KeyEvent.VK_RIGHT ) rightPressed =true;
			
			if(e.getKeyCode()==KeyEvent.VK_UP )    upPressed =true;
			
			if(e.getKeyCode()==KeyEvent.VK_DOWN )  downPressed =true;
			
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_LEFT )  leftPressed = false;
		
		if(e.getKeyCode()==KeyEvent.VK_RIGHT ) rightPressed =false;
		
		if(e.getKeyCode()==KeyEvent.VK_UP ) upPressed =false;

		if(e.getKeyCode()==KeyEvent.VK_DOWN ) downPressed =false;
		
	}
	
   
	


	
	
}
