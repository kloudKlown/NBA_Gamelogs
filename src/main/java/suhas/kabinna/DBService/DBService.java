package suhas.kabinna.DBService;

import suhas.kabinna.DB.*;
import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Sorts;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Logger;

import org.bson.BsonDocument;
import org.bson.Document;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import org.bson.Document;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class DBService {
	
	static MongoClient mongoClient;
	static  Logger logger = Logger.getLogger(DBService.class.getName());
	
	public static MongoCollection<Document> DBCollection(){
		
		MongoCollection<Document> coll = null;
		try{
		String dbURI = "mongodb://SuhasKabinna:ilovepanda123@ds131890.mlab.com:31890/nba_game_logs";
		mongoClient = new MongoClient(new MongoClientURI(dbURI));		
    	MongoDatabase  db =  mongoClient.getDatabase( "nba_game_logs" );
    	coll = db.getCollection("NBA_Logs");
		}
		catch (Exception e) {
			logger.log(Level.SEVERE,"Connection ERROR: " , e);
			mongoClient.close();			
		}
		return coll;
	}
	
	public static ArrayList<MongoDB_NBA> createList(MongoCursor<Document> curMongo){
    	ArrayList<MongoDB_NBA> blogList= new ArrayList<MongoDB_NBA>();

    	while(curMongo.hasNext() ){
    			Document doc = curMongo.next();
    			Iterator<Entry<String, Object>> ite = doc.entrySet().iterator();
    			
    			
    			while(ite.hasNext()){
    			Map.Entry pair = ite.next();	
    			MongoDB_NBA na;

    			String H;
  			
					na = new MongoDB_NBA( ite.next().getValue().toString(),
							ite.next().getValue().toString(),
							Double.parseDouble(ite.next().getValue().toString()),
							ite.next().getValue().toString(),
							ite.next().getValue().toString(),
							ite.next().getValue().toString(),
							(H = ( ite.next().getValue().toString() == "@" )? "Away":"Home" ),
							ite.next().getValue().toString(),
							ite.next().getValue().toString(),
							ite.next().getValue().toString(),
							ite.next().getValue().toString(),
							Double.parseDouble(ite.next().getValue().toString()),
							Double.parseDouble(ite.next().getValue().toString()),
							Double.parseDouble(ite.next().getValue().toString()),
							Double.parseDouble(ite.next().getValue().toString()),
							Double.parseDouble(ite.next().getValue().toString()),
							Double.parseDouble(ite.next().getValue().toString()),
							Double.parseDouble(ite.next().getValue().toString()),
							Double.parseDouble(ite.next().getValue().toString()),
							Double.parseDouble(ite.next().getValue().toString()),
							Double.parseDouble(ite.next().getValue().toString()),
							Double.parseDouble(ite.next().getValue().toString()),
							Double.parseDouble(ite.next().getValue().toString()),
							Double.parseDouble(ite.next().getValue().toString()),
							Double.parseDouble(ite.next().getValue().toString()),
							Double.parseDouble(ite.next().getValue().toString()),
							Double.parseDouble(ite.next().getValue().toString()),
							Double.parseDouble(ite.next().getValue().toString())

							);
					
    			blogList.add(na);		
    			
    	        }
    	        
    	}    
    	
		if( blogList.isEmpty() ){
			blogList.add(new MongoDB_NBA());
		}
    	return blogList;
	}
	
	
	public static ArrayList<MongoDB_NBA> createNameList(MongoCursor<Document> curMongo){
		ArrayList<MongoDB_NBA> blogList= new ArrayList<MongoDB_NBA>();
		
		Set<String> set = new HashSet<String>();
		while(curMongo.hasNext() ){
			Document doc = curMongo.next();
			Iterator<Entry<String, Object>> ite = doc.entrySet().iterator();
			
			
			while(ite.hasNext()){
			Map.Entry pair = ite.next();	
			pair = ite.next();			
			set.add(pair.getValue().toString());
//			System.out.println(pair.getValue().toString());
			}
		}

		for( String s: set ){
			
			MongoDB_NBA na = new MongoDB_NBA();
			na.getPlayerNames(s);
			System.out.println(s);
			blogList.add(na); 
		}
		if( blogList.isEmpty() ){
			blogList.add(new MongoDB_NBA());
		}
		return blogList;
	}
	
	
//	public static ArrayList<MongoDB_NBA> getBlogData(){
//   
//    	ArrayList<String> ll = new ArrayList<String>(); 
//    	MongoCursor<Document> curMongo = DBCollection().find().iterator() ;
//    	ArrayList<MongoDB_NBA> blogList= createList(curMongo);
//    	mongoClient.close();
//    	return blogList;
//	}
//	
	
	public static ArrayList<MongoDB_NBA> getDataByName(String name){
		
		BasicDBObject whereQuery = new BasicDBObject();
		whereQuery.put("playerName",  name);		
		System.out.println(whereQuery);	
		MongoCursor<Document> curMongo = DBCollection().find(whereQuery).sort((Sorts.descending("Age"))).iterator();		
		ArrayList<MongoDB_NBA> blogList = createList(curMongo);
		mongoClient.close();
		return blogList;	
		
	}
	
	public static ArrayList<MongoDB_NBA> getDataByDate(String date){
		
		BasicDBObject whereQuery = new BasicDBObject();
		whereQuery.put("Date",  date);		
		System.out.println(whereQuery);	
		MongoCursor<Document> curMongo = DBCollection().find(whereQuery).iterator();		
		ArrayList<MongoDB_NBA> blogList = createList(curMongo);
		mongoClient.close();
		return blogList;	
		
	}
	
	
	public static ArrayList<MongoDB_NBA> getAllPlayerNames(){

		BasicDBObject whereQu = new BasicDBObject();
		BasicDBObject obj = new BasicDBObject();
		BasicDBObject obj2 = new BasicDBObject();

		obj2.put("playerName", 1);
		MongoCursor<Document> curMongo = DBCollection().find().projection(obj2).iterator();
		System.out.println(new BasicDBObject( new Document() ).append("playerName", 1) );
		ArrayList<MongoDB_NBA> blogList = createNameList(curMongo);
		mongoClient.close();
		return blogList;	
		
	}
	

}
