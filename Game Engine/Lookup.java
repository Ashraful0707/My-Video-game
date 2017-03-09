package game;

public class Lookup 
{
	final static double[] cos = calcCos();
	final static double[] sin = calcSin();
	
	
	public static double[] calcSin()
	{
		double[] sin = new double[360];
		
		for(int i = 0; i < 359; i++)
		{
			sin[i] = Math.sin(i*Math.PI/180);
		}
		
		return sin;
	}
	
	public static double[] calcCos()
	{
		double[] cos = new double[360];
		
		for(int i = 0; i < 359; i++)
		{
			cos[i] = Math.cos(i*Math.PI/180);
		}
		
		return cos;
	}

}


//public class Lookup 
//{
//	final static double[] cos = calcCos();
//	final static double[] sin = calcSin();
//	
//	
//	public static double[] calcSin()
//	{
//		double[] sin = new double[360];
//		
//		for(int i = 0; i < 359; i++)
//		{
//			sin[i] = Math.sin(i*Math.PI/180);
//		}
//		
//		return sin;
//	}
//	
//	public static double[] calcCos()
//	{
//		double[] cos = new double[360];
//		
//		for(int i = 0; i < 359; i++)
//		{
//			cos[i] = Math.cos(i*Math.PI/180);
//		}
//		
//		return cos;
//	}
//
//}
//
////public class Lookup 
////{
////	final static double[] sin =calcSine();
////	final static double[ ] cos = calcCos();
////
////	public static double[] calcSine(){
////		double []sin= new double[360]; 
////		for(int i =0; i< 359;i++)
////		{
////				sin[i]= Math.sin(i*Math.PI/180);
////						
////		}
////		return sin;
////		
////	}
////	
////	public static double[ ] calcCos(){
////		double [ ]cos= new double[360]; 
////		for(int i =0; i< 359;i++)
////		{
////				cos [i]= Math.sin(i*Math.PI/180);
////						
////		}
////		return cos;
////		
////	}
////	public static void setup()
////	{
////		for(int i =0; i< 359;i++)
////	{
////			sin[i]= Math.sin(i*Math.PI/180);
////			cos[i]= Math.cos(i*Math.PI/180);
////			
////	}
////	
////	
////	}
////	
////    }
