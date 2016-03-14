import java.util.Arrays;

import javax. swing.JOptionPane;

public class Assignment2 {
	public static void main (String [] args){
		
		String s1,s2,s3,s4,s5;
		s1=JOptionPane.showInputDialog("please enter the first number");
		s2=JOptionPane.showInputDialog("please enter the second number");
		s3=JOptionPane.showInputDialog("please enter the thired number");
		s4=JOptionPane.showInputDialog("please enter the forth number");
		s5=JOptionPane.showInputDialog("please enter the fifth number");
		double dbls1,dbls2,dbls3,dbls4,dbls5,q,w,e,r,t;
		int []a=new int[9];
		dbls1= Double.parseDouble(s1);
		dbls2= Double.parseDouble(s2);
		dbls3= Double.parseDouble(s3);
		dbls4= Double.parseDouble(s4);
		dbls5= Double.parseDouble(s5);
		q=0;
		w=0;
		e=0;
		r=0;
		t=0;
		double [] array= new double[5];
		array[0]=dbls1;
		array[1]=dbls2;
		array[2]=dbls3;
		array[3]=dbls4;
		array[4]=dbls5;
		Arrays.sort(array);
		JOptionPane.showMessageDialog(null,"the sum of the five number is " + (dbls1+dbls2+dbls3+dbls4+dbls5));
		JOptionPane.showMessageDialog(null,"the average of the five number is " + (dbls1+dbls2+dbls3+dbls4+dbls5)/5);
		JOptionPane.showMessageDialog(null,"Median value: " + array[2]);
		JOptionPane.showMessageDialog(null,"Max value: " + array[4]);
		JOptionPane.showMessageDialog(null,"Min value: " + array[0]);
	   if(dbls1==dbls2){
		   q++;
	   }
	   if(dbls1==dbls3){
		   q++;
	   }if(dbls1==dbls4){
		   q++;
	   }if(dbls1==dbls5){
		   q++;
	   }
		
	   if(dbls2==dbls1){
		   w++;
	   }
	   if(dbls2==dbls3){
		   w++;
	   }if(dbls2==dbls4){
		   w++;
	   }if(dbls2==dbls5){
		   w++;
	   }
	   if(dbls3==dbls1){
		   e++;
	   }
	   if(dbls3==dbls2){
		   e++;
	   }if(dbls3==dbls4){
		   e++;
	   }if(dbls3==dbls5){
		   e++;
	   }
	   if(dbls4==dbls1){
		   r++;
	   }
	   if(dbls4==dbls2){
		   r++;
	   }if(dbls4==dbls3){
		   r++;
	   }if(dbls4==dbls5){
		   r++;
	   }
	   if(dbls5==dbls1){
		   t++;
	   }
	   if(dbls5==dbls2){
		   t++;
	   }if(dbls5==dbls3){
		   t++;
	   }if(dbls5==dbls4){
		   t++;
	   }
	   double [] ss= new double[5];
		ss[0]=q;
		ss[1]=w;
		ss[2]=e;
		ss[3]=r;
		ss[4]=t;
		Arrays.sort(ss);
		   
	    
	    if(ss[4]==q){
	    JOptionPane.showMessageDialog(null,"mode value: " +s1 );
	    return;
	    }
	    if(ss[4]==w){
		    JOptionPane.showMessageDialog(null,"mode value: " +s2 );
		    return;
		    }
	    if(ss[4]==e){
		    JOptionPane.showMessageDialog(null,"mode value: " +s3);
		    return;
		    }
	    if(ss[4]==r){
		    JOptionPane.showMessageDialog(null,"mode value: " +s4);
		    return;
		    }
	    if(ss[4]==t){
		    JOptionPane.showMessageDialog(null,"mode value: " +s5);
		    return;
		    }
	}
	}
	
	

