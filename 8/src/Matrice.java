
public class Matrice {

	
	public  static void main( String [ ]args)
	{
		int  a[][]= {{1,2 },
				      {3,4}};
		
		int  b[][]= {{3,3 },
				     {3,3}};
		int  suma[][]=new int[2][2];
		
		
		System.out.println("suma");
		for(int i=0;i<suma.length;i++)
		{
		for(int j=0;j<suma[i].length;j++)
		{
			suma[i][j]=a[i][j]+b[i][j];
			System.out.print( " "+suma[i][j] );
		}
		}
		System.out.println("");
	    int  tsuma[][]=new int[2][2];
		tsuma[0][0]=suma[0][0];
		tsuma[0][1]=suma[1][0];
		tsuma[1][0]=suma[0][1];
		tsuma[1][1]=suma[1][1];
		
		System.out.println("transpusa sumei");
		for(int i=0;i<suma.length;i++)
		{
		for(int j=0;j<suma[i].length;j++)
		{
			
			System.out.print(" " +tsuma[i][j]);
		}
		}
	}
	
}
