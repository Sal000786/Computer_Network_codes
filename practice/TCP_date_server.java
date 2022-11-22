import java.net.*;
import java.io.*;
import java.util.*;
public class TCP_date_server{
    public static void main(String args[])throws Exception{
        ServerSocket ss=new ServerSocket(6666);
        while(true)
        {
            System.out.println("Waiting for the client");
            Socket s=ss.accept();
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeBytes("ServerDate "+(new Date()).toString()+"\n");
            dout.close();
            // ss.close();

        }
    }
}