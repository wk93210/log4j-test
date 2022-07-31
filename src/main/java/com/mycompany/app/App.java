package com.mycompany.app;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.message.ObjectArrayMessage;

import java.util.concurrent.TimeUnit;

/**
 * App
 */
public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
	while (true) {
	    logger.info(
	        new ObjectArrayMessage(
                    "749221fcb2a9e6effcc8770cae329cc2315c9f9745f5a3d9ab526771560e9627", 
		    "PURCHASE",
	            "1659220870",
		    "53"
	        )
	    );
	    try {
	        TimeUnit.MILLISECONDS.sleep(10);
	    } catch (java.lang.InterruptedException e) {
	        System.out.println("Failed to sleep...");
	    }
	}
    }
}
