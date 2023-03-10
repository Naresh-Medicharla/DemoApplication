package MainClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lambdaExpressions.Display;
import lambdaExpressions.DisplayImpl;


@FunctionalInterface
interface Drawable{  
    public void draw();
    }  


//Implementation of functional Comparator interface
class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer I1, Integer I2) {
		// TODO Auto-generated method stub
		
		if(I1<I2) {
			return -1;
		}
		else if(I2>I1) {
			return 1;
		}
		else {
			return 0;
		}
		
	}


}
public class Main {

	public static void main(String[] args) {
//		Display disply = new DisplayImpl();
//		disply.student();
		
		
		
//	       Implementing Drawable interface by using anonymous Class
		
//	       Drawable d=new Drawable(){  
//	            public void draw(){System.out.println("Drawing ");}  
//	            
//	            public void paint() {System.out.println("Painting ");};
//	        };  
//	        d.draw();
//		    d.paint();
		
//        Implementing Drawable interface by using Lambda Expression without arguments	
		
				Drawable d =() ->{
				       System.out.println("Lambda Expression without arguments ");
				       System.out.println("Interface must be a Functional interface");
				    };		
		        d.draw();
		        
//		    Implementing Display interface by using Lambda Expression without arguments	String as Return type
//		    Display display = () -> {
//					return "Naresh";				
//		    };
//		    System.out.println(display.studentName());
		        
//		   Implementing Display interface by using Lambda Expression with single argument integer as Return type
		        
//		        Display rollNum = (int k)->{
//		        	int j = k+1;
//		        	return j;
//		        	};
//		    System.out.println(rollNum.studentRollNum(1));
//		    
//	        Display rollNum2 = input ->{
//	        	return input;
//	        	};
//	        System.out.println(rollNum2.studentRollNum(22));
		    
//			   Implementing Display interface by using Lambda Expression with two arguments integer as Return type
	        
	        Display d1 = (name,id)->{
	        	System.out.println("name :"+ name + " id :"+id);
	        	return "";
	        	
	        };
	        d1.studentName("Naresh",227);
	        
//			   Implementing Display interface by using Lambda Expression with two arguments without Return type	      
	        
	        Display d2 = (name,id) -> (name + String.valueOf(id));
	       System.out.println( d2.studentName("Naresh Medicharla",227));
	       
//	       Lambda Expression Example for for each loop
//	       List<Object> arrayList = new ArrayList<>();
//	       arrayList.add("A");
//	       arrayList.add("B");
//	       arrayList.add("C");
//	       arrayList.add("D");
//	       
//	       arrayList.forEach((output)->System.out.println(output));
	       
	       List<Integer> i = new ArrayList<>();
	       i.add(23);
	       i.add(2);
	       i.add(34);
	       i.add(12);
	       Comparator<Integer> mycomparator = (I1, I2) -> { return (I1<I2)?-1:((I1>I2)?1:0); };
	       System.out.println(i);
	       Collections.sort(i, mycomparator);
	       System.out.println(i);
	       
	       i.forEach((output)->{System.out.println(output);});
	       
//		   Implementing Runnable interface(MultIThreading) by using Lambda Expression 
	       
	       Runnable r2 = ()->{	
		    	               for(int j=0; j<=5;j++) {
		    	                 System.out.println("runnable 2");
		    	                }
		                      };
	                         	                                        
	       Thread thread = new Thread(()->{	
               for(int j=0; j<=5;j++) {
               System.out.println("runnable 1 ");
               }
               });
	       Thread thread2 = new Thread(r2);
       
	       thread.start();
	       thread2.start();
	      
	       
	}

}
