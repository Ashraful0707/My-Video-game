package game;

	import java.awt.Graphics;

	import java.awt.Graphics;

	public abstract class PolygonModel2D 
	{
		double x;
		double y; 
		int A;
		
		int[][] struct_x = x_data(); //need abstract class for this to work
		
		int[][] struct_y = y_data();

		
		public PolygonModel2D (double x, double y, int angle)
			{
				this.x = x;
				this.y = y;
				
				A = angle;
			}
			
		public void draw(Graphics g)
			{
				int[] xpoints = new int[4];
				int[] ypoints = new int[4];
				
				double cosA = Lookup.cos[A];
				double sinA = Lookup.sin[A];
				
				for(int poly = 0; poly < struct_x.length; poly++)
				{
					
					for(int vertex = 0; vertex < 4; vertex++)
					{
						xpoints[vertex] = (int)(struct_x[poly][vertex]*cosA - struct_y[poly][vertex]*sinA + x);
						ypoints[vertex] = (int)(struct_x[poly][vertex]*sinA + struct_y[poly][vertex]*cosA + y);
					}
				
					g.drawPolygon(xpoints, ypoints, 4);
				}	
				
				g.drawOval((int)x-15, (int)y-15, 30, 30);
			}

			public void moveForwardBy(int d)
			{
				x += (d * Lookup.cos[A]);
				y += (d * Lookup.sin[A]);
			}
			
			public void moveBackwardBy(int d)
			{
				x -= (d * Lookup.cos[A]);
				y -= (d * Lookup.sin[A]);
			}
			
			public void rotateLeftBy(int degrees)
			{
				A -= degrees;
				if (A < 0) A += 360;
			}
			
			public void rotateRightBy(int degrees)
			{
				A += degrees;
				if (A > 359) A-= 360;
			}

		public abstract int[][] x_data(); 
		public abstract int[][] y_data();

	}

