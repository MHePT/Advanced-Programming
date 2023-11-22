package NotWorking;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientHandler implements Runnable{
    
    public static ArrayList<ClientHandler> clients = new ArrayList<>();
    private static int counter;
    private Socket socket;
    private ObjectInputStream input;
    private ObjectOutputStream output;
    private String username;
    String Message_From_Client  = "";

    public ClientHandler(Socket socket) {
        try {
            this.socket = socket;
            output = new ObjectOutputStream(socket.getOutputStream());
            input = new ObjectInputStream(socket.getInputStream());
            username = "User " + ++counter;
            clients.add(this);
            System.out.println(username+" Entered Game");;
        } catch (IOException ex) {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    public void run() {
                
        while(socket.isConnected()){
            try {
                Message_From_Client = (String) input.readObject();
                BroadcastMessage(Message_From_Client);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        
    }
    
    public void BroadcastMessage(String Message){
        
        for(ClientHandler cl:clients){
           try{
               if(cl.username!=username)
                   cl.output.writeObject(Message);
           }catch(Exception err){
               System.out.println(err.getMessage());
           }
        }
        
    }
    
}
