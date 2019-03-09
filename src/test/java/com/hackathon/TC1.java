package com.hackathon;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TC1 {
	
	private static final Logger logger = LoggerFactory.getLogger(TC1.class);
	

	@Test
	public void test() {
		
	  	  logger.info("this is a info message");
	      logger.warn("this is a warn message");
	      logger.error("this is a error message");
	      
		//fail("Not yet implemented");
	}

}
