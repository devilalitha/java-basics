package arrays;

public class maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][] = {{1,2,3},{0,1,2},{4,1,0}};
		int max=abc[0][0];
		
		for(int i=0;i<3;i++)   //row count
		{
			for(int j=0;j<3;j++)    //coloumn count
			{
				//System.out.println(abc[i][j]);
				if(max<abc[i][j]) {
					
					max=abc[i][j];
					
				}
				
				
			}
		}
		System.out.println(max);
	}

	}
