package com.lineprogram;

import java.util.Scanner;

public class LineComparisonCompute{
           double x1,x2,x3,x4;
           double y1,y2,y3,y4;
           double length1,length2;
           
public  void LineCompute(){

           Scanner sc = new Scanner(System.in);
	System.out.println("input First Co-ordinates:");
                        int x1 = sc.nextInt();			
                        int y1 = sc.nextInt();
    System.out.println("input Second Co-ordinates:");
                    	int x2 = sc.nextInt();
	                    int y2 = sc.nextInt();
	System.out.println("input Third Co-ordinates:");
	                    int x3 = sc.nextInt();
	                    int y3 = sc.nextInt();
	System.out.println("input Fourth Co-ordinates:");
	                    int x4 = sc.nextInt();
	                    int y4 = sc.nextInt();
	
                       double length1,length2;
                         length1 = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
	                             System.out.println("The length of First line is:" +length1);
	                             
	                     length2 = Math.sqrt(Math.pow((x4-x3),2)+ Math.pow((y4-y3),2));	     
                                 System.out.println("The length of Second line is:" +length2);
                           } 
                                 
                  public void linecompare(double length1,double length2) {
	                     if(length1 == length2) {
     		               System.out.println("Lines Are Equals");
           	                }else if(length1 > length2){
		
                           System.out.println("First Line is Longer than Second Line ");
	                        }else {
		
                           System.out.println("Lines Are Not Equals");
                           
      System.out.println(); //space                          
      System.out.println("Second Line is Longer than First Line");
	}
  }
}