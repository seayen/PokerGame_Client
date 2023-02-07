package Client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client{

	Socket socket;
	InputStream in;
	OutputStream out;
	
	public Client()
	{
		socket = null;
		in = null;
		out = null;
		
		setnet();
	}
	
	private void setnet()
	{
		try 
		{
			socket = new Socket("127.0.0.1",8888);
			in = socket.getInputStream();
			out = socket.getOutputStream();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void Main_Server()
	{
		
	}
	
	public void Login_Server()
	{
		
	}
	
	public void Channel_Server()
	{
		
	}
	
	public void Room_Server()
	{
		
	}

	
}
