package com.maven.maven_project;

public class GiftBox {
	Sweet sw;
	Chocolate cw;
	Candies csw;
	int total=0;
	public GiftBox(String s,int i1,String c,int i2,String cs,int i3) {
		// TODO Auto-generated constructor stub
		total = i1+i2+i3;
		sw=new Sweet(s,i1);
		cw=new Chocolate(c,i2);
		csw=new Candies(cs,i3);
	}
	void setSweetName(String a)
    {
  	  sw.setName(a);
    }
    String getSweetName()
    {
  	  return sw.getName();
  	  
    }
    void setSweetWeight(int b)
    {
  	  sw.setWeight(b);
    }
    int getSweetWeight()
    {
  	  return sw.getWeight();
    }
    void setChocolateName(String a)
    {
  	  cw.setName(a);
    }
    String getChocolateName()
    {
  	  return cw.getName();
  	  
    }
    void setChocolateWeight(int b) 
    {
  	   cw.setWeight(b);
    }
    public int getChocolateWeight()
    {
  	  return cw.getWeight();
    }
    void setCandiesName(String a)
    {
  	  csw.setName(a);
    }
    String getCandiesName()
    {
  	  return csw.getName();
  	  
    }
    void setCandiesWeight(int b)
    {
  	  csw.setWeight(b);
    }
    int getCandiesWeight()
    {
  	  return csw.getWeight();
    }

}
