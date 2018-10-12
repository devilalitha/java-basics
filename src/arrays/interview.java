package arrays;

public class interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc[][] = {{1,2,3},{9,1,2},{4,1,0}};
		int min=abc[0][0];
		int mincolumn=0;
			
		for(int i=0;i<3;i++)   //row count
		{
			for(int j=0;j<3;j++)    //coloumn count
			{
				//System.out.println(abc[i][j]);
				if(abc[i][j]<min) {
					
					min=abc[i][j];
					 mincolumn = j;
					
				}
								
			}
		}
	
		int max=abc[0][mincolumn];
		int k=0;
		while(k<3)
		{
			max=abc[k][mincolumn];
		
		}
		k++;
		System.out.println(max);
		
	}
		
}
