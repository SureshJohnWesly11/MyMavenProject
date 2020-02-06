package com.maven.maven_project;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	int NOO;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Gifts to be Created: ");
        NOO=sc.nextInt();
        GiftBox pack[]=new GiftBox[NOO];
        for(int i=0;i<NOO;i++) {
        	int i1=0,i2=0,i3=0;
        	String s="",c="",cs="";
        	System.out.print("Enter About Sweet in the Box(Name&Weight) "+(i+1)+": ");
        	s=sc.next();
        	i1=sc.nextInt();
        	System.out.print("Enter About Chocolates in the  Box(Name&Weight)"+(i+1)+": ");
        	c=sc.next();
        	i2=sc.nextInt();
        	System.out.print("Enter About Candies in the Box(Name&Weight) "+(i+1)+": ");
        	cs=sc.next();
        	i3=sc.nextInt();
        	pack[i]=new GiftBox(s,i1,c,i2,cs,i3);
        }
        System.out.println("List of Actions:");
        System.out.println("1-->Total Weight of Available Gifts");
        System.out.println("2-->Sort Gifts Corresponding to a range");
        System.out.println("3-->Exit");
        while(true) {
        int choice=sc.nextInt();
        switch(choice)
        {
               case 1:for(int i=0;i<NOO;i++)
                     {
             	         System.out.print("Total weight in gift"+(i+1)+" : ");
             	         System.out.println(pack[i].total);
                     }
                     break;
               case 2:System.out.println("Choose Item for Optimisation");
                      System.out.println("1-->Total");
                      System.out.println("2-->Sweets");
                      System.out.println("3-->Chocolates");
                      System.out.println("4-->Candies");
                      System.out.println("Enter required item");
                      int c=sc.nextInt();
                      System.out.println("Enter range");
                      int d=sc.nextInt();
                      int e=sc.nextInt();
                      switch(c)
                      {
                             case 1:int m=0;
                                    boolean flag1=false;
                             		while(m<NOO)
                             		{
                             			if(pack[m].total>=d && pack[m].total<=e)
                             			{
                             				flag1=true;
                             				System.out.println("Gift"+(m+1)+pack[m].total);
                             			}
                             		}
                             		if(!flag1)
                             		{
                             			System.out.println("There is no Gifts in specified range");
                             		}
                             		break;
                             case 2:int i=0;
                                    boolean flag2=false;
                                    while(i<NOO)
                                    {
                        	                if(pack[i].getSweetWeight()>=d && pack[i].getSweetWeight()<=e)
                        	                {
                        	                	    flag2=true;
                        		                    System.out.println("In Gift"+(i+1)+pack[i].getSweetName()+":"+pack[i].getSweetWeight());
                        	                }
                        	                i++;
                                     }
                                    if(!flag2)
                                    {
                               		        System.out.println("There are no sweets in the specified range");
                               	    }
                                    break;
                             case 3:int j=0;
                                    boolean flag3=false;
                                    while(j<NOO)
                                    {
                 	                     if(pack[j].getChocolateWeight()>=d && pack[j].getChocolateWeight()<=e)
                 	                     {
                 	                    	     flag3=true;
                 		                         System.out.println("In Gift"+(j+1)+pack[j].getChocolateName()+":"+pack[j].getChocolateWeight());
                 	                     }
                 	                     j++;
                                    }
                                    if(!flag3)
                                    {
                               		 System.out.println("There are no Gifts in the specified range");
                                    }
                                    break;
                             case 4:int k=0;
                                    boolean flag4=false;
                                    while(k<NOO)
                                    {
                 	                     if(pack[k].getCandiesWeight()>=d && pack[k].getCandiesWeight()<=e)
                 	                     {
                 	                    	     flag4=true;
                 		                         System.out.println("In Gift"+(k+1)+pack[k].getCandiesName()+":"+pack[k].getCandiesWeight());
                 	                     }
                 	                     k++;
                                    }
                                    if(!flag4)
                                    {
                               		        System.out.println("There are no Gifts in the specified range");
                               	    }
                                    break;
                      }
                      break;
               case 3: 
               default: return;
        }
    }
    }
}
