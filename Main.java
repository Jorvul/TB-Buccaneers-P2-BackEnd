package connection.bucs;


import io.javalin.Javalin;

public class Main {
	public static void main(String[] args) {
		Javalin app = Javalin.create().start();
		
		app.get("/clients", ClientHandler.getAllClients);
		}
	}	
	    

