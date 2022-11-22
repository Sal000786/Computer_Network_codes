import java.util.*;
import java.io.*;
import java.net.*;
class Just_Connection_server
{
    public static void main(String args[]) throws Exception{
        ServerSocket ss=new ServerSocket(6666);
        System.out.println("Waiting for the client");
        Socket s=ss.accept();
        System.out.println(" client connected");
        DataInputStream din=new DataInputStream(s.getInputStream());
        String sal;
        sal=din.readUTF();
        System.out.println("message from client is "+sal);
        // din.flush();
        // s.close();

    }
}
