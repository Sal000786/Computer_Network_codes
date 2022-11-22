import java.util.*;
import java.net.*;
import java.io.*;
public class server{
    public static void main(String args[])throws Exception{
        ServerSocket ss=new ServerSocket(6666);
        System.out.println("Waiting for the client");
        Socket s=ss.accept();
        System.out.println("Connected Accepted");
        DataInputStream din=new DataInputStream(s.getInputStream());
        String str=(String)din.readUTF();
        System.out.println("Message from client is "+str);
        ss.close();
    }
}