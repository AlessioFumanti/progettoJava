/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionesoket;

import com.mycompany.gestionesoket.Client.ConnectExeption;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {
    
    
    public static void main(String[] args) {
        int port = 2000;
        Socket socket=null;
        try {
            // richiesta di connessione al server
            socket=new Socket("127.0.0.1",port);
            System.out.println("Client connesso con "+ socket.getRemoteSocketAddress());
            System.out.println("Porta del client "+ socket.getLocalPort());
        } 
                    
          catch(ConnectExeption ex)
                  {
                    System.err.print("server non disponibile");
                  }
          
        
        catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
    
