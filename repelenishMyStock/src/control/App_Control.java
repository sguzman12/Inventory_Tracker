package control;

import view.Gui;

//Author: Sigfredo Guzman Jr.
//Date: 1/31/2019
//Project Name: replenishMyStock
//Purpose: CRUD project. Inventory tracking system that connects to a MySQL database. Allows for
//Add, Delete, and Update option. User must sign in to be allowed access to database.

/**
 * Control class. Calls classes in the View package and Model classes. Acts as the go-between.
 * Begins the program.
 *
 */
public class App_Control {
	
	//Reference Objects
	Gui view;
	
	

	/**
	 * Default Constructor
	 */
	public App_Control() {
		view = new Gui();
	}
	
	/**
	 * Called from the Main class to begin the App. Calls the View class to start.
	 */
	public void start() {
		
	}
}
