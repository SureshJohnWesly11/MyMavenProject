package com.maven.maven_project;

class Candies implements Gift{
	private String name;
	private int weight;
	Candies()
	{
		name = "";
		weight=0;
	}
	Candies(String a,int b)
	{
		this.name=a;
		this.weight=b;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public int getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}
	public void setName(String a) {
		// TODO Auto-generated method stub
		name=a;	
	}
	public void setWeight(int i) {
		// TODO Auto-generated method stub
		weight=i;	
	}
}
