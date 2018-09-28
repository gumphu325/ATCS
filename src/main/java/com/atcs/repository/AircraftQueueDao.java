//package com.atcs.repository;
//
//import java.util.List;
//
//import org.bson.BsonDocument;
//import org.bson.Document;
//import org.bson.codecs.configuration.CodecRegistry;
//import org.bson.conversions.Bson;
//import org.springframework.data.mongodb.core.MongoOperations;
//import org.springframework.data.mongodb.core.query.Query;
//
//import com.atcs.data.AircraftQueue;
//import com.atcs.runner.MongoInitializer;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
//import com.mongodb.client.model.Filters;
//
//@org.springframework.stereotype.Repository
//public class AircraftQueueDao implements Repository {
//
//	private MongoDatabase databaseInst = null;
//
//	public AircraftQueueDao() {
//		databaseInst = MongoInitializer.getInstance();
//	}
//
//	@Override
//	public <T> void create(T aircraftQueue) {
//		MongoCollection<AircraftQueue> queueCol = databaseInst.getCollection("AIRCRAFT_QUEUE", AircraftQueue.class);
//		queueCol.insertOne((AircraftQueue) aircraftQueue);
//	}
//
//	@Override
//	public void delete(Long aircraftId) {
//		databaseInst.getCollection("AIRCRAFT_QUEUE", AircraftQueue.class).findOneAndDelete(Filters.eq("id", json.containsKey("_id")?json.get("_id"):json.get("id")))
//
//	}
//
//	@Override
//	public <T> void update(T entity) {
//	}
//
//	@Override
//	public <T> List<T> readAll(Class<T> entity) {
//		MongoOperations mongoOperations = DatabaseUtils.getInstance();
//		return mongoOperations.findAll(entity);
//	}
//
//	@Override
//	public <T> void deleteAll(T entity) {
//	}
//
//	@Override
//	public <T> T read(Query query, Class<T> entityClass) {
//		MongoOperations mongoOperations = DatabaseUtils.getInstance();
//		return (T) mongoOperations.find(query, entityClass);
//	}
//
//	@Override
//	public <T> List<T> readAll(Class<T> entity) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public <T> T read(Query query, Class<T> entityClass) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void delete(String key) {
//		// TODO Auto-generated method stub
//		
//	}