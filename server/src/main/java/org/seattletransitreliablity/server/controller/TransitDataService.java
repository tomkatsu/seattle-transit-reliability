package org.seattletransitreliablity.server.controller;

import java.util.List;

import org.seattletransitreliablity.server.datamodel.Trip;

public interface TransitDataService {
	public List<Trip> getAllActiveTripsForRoute(String routeId);
}
