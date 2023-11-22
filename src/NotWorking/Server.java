package NotWorking;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server{
    
    static ServerSocket server;

    private Server() {
    }    
    
    public static void run(){
        
        try {
            server = new ServerSocket(9001);
            
            Socket client = server.accept();
            
            ClientHandler handler = new ClientHandler(client);
            
            while(!server.isClosed()){
               ( new Thread( handler ) ).start();
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void close(){
        try {
            server.close();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
