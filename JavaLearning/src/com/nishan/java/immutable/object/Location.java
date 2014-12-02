package com.nishan.java.immutable.object;

public class Location {
	private int x;
	private int y;
	public Location(int x,int y) {
		this.x = x;
		this.y = y;
	}

	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public Location setX(int x){
		if(this.x == x)
			return this;
		return new Location(x,this.y);
	}
	public Location setY(int y){
		if(this.y == y)
			return this;
		return new Location(this.x,y);
	}

	@Override
	public String toString() {
		return "Location [x=" + x + ", y=" + y + "]";
	}
	
}
