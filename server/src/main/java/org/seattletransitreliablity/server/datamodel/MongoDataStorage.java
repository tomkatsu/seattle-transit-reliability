package org.seattletransitreliablity.server.datamodel;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

public class MongoDataStorage implements DataStorage {
	
	private static final String DATA_STORE_NAME = "seattle-transit-reliability";
	
	private static Morphia morphia;
	private static Datastore datastore;
	
	public MongoDataStorage() {
		morphia = new Morphia();
		morphia.mapPackage("org.seattletransitreliability.server.datamodel");
		datastore = morphia.createDatastore(new MongoClient(), DATA_STORE_NAME);
		datastore.ensureIndexes();
	}

	@Override
	public void updateTrip(Trip trip) {
		// TODO Auto-generated method stub

	}

}
