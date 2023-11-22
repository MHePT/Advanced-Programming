package NotWorking;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {

    Socket socket;
    private ObjectInputStream input;
    private ObjectOutputStream output;
    private String Message;

    public Client() {

        try {
            socket = new Socket("localhost", 9001);
            output = new ObjectOutputStream(socket.getOutputStream());
            input = new ObjectInputStream(socket.getInputStream());
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Send_Message(String Message) {

        try {
            output.writeObject(Message);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String Listen_Messages() {

        while (socket.isConnected()) {

            try {
                return (String) input.readObject();
            } catch (Exception err) {
                System.out.println(err.getMessage());
            }
        }
        
        return "";
    }

}
