/* File: CabbagServer.java
 * Author: Himanshu Khullar & Chirag Kachariya
 * Date: November, 2017
 * Description:This class is the main server to which all the clients will be connected
 * Professor Stanley Pieda
 */

package server;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class CabbageServer {



	/**
	 * Main method for the server
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {



		LocalDateTime dateTime = LocalDateTime.now();                                    //current date
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yyyy hh:mm a");

		System.out.print("CabbageServer by Chirag Kachariya Himanshu Khullar  run on " + dateTime.format(format));
		System.out.println("\nListening to connections") ;              
		ServerSocket ss = new ServerSocket(9999) ;                            // same port number what we have defined in the client class

		Socket s = ss.accept() ;                                             //if the server socket is getting any request , it will create  a socket
		System.out.println("got a connection");                                //once the request is excepted
		BufferedReader br = 	new BufferedReader(new InputStreamReader(s.getInputStream())) ;

		
		String str = br.readLine() ;
		s.close();                                                         //for closing the connection


	}//end main 




}
