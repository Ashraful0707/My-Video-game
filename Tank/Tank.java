package game;

import java.awt.Graphics;

import java.awt.*;

public class Tank extends PolygonModel2D
{

	public Tank (double x, double y, int angle)
	{
		super(x, y, angle);
	}
	
	public void draw(Graphics g)
	{
		super.draw(g);
			g.drawOval((int)x-15, (int)y-15, 30, 30); //don't need this if we didn't have circular turret
	}

	public int[][] x_data()
	{
		int[] [] struct_x =
			{
				{50, -50, -50, 50},
				{40, -40, -40, 40},
				{40, -40, -40, 40},
				{45, 15, 15, 45}
			};
		return struct_x;
	}
	
	public int[][] y_data()
	{
		int[] [] struct_y =
			{
				{30, 30, -30, -30},
				{-30, -30, -40, -40},
				{30, 30, 40, 40},
				{3, 3, -3, -3}
			};
		return struct_y;
	}
}
	
/*
 * Given point (x,y) and angle B produce point (x1, y1) which results from rotating point (x,y) by angle B
 * 
 */










//public class Tank 
//{
//	
//
// 
//
//	double x;
//	double y;
//	int A;
//	int [][] struct_x = x_data ();
//		
//			
//	int [][] struct_y = y_data();
//			
//	
//	
////	int[] bodyy =
////	int [] bodyx= 
////	
////	int[] ltracky
////	int[] ltrackx =
////	
////	int[] rtracky={ 30,30,40,40};
////	int[] rtrackx =
////	
////	int[]guny = {3,3,-3,-3};
////	int []gunx = 
////	
//	
//	public PolygonModel2D(double x,double y,int angle)
//	{
//		this.x = x;
//		this.y =y;
//		A= angle;
//		
//	}
//	
//	public abstract int [] [] x_data();
//	public abstract int [] [] y_data();
//		
//	
//	public void draw(Graphics g){
//		int[] xpoints = new int[4];
//		int[]ypoints = new int[4];
//		double cosA = Lookup.cos[A];
//		double sinA = Lookup.sin[A];
////		
//		//double radians = A*Math.PI/180;
////		double cosA = Math.cos(radians);
////		double sinA = Math.sin(radians);
//		
//		for(int polygon = 0; polygon <struct_x.length;polygon++)
//			{
//				
//			
//		
//		for(int vert =0;vert< 4;vert++)
//		{
//			xpoints[vert]= (int) (struct_x[polygon][vert]*cosA- struct_y [polygon][vert]*sinA+x);
//			ypoints[vert]= (int) (struct_x[polygon][vert]*sinA+ struct_y [polygon][vert]*cosA+y);
//		}
//		g.drawPolygon(xpoints,ypoints,struct_x[polygon].length);
//		
//		}
//		//g.drawOval( (int)x-15, (int) y-15,30,30);
//		//4 point each
//	}
//	
//	public void moveForwardBy(int d){
//		//x += d*Math.cos(A*Math.PI/180);
//		x +=  d*Lookup.cos[A];
//		//y+=d * Math.sin(A*Math.PI/180);
//	     y+= d*Lookup.sin[A];
//	}
//	public void moveBackwardBy(int d){
//		//x += d*Math.cos(A*Math.PI/180);
//		x-=  d*Lookup.cos[A];
//		//y+=d * Math.sin(A*Math.PI/180);
//	     y-= d*Lookup.sin[A];
//	}
//	
//	public void rotateLeftBy(int degrees){
//		A -= degrees;
//		if(A<0) A+= 360; 
//	}
//	public void rotateRightBy(int degrees){
//		A += degrees;
//		if(A>359) A-= 360; 
//		
//	}
//	
//}
