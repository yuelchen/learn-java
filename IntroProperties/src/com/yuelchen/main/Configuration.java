package com.yuelchen.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

/**
 * Configuration is a class with main method for demonstrating on using Java Properties that is 
 * a part of Java API Library. 
 * 
 * @author 	yuelchen
 * @version 1.0.0
 * @since 	2020-08-28
 */
public class Configuration {
	
	/**
	 * The default application properties file within project.
	 */
	private static final String propertiesLocation = "./conf/application.properties";
	
	//====================================================================================================
	
	/**
	 * The main method. 
	 * 
	 * @param args					an array of Strings as main method arguments.
	 */
	public static void main(String[] args) {
		System.out.println("Start of main method of IntroProperties!");
		
		//print current working directory
		printWorkingDirectory();
		
		//retrieve application.properties file
		File propertiesFile = new File(propertiesLocation);
		
		//get properties object with loaded properties
		Properties properties = loadPropertiesFile(propertiesFile);
		
		//remove a property with name 'maxThreadCount' if exists
		removeProperty(properties, "maxThreadCount");
				
		//add some properties	
		addProperty(properties, "hello", "world");
		addProperty(properties, "runtimeDate", new Date().toString());
		
		//write properties file with properties object
		if(updatePropertiesFile(properties, propertiesFile)) {
			System.out.println(String.format("Successfully overwrote properties file at location '%s' "
					+ "with '%s' properties", propertiesLocation, properties.size()));
		} else {
			System.out.println(String.format("Failed to overwrite properties file at location '%s' "
					+ "with '%s' properties", propertiesLocation, properties.size()));
		}

		System.out.println("End of main method of IntroProperties!");
	}
	
	//====================================================================================================
	
	/**
	 * Prints the current working directory during application runtime.
	 */
	private static void printWorkingDirectory() {
		try {
			String workingDirectory = new File(".").getCanonicalPath();
			System.out.println(String.format("PWD: %s", workingDirectory));
		} catch(IOException e) {
			System.out.println("Unable to get current working directory path.");
		}		
	}
	
	//====================================================================================================
	
	/**
	 * Returns properties object from given file object if retrieved.
	 * 
	 * @param propertiesFile		the properties file object. 
	 * 
	 * @return						properties object.
	 */
	private static Properties loadPropertiesFile(File propertiesFile) {
		
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(propertiesFile));
			System.out.println(String.format("Successfully loaded '%s' properties from file '%s'", 
					properties.size(), propertiesFile));
			
		} catch(FileNotFoundException e) {
			System.out.println(String.format("Unable to retrieve properties from file '%s' "
					+ "due to FileNotFoundException with message '%s'; caused by '%s'", 
					propertiesFile, e.getMessage(), e.getCause().toString()));
			
		} catch(IOException e) {
			System.out.println(String.format("Unable to retrieve properties from file '%s' "
					+ "due to IOException with message '%s'; caused by '%s'", 
					propertiesFile, e.getMessage(), e.getCause().toString()));
		}		

		return properties;			
	}
	
	//====================================================================================================
	
	/**
	 * Removes property with given name from properties if exists. 
	 * 
	 * @param properties			the properties object. 
	 * @param name					the name of property to be removed if exists. 
	 */
	private static void removeProperty(Properties properties, String name) {
		if(properties.containsKey(name)) {
			int oldSize = properties.size();
			properties.remove(name);
			System.out.println(String.format("Successfully removed property with name '%s', "
					+ "from size of %d' to '%d'", name, oldSize, properties.size()));
		} else {
			System.out.println(String.format("Property with name '%s' does not exist, "
					+ "same size '%d'", name, properties.size()));
		}
	}
	
	//====================================================================================================
	
	/**
	 * Adds a property to properties object with given name and value. 
	 * 
	 * @param properties			the properties object.
	 * @param name					the property name to be added.
	 * @param value					the property value to be added. 
	 */
	private static void addProperty(Properties properties, String name, String value) {
		int oldSize = properties.size();
		properties.setProperty(name, value);
		System.out.println(String.format("Successfully added property with name '%s', from size of "
				+ "%d' to '%d'", name, oldSize, properties.size()));
	}
	
	//====================================================================================================
	
	/**
	 * Streams properties in properties object to given properties file. 
	 * 
	 * @param properties			the properties object.
	 * @param propertiesFile		the properties file to be written to.
	 * 
	 * @return						boolean representation of whether or not 
	 * 								properties were successfully written to 
	 * 								properties file.
	 */
	private static boolean updatePropertiesFile(Properties properties, File propertiesFile) {
		try {
			FileWriter fileWriter = new FileWriter(propertiesFile);
			properties.store(fileWriter, null);
			fileWriter.close();			
			return true;
			
		} catch (IOException e) {
			System.out.println(String.format("Unable to store properties to file '%s' "
					+ "due to IOException with message '%s'; caused by '%s'", 
					propertiesFile, e.getMessage(), e.getCause().toString()));
			return false;
		}		
	}
}