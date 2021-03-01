package com.learn.Builder;

public interface Builder {
	public void reset();
	public void setSeat(int seat);
	public void setEngine(String engine);
	public void setGPS(Boolean gps);
}
