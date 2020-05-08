package theater.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnUtils {
	  
	  public static Connection getOracleConnection()
	         throws ClassNotFoundException, SQLException {
	        
	      // Achtung: Den Verbindungsparameter anpassen.
		  //Bei uns DKE hostname und sid
	      String hostName = "140.78.58.1";
	      String sid = "lehre";
	      
	      //richtige Anmeldedaten verwenden (DKE Anmeldung!)
	      String userName = "mytest";
	      String password = "12345";
	  
	       return getOracleConnection(hostName, sid, userName, password);
	   }
	  
	   public static Connection getOracleConnection(String hostName, String sid,
	           String userName, String password) throws ClassNotFoundException,
	           SQLException {
	   
	       Class.forName("oracle.jdbc.driver.OracleDriver");
	  
	       // Die Struktur URL Connection für Oracle
	       // Zum Beispiel:
	       // jdbc:oracle:thin:@localhost:1521:db11g
	       // jdbc:oracle:thin:@//HOSTNAME:PORT/SERVICENAME
	       String connectionURL = "jdbc:oracle:thin:@" + hostName + ":1521:" + sid;
	  
	       Connection conn = DriverManager.getConnection(connectionURL, userName,
	               password);
	       return conn;
	 
	   }
	  
}

