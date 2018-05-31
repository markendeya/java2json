package com.app.Address;

public class Address {
	public String loc;
	public int addrid;
	public Address() {
		super();
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getAddrid() {
		return addrid;
	}
	public void setAddrid(int addrid) {
		this.addrid = addrid;
	}
	@Override
	public String toString() {
		return "Address [loc=" + loc + ", addrid=" + addrid + "]";
	}


}
