/* File: CabbageClient.java
 * Author: Himanshu Khullar & Chirag Kachariya
 * Date: November, 2017
 * Description:This class has the code for the client which will be connected to the server
 * Professor Stanley Pieda
 */

package client;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.UUID;
import javax.sound.sampled.Line;
import dataaccesslayer.CabbageDaoImpl;
import datatransfer.Cabbage;


public class CabbageClient {

	/**
	 * 
	 * Main method for the client
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {

		String finalInput = "null" ;                             //yes or no
		Scanner yesno = new Scanner(System.in) ;

		String ip = "localhost" ;
		int port = 9999 ;                                        //0 to 1023(reserved port numbers)   to 65535



		Socket s  = new Socket(ip ,  port) ;	             // to connect (ip address and port number)

		OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream()) ;

		//prompting the values 
		Cabbage cabbage = new Cabbage() ;
		Scanner input = new Scanner(System.in) ;             // getting the input


		/*
		 * for getting the input of the cabbages
		 */
		do {

			System.out.println("Enter data for new Cabbage");


			System.out.print("Please enter alpha : ");       
			String alpha = input.nextLine() ;               //getting the input for the alpha
			System.out.print("Please enter beta : ");       //getting the input for beta
			String beta = input.nextLine() ;
			System.out.print("Please enter charlie : ");    //getting the input for charlie
			String charlie = input.nextLine() ;
			System.out.print("Please enter delta : ");      // getting the input for delta
			String delta = input.nextLine() ;
			System.out.print("Please enter line number : ");// getting the input  for line number
			int lineNumber  = input.nextInt() ;
			UUID idOne = UUID.randomUUID();                   //giving random UUID
			String uuid = idOne.toString() ;



			cabbage.setLineNumber(lineNumber);
			cabbage.setAlpha(alpha);
			cabbage.setBeta(beta);
			cabbage.setCharlie(charlie);
			cabbage.setDelta(delta); 
			cabbage.setUUID(uuid);

			System.out.println(cabbage.toString()) ;

			CabbageDaoImpl cabbageDaoimp  = new CabbageDaoImpl() ;
			cabbageDaoimp.insertCabbage(cabbage);
			cabbageDaoimp.getCabbageByUUID("d92c20a1-4108-420a-a081-b1eafe85f835") ;

			System.out.println("do you want to insert another cabbage (y or n)");
			finalInput = yesno.nextLine() ;
			System.out.println(finalInput);

		} while(finalInput.equals("y")) ;                       // loop for  continuing the program if entered 'y'


		System.out.println("shutting down the connection to the server");


		os.close();                                             //closing the connection


	}//end main 




}
