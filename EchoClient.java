import java.io.*;
import java.net.*;
public class EchoClient{

	public static void main(String[] args) throws Exception
	{ 
	
	Socket s = new Socket("127.0.0.1", 3333);

        BufferedReader r = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter w = new PrintWriter(s.getOutputStream(), true);
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	String line = "";
	
	String servermsg;
	do
	{   
		servermsg= r.readLine();
		if ( servermsg != null ){
			System.out.println(servermsg);}
		line = input.readLine();
		w.println(line);
	}
	while ( !line.trim().equals("bye") );
	
}    

}
