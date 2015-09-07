package org.seattletransitreliablity.server.datamodel;

import java.util.Date;

public interface Trip {
	
	public enum Direction {INBOUND, OUTBOUND};
	
	public String getId();
	public Direction getDirection();
	public int getDelayInMins();
	public double getLatitude();
	public double getLongitude();
	public Date getTime();
}
