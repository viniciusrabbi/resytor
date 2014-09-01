/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd;

import java.net.*;
import java.io.*;

/**
 *
 * @author Ruan
 */
public class TCPServer {

    public static void main(String[] args) {
        try {
            int serverPort = 7896;
            DataInputStream in;
            DataOutputStream out;
            ServerSocket listenSocket = new ServerSocket(serverPort);
            while (true) {
                Socket clientSocket = listenSocket.accept();
                in = new DataInputStream(clientSocket.getInputStream());
                out = new DataOutputStream(clientSocket.getOutputStream());
                String data = in.readUTF(); // Recebe a mensagem
                
                //O método .toUpperCase() converte todas as letras da String para maiúcula. No caso do Projeto Resytor,
                // devemos substituir "data.toUpperCase()" pelo método interpretador.
                data = data.toUpperCase();
                
                out.writeUTF(data);// Envia a Resposta
            }//while
        }catch (IOException e){
            System.out.println("Erro: " + e.getMessage( ));
        }

    }//main( )
}
