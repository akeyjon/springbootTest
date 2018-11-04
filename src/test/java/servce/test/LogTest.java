package servce.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class LogTest {

	private static Log log = LogFactory.getLog(LogTest.class);
	
	public static void main(String[] args) {
		log.info( "大量");
		log.error("错误");
	}
}
