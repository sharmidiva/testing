package Log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jdemo {
	static Logger logger= LogManager.getLogger(log4jdemo.class);
	public static void main(String args[]) {
		System.out.println("\n Hello World\n");
		logger.trace("this is trace message");
		logger.info("This is information message");
		logger.warn("This is warn message");
		logger.error("This is error message");
		logger.fatal("This is fatal message");
		System.out.println("\n completed\n");
	}

}
