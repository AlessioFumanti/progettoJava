/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gestionesoket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Server {

    public static void main(String[] args) {

           int port = 2000;
           int time = 5000;
           
           Socket socket= null;
        try {

            //1 server in ascolto in una porta
            ServerSocket serverSocket=new ServerSocket(port);
            System.out.println("Server Avviato");
            //2 server in attesa della connessione
            socket =serverSocket.accept();
            System.out.println("Connessione avvenuta tra client e "+ socket.getRemoteSocketAddress());

        } catch (IOException ex) {
            System.err.println("Errore nell'avvio del servizio o nella creazione del server");
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
                    //3 scambio dati
            //BufferedWriter
                    socket.getOutputStream();
                    BufferedReader br = new BuffeReader(new InputStreamReader(socket.getInputStream()));
                socket.getInputStream();
        //4 chiusura socket
       finally
        {
            try
            {
                if(socket!=null) 
                    socket.close();
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private static void getOutputStream() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    // con gli steram di scambiano i dati - 
    
