import java.io.*;
import java.net.*;
public class EchoServer{

	public static void main(String[] args) throws Exception
	{ 
	
	ServerSocket ss=new ServerSocket(3333);  
        Socket s=ss.accept();

        BufferedReader r = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter w = new PrintWriter(s.getOutputStream(), true);
	w.println("Welcome to Echo Server Enter Any Word to convert to Uppercase ");
	String line = "";
	
	do
        {
            line = r.readLine();
            if ( line != null)
            {	
                w.println("After Converting : "+ line.toUpperCase());
                }
        }
        while ( !line.trim().equals("bye") );
        s.close();
	
}    

}
