import java.util.Arrays;

import javax. swing.JOptionPane;

public class Assidnment2 {
	public static void main (String [] args){
		
		String s1,s2,s3,s4,s5;
		s1=JOptionPane.showInputDialog("please enter the first number");
		s2=JOptionPane.showInputDialog("please enter the second number");
		s3=JOptionPane.showInputDialog("please enter the thired number");
		s4=JOptionPane.showInputDialog("please enter the forth number");
		s5=JOptionPane.showInputDialog("please enter the fifth number");
		double dbls1,dbls2,dbls3,dbls4,dbls5;
		int []a=new int[9];
		dbls1= Double.parseDouble(s1);
		dbls2= Double.parseDouble(s2);
		dbls3= Double.parseDouble(s3);
		dbls4= Double.parseDouble(s4);
		dbls5= Double.parseDouble(s5);
		double [] array= new double[5];
		array[0]=dbls1;
		array[1]=dbls2;
		array[2]=dbls3;
		array[3]=dbls4;
		array[4]=dbls5;
		Arrays.sort(array);
		JOptionPane.showMessageDialog(null,"the sum of the five number is " + (dbls1+dbls2+dbls3+dbls4+dbls5));
		JOptionPane.showMessageDialog(null,"the average of the five number is " + (dbls1+dbls2+dbls3+dbls4+dbls5)/5);
		
	    if (dbls1 > dbls2&&dbls1>dbls3&&dbls1>dbls4&&dbls1>dbls5){ 
	    	
	    				JOptionPane.showMessageDialog(null,"max valus: " + dbls1);
       
    	   
	
	    	}
	    if (dbls2 > dbls1&&dbls2>dbls3&&dbls2>dbls4&&dbls2>dbls5){ 
	    				JOptionPane.showMessageDialog(null,"max valus: " + dbls2);
	    			
	    
	    	}
	    if (dbls3 > dbls2&&dbls3>dbls1&&dbls3>dbls4&&dbls3>dbls5){ 
	    				JOptionPane.showMessageDialog(null,"max valus: " + dbls3);
	    			}
	   
	    if (dbls4 > dbls2&&dbls4>dbls3&&dbls4>dbls1&&dbls4>dbls5){ 
	    				JOptionPane.showMessageDialog(null,"max valus: " + dbls4);
	    			}
	 
	    if (dbls5 > dbls2&&dbls5>dbls3&&dbls5>dbls4&&dbls5>dbls1){ 
	    				JOptionPane.showMessageDialog(null,"max valus: " + dbls5);
	    			}
	    
	    if  (dbls1 < dbls2&&dbls1<dbls3&&dbls1<dbls4&&dbls1<dbls5){ 
	    	
	    				JOptionPane.showMessageDialog(null,"min value: " + dbls1);
	    	}
	    if  (dbls2 < dbls1&&dbls2<dbls3&&dbls2<dbls4&&dbls2<dbls5){ 
	    				JOptionPane.showMessageDialog(null,"min value: " + dbls2);
	    			}
	    
	    if  (dbls3 < dbls2&&dbls3<dbls1&&dbls3<dbls4&&dbls3<dbls5){ 
	    				JOptionPane.showMessageDialog(null,"min value: " + dbls3);
	    			}
	    if  (dbls4 < dbls2&&dbls4<dbls3&&dbls4<dbls1&&dbls4<dbls5){ 
	    				JOptionPane.showMessageDialog(null,"min value: " + dbls4);
	    			}
	    if  (dbls5 < dbls2&&dbls5<dbls3&&dbls5<dbls4&&dbls5<dbls1){ {
	    				JOptionPane.showMessageDialog(null,"min value: " + dbls5);
	    			}
	  
	    }
	    JOptionPane.showMessageDialog(null,"min value: " + dbls5);
	}
	}
	

