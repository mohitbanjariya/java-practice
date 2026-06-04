package armycoder.com;

public class methodcreate {
	//no return no argument
       void show()
       {
    	   System.out.println("hello");
       }
       
       
       // no return with arguments
        void calci(int a,int b)
        {
        	System.out.println("addition="+(a+b));
        	System.out.println("subtraction="+(a-b));
        	System.out.println("multiplication="+(a*b));
        	System.out.println("addition="+(a/b));
        }
        public static void main(String arr[])
        {
     	   methodcreate obj = new methodcreate();
     	   obj.show();
     	   
     	   obj.calci(12, 45);
     	   
     	   
        } 
}
