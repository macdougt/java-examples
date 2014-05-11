package com.ibm.javaPkg.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SampleContextListener implements ServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// some startup code
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// some shutdown code
	}

}
