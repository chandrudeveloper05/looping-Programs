package loop;
public class PatternProgram1 {
	public static void main(String[] args) {
		PatternProgram1 pattern =new PatternProgram1();
		pattern.A();
		pattern.B();
        pattern.C();
		pattern.D();
        pattern.E();
        pattern.F();
		pattern.G();
		pattern.H();
		pattern.I();
		pattern.J();
        pattern.K();
		pattern.L();
		pattern.M(); 
        pattern.N();
        pattern.O();
	    pattern.P();
        pattern.Q();
        pattern.R(); 
        pattern.S();
		pattern.T();
		pattern.U();
		pattern.V();		
		pattern.W();
		pattern.X();
	    pattern.Y(); 
	    pattern.Z();
	    pattern.CHANDRU();
	}
	private void CHANDRU() {
             for(int no=1;no<=7;no++)
             {
            	 
             }
	}
	private void Z() {
		int no=8;
              for(int row=1;row<=7;row++)
              {
                  for(int col=1;col<=7;col++)
                  { 
                	  if(row==1&&col!=7||row==7&&col!=1||col==no-row) 
                	  {
                		  System.out.print("* ");
                	  }
                	  else 
                	  {
                		  System.out.print("  ");
                	  }
                  }
                         System.out.println();
              }
              System.out.println();
	}
	private void V() 
	{
		 int no=10;
              for(int row=1;row<=9;row++)
              {
                  for(int col=1;col<=9;col++)
                  {
                	  if(row==col&&row<=4||(col==no-row)&&row<=5)
                	  {
                		  System.out.print("* ");
                	  }
                	  else
                	  {
                		  System.out.print("  ");
                	  }
                  }
                       System.out.println();
              }
              System.out.println("-----------------------------------");		

	}
	private void U() {
       for(int row=1; row<=6; row++)
       {
           for(int col=1; col<=6; col++)
           {
        	   if(col==1&&row!=6||row==6&&col!=1&&col!=6||col==6&&row!=6) 
        	   {
        		   System.out.print("* ");
        	   }
        	   else 
        	   {
        		   System.out.print("  "); 

        	   }
           }
                   System.out.println();
       }
       System.out.println("-----------------------------------");		

	}
	private void S() {
           for(int row=1; row<=7; row++)
           {
               for(int col=1; col<=6; col++)
               {
            	   if(row==1&&col!=1||row==4&&col!=1&&col!=6||row==7&&col!=6||col==1&&row>=2&&row!=4&&row!=6&&row!=5||col==6&&row>=5&&row!=7)
            	   {
            		   System.out.print("* ");
            	   }
               
               else
        	   {
        		   System.out.print("  ");
        	   }
               //System.out.println();
           }
           System.out.println();		
           }
           System.out.println("-----------------------------------");		

	}
	private void R() {
		int no=3;
		  for (int row=1; row<=8; row++)
          {
          	for (int col=1;col<=5; col++)
          	{
          		if(col==1||row==1||row==4||col==5&&row<=4)
          		{
          			//System.out.print("* ");
          			if(col!=4)
          			{
          				System.out.print("* ");
          			}
          		}
          		else if(row==no+col)
      			{
      				System.out.print("* ");

      			}
          		else
          		{
          			System.out.print("  ");
          		}
          	}
          	System.out.println();
          }
          System.out.println("-----------------------------------");		
	}
	private void Q() {
		for(int row=1;row<=10;row++)
        {
      	  for(int col=1; col<=10; col++)
      	  {
      		  if(row==1&&col!=1&&col<=6||row==7&&col!=1&&col<=6||col==1&&row!=1&&row<=6||col==7&&row!=1&&row<=7||row==col&&row>=8)
      		  {
      			  System.out.print("* ");
      		  }
      		  else
          	  {
      			  System.out.print("  ");

          	  }
      	  }
      	  System.out.println();
        }
        System.out.println("-----------------------------------");		

	}
	private void O() {
              for(int row=1;row<=6;row++)
              {
            	  for(int col=1; col<=6; col++)
            	  {
            		  if(row==1&&col!=1&&col!=6||row==6&&col!=1&&col!=6||col==1&&row!=1&&row!=6||col==6&&row!=1&&row!=6)
            		  {
            			  System.out.print("* ");
            		  }
            		  else
                	  {
            			  System.out.print("  ");

                	  }
            	  }
            	  System.out.println();
              }
              System.out.println("-----------------------------------");		

	}
	private void K() {
		int no=6,no2=2;
         for(int row=1;row<=7; row++)
         {
        	 for(int col=1;col<=5;col++)
        	 {
        		 if(col==1||col==no-row||row==no2+col)  
        		 {
        			 System.out.print("* ");
        		 }
        		 else
        		 {  
        			 System.out.print("  ");
        		 }
        	 }
        	 System.out.println();
         }
         System.out.println("-----------------------------------");		

	}
	private void G() {
		for (int row=1; row<=7; row++)
	       	{
			for(int col=1; col<=9; col++)
			{
				if(row==1&&col<=7||col==1||row==3&&col>=4||row==5&&col>=4&&col!=8||row==7&&col!=8||col==9&&row>=3||col==4&&row>=3&&row!=6||col==7&&row>=3&&row!=4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}

			}
		System.out.println();
		}
        System.out.println("-----------------------------------");

	}
	
	private void F() {
              		for (int row=1; row<=7; row++)
              	       	{
              			for(int col=1; col<=7; col++)
              			{
              				if(col==2||row==1||row==4)
              				{
              					if(col!=1)
              					{
              						System.out.print("* ");
              					}
              					else if(row==4)
              					{
              						System.out.println("* ");
              				}
              					else
              					{
              						System.out.print("  ");
              					}
              				}
              			}
              			System.out.println();
              		}
                   System.out.println("-----------------------------------");

	}
	private void E() {
		 for (int row=1; row<=7; row++)
         {
        	 for(int col=1; col<=7; col++)
        	 {
        		 if(row==1||row==7||col==2||row==4)
        		 {
        			if(col!=1)
        			{
        				System.out.print("* ");
        			}
        			else if(row==4)
        			{
        				System.out.print("* ");
        			}
        			 else
            		 {
            			 System.out.print("  ");
            		 }
                 }
        		
        	 }
        	 System.out.println();
        	 }
         System.out.println("-----------------------------------");
         }	
	private void C() {
             for (int row=1; row<=7; row++)
             {
            	 for(int col=1; col<=7; col++)
            	 {
            		 if(row==1||row==7||col==2)
            		 {
            			if(col!=1)
            			{
            				System.out.print("* ");
            			}
            			 else
                		 {
                			 System.out.print("  ");
                		 }
                     }
            		
            	 }
            	 System.out.println();
            	 }
             System.out.println("-----------------------------------");

             }
	private void P() {
		  for (int row=1; row<=8; row++)
          {
          	for (int col=1;col<=5; col++)
          	{
          		if(col==1||row==1||row==4||col==5&&row<=4)
          		{
          			//System.out.print("* ");
          			if(col!=4)
          			{
          				System.out.print("* ");
          			}
          			
          		}
          		else
          		{
          			System.out.print("  ");
          		}
          	}
          	System.out.println();
          }
          System.out.println("-----------------------------------");

	}
	private void Y() {
		int no=8;
            for (int row=1; row<=7; row++)
            {
            	for (int col=1;col<=7; col++)
            	{
            		if(col==row&&row<=4||col==no-row&&row<=4||col==4&&row>=4)
            		{
            			System.out.print("* ");
            		}
            		else
            		{
            			System.out.print("  ");
            		}
            	}
            	System.out.println();
            }
            System.out.println("-----------------------------------");
	}
	private void X() {
       int no=0,no2=8;
       for(int row=1;row<=7;row++)
       {
    	   for(int col=1; col<=7; col++)
    	   {
    		   if(col==no+row||col==no2-row)
    		   {
    			   System.out.print("* ");
    		   }
    		   else
    		   {
    			   System.out.print("  ");
    		   }
    	   }
    	   System.out.println();
       }
       System.out.println("-----------------------------------");

	}
	private void W() {
            		int no=10,no2=2;
            		for(int row=1;row<=9;row++)
            		{ 
            			for(int col=1; col<=11; col++)
            			{
            				if(col==1||col==11||row==no-col&&col<=6||col==no2+row&&row>=4)
            				{
            					System.out.print("* ");
            				}
            				else
            				{
            					System.out.print("  ");
            				}
            			}
            			System.out.println();
            		}
                    System.out.println("-----------------------------------");
            		
	}
	private void J() {
		for (int row=1; row<=7; row++)
        {
       	 for(int col=1; col<=7; col++)
       	 {
       		if(row==1||col==4&&row!=7||row==7&&col<=3||col==1&&row>=5)
       		{
       			System.out.print("* ");
       		}
       		else
       		{
       			System.out.print("  ");
       		}
       	 }
       	 System.out.println();
        }
        System.out.println("-----------------------------------");
	}

	private void A() {
		int no=7,no2=5;
            for(int row=1; row<=6; row++)
            {
            	for (int col=1; col<=11; col++)
            	{
            		if(col==no-row||col==no2+row||row==4&&col>=4&&col<=9) 
            		{ 
            			System.out.print("* ");
            		}
            		else
            		{
            			System.out.print("  ");
            		}
            		
            	}
            	System.out.println();
            }
            System.out.println("-----------------------------------");
	}

	private void D() {
	 for(int row=1; row<=9; row++) 
     { 
    	 for( int col=1; col<=9; col++)
    	 { 
    		if(row==1||row==9||col==1||col==9)
    		{
    			//System.out.print("* ");
    	        if(col!=8) 
    		{
        			System.out.print("* ");

    		}
    			}
    		else
    		{
    			System.out.print("  ");
    		}
    	 }
    	 System.out.println();
     } 
     System.out.println("-----------------------------------");
}				
	

	private void H() {
			 for(int row=1; row<=7; row++)
	         {
	        	 for(int col=1; col<=6; col++)
	        	 {
	        		if(col==1||col==6||row==4)
	        		{
	        			System.out.print("* ");
	        		}
	        		else
	        		{
	        			System.out.print("  ");
	        		}
	        	 }
	        	 System.out.println();
	         }
	         System.out.println("-----------------------------------");
		}		
	

	private void I() {
		 for(int row=1; row<=6; row++)
         {
        	 for(int col=1; col<=7; col++)
        	 {
        		if(row==1||col==4||row==6)
        		{
        			System.out.print("* ");
        		}
        		else
        		{
        			System.out.print("  ");
        		}
        	 }
        	 System.out.println();
         }
         System.out.println("-----------------------------------");
}		
	

	private void L() {
             for(int row=1; row<=6; row++)
             {
            	 for(int col=1; col<=6; col++)
            	 {
            		if(col==1||row==6)
            		{
            			System.out.print("* ");
            		}
            		else
            		{
            			System.out.print("  ");
            		}
            	 }
            	 System.out.println();
             }
             System.out.println("-----------------------------------");
	}

	private void T() {
		 for(int row=1; row<=6; row++)
         {
        	 for(int col=1; col<=7; col++)
        	 {
        		if(row==1||col==4)
        		{ 
        			System.out.print("* ");
        		}
        		else
        		{
        			System.out.print("  ");
        		}
        	 }
        	 System.out.println();
         }
         System.out.println("-----------------------------------");
}
	

	private void B() {
           for(int row=1; row<=7; row++)
           {
        	   for(int col=1; col<=6; col++)
        	   {
        		   if(col==1||col==6||row==1||row==4||row==7)
         		   {
        			   //System.out.print("* ");
        			   if(col!=5)
        			   {
            			    System.out.print("* "); 
        			   }
        		   }
        		   else
        		   {
        			   System.out.print("  ");
        		   }
        	   }
        	   System.out.println();
           }
           System.out.println("-----------------------------------");
	}

	private void M() {
		
			int no=12;
	              for(int row=1; row<=9; row++) 
	              {
	            	  for(int col=1; col<=11; col++)
	            	  { 
	            		  if(col==1||col==row&&row<=5||col==11||col==no-row&&row<=6)  
	            		  {
	            			  System.out.print("* "); 
	            		  }
	            		  else
	            		  {
	            			  System.out.print("  ");
	            		  }
	            	  }
	            	  System.out.println(  );
	              }
	                System.out.println("-----------------------------------");
		}

	private void N() {
              for(int row=1; row<=6; row++) 
              {
            	  for(int col=1; col<=6; col++)
            	  { 
            		  if(col==1||col==6||col==row)  
            		  {
            			  System.out.print("* "); 
            		  }
            		  else
            		  {
            			  System.out.print("  ");
            		  }
            	  }
            	  System.out.println(  );
              }
              System.out.println("-----------------------------------");

	}
	
}