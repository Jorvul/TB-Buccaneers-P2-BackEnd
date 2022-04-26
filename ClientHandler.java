package connection.bucs;

import java.util.List;

import io.javalin.http.Handler;

public class ClientHandler {
static DAO dao= new ClientPostgresDAO();
	
	public static Handler getAllClients = ctx->{
		List<Client> cList=dao.getAllClients();
		ctx.json(cList);
	};
}
