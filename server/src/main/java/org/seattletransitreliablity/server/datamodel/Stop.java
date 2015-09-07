package org.seattletransitreliablity.server.datamodel;

import java.util.List;

public interface Stop {
	
	public double getLatitude();
	public double getLongitude();
	public String getId();
	public String getName();
	public List<Route> getRoutes();
}
