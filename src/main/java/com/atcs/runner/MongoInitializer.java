package com.atcs.runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoInitializer {
	private static final Logger logger = LogManager.getLogger(MongoInitializer.class);

	private static MongoDatabase instance = null;

	protected MongoInitializer() {
		// To prevent instantiation.
	}

	public static MongoDatabase getInstance() {
		if (instance == null) {
			instance = getDatabaseInstance();
		}
		return instance;

	}

	private static MongoDatabase getDatabaseInstance() {
		MongoDatabase db = null;
		MongoClient mongoClient = null;
		try {
			mongoClient = new MongoClient("localhost", 27017);
			db = mongoClient.getDatabase("atcs_database");
		} catch (Exception e) {
			logger.error("Failed to initialize database connection " + e.getMessage(), e);
		} finally {
			if (mongoClient != null) {
				mongoClient.close();
			}
		}
		return db;
	}

}
