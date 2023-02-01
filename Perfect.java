package loop;
public class Perfect {
	public static void main(String[] args) {
		Perfect perfect=new Perfect();
		int no=1; 
		while(no<100) {
		   perfect.add(no);  
		   no++;
		}
} 
	public void add(int no)
	{
 int div=1,count=0;
 while(div<=no) //1<=1
 {
	 if(no%div==0)
	 {
		 count=count+div;
	 }
	 div++;
 } 
 //    System.out.println(count); 
    if(count==no)
    {
    	System.out.println(count);
    }
   
}
	}