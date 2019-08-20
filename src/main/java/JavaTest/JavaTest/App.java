package JavaTest.JavaTest;

/**
 * Hello world! Tested
 *
 */
public class App {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        for(int i=1;i<=6;i++)
        {
        	for(int j=1;j<=i;j++)
        	{
        		 System.out.print(j);
        	}
        	System.out.println();
        }
       
        
        
        for(int a=1;a<=4;a++)
        {
        	if(a==2||a==3)
        	{
        		System.out.println("*  *");
        	}
        	else
        	System.out.println("****");
        }
        
        
        
     for(int k=1;k<=4;k++)
     {
    	 switch(k) 
    	 {
    		 case 1:
    			 System.out.println("****");
    			 break;
    			 
    		 case 2:
    			 System.out.println("*  *");
    			 break;
    			 
    		 case 3:
    			 System.out.println("*  *");
    			 break;
    			 
    		 case 4:
    			 System.out.println("****");
    			 break;
    			 
    	 }
    	 
    		 
    	 
     }
      
    }
}
