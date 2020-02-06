package com.maven.maven_project;

class Sweet implements Gift{
	private String name;
	private int weight;
	Sweet()
	{
		name = "";
		weight=0;
	}
	Sweet(String a,int b)
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
