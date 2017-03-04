package game;

import java.awt.Graphics;

public class Tank {

	int x;
	int y;
	int A;
	
	int[] bodyy ={30,30,-30,-30 };
	int [] bodyx= {50,-50,-50,50};
	
	int[] ltracky={ -30,-30,-40,-40};
	int[]ltrackyx ={40,-40,-40,40};
	
	int[] rtrackx={ 30,30,40,40};
	int[] rtracky ={40,-40,-40,40};
	
	int[]gunx = {3,3,-3,-3};
	int []guny = {45,15,15,45};
	
	
	public Tank(int x,int y,int angle)
	{
		this.x = x;
		this.y =y;
		A= angle;
		
	}
	
	public void draw(Graphics g){
		int[] xpoints = new int[4];
		int[]ypoints = new int[4];
		double radians = A*Math.PI/180;
		double cosA = Math.cos(radians);
		double sinA = Math.sin(radians);
		
		for(int vert =0;vert<4;vert++)
		{
			xpoints[vert]= (int) (bodyx[vert]*cosA-bodyy[vert]*sinA+x);
			ypoints[vert]= (int) (bodyx[vert]*sinA+bodyy[vert]*cosA+y);
		}
		g.drawPolygon(xpoints,ypoints,4);
		
		for(int vert =0;vert<4;vert++)
		{
			xpoints[vert]= (int) (ltrackx[vert]*cosA-rtracky[vert]*sinA+x);
			ypoints[vert]= (int) (ltrackx[vert]*sinA+ltracky[vert]*cosA+y);
		}
		g.drawPolygon(xpoints,ypoints, 4);
		
		for(int vert =0;vert<4;vert++)
		{
			xpoints[vert]= (int) (rtrackx[vert]*cosA-rtracky[vert]*sinA+x);
			ypoints[vert]= (int) (rtrackx[vert]*sinA+rtracky[vert]*cosA+y);
		}
		g.drawPolygon(xpoints,ypoints, 4);
		
		for(int vert =0;vert<4;vert++)
		{
			xpoints[vert]= (int) (gunx[vert]*cosA-guny[vert]*sinA+x);
			ypoints[vert]= (int) (gunx[vert]*sinA+guny[vert]*cosA+y);
		}
		  g.drawPolygon(xpoints,ypoints, 4);
		 // g.drawOval(x-15, y-15,20 , 20);
//		xpoints[0]= bodyx[0]+x;
//		xpoints[1]= bodyx[1]+x;
//		xpoints[2]= bodyx[2]+x;
//		xpoints[3]= bodyx[3]+x;
//		
//		ypoints[0]= bodyx[0]+y;
//		ypoints[1]= bodyx[1]+y;
//		ypoints[2]= bodyx[2]+y;
//		ypoints[3]= bodyx[3]+y;
		
		
//		g.drawPolygon(xpoints,ypoints,4);
//		g.drawPolygon(ltrackx, ltracky, 4);
//		g.drawPolygon(rtrackx, rtracky, 4);
//		g.drawPolygon(gunx, guny, 4);
		g.drawOval(x-15, y-15,30,30);
		//4 point each
	}
	
	public void forwardBy(int d){
		x += d*Math.cos(A*Math.PI/180);
	}
	public void backwardBy(int d){
		x -= d*Math.sin(A*Math.PI/180);
	}
	public void rotateLeftBy(int degrees){
		A -= degrees;
	}
	public void rotateRightBy(int degrees){
		A += degrees;
		
	}
	public void rotateUpBy(int degrees){
		A += degrees;
	}
	public void rotateDownBy(int degrees){
		A -= degrees;
	}
	
	
	public void moveBy(int dx, int dy){
		x+= dx;
		x+= dy;
	 }
	 public void moveLeftBy(int dx){
		 x -=dx;
			
		 
	 }
	public void moveRightBy(int dx){
		 x +=dx;
	 }
	public void moveUpBy(int dy){
		
		 y -=dy;
	}
	public void moveDownBy(int dy){
		 y +=dy;
	}
}
