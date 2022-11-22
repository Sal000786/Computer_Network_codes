import java.util.*;
import java.io.*;
import java.net.*;

public class Queue_sender {
    public static void main(String args[])throws Exception{
        
        ServerSocket ss=new ServerSocket(6666);
        Socket s=ss.accept();
            System.out.println("Connected");
            BufferedReader din
= new BufferedReader(new InputStreamReader(System.in));
           PrintStream p=new PrintStream(s.getOutputStream()); 
            System.out.print("Enter queue size: ");
            int size;
            size=Integer.parseInt(din.readLine());
            p.println(size);
            String sbuff[]=new String[10];
            System.out.println("Enter the message queue: ");
            for(int i=0;i<size;i++)
               {
           sbuff[i]=din.readLine();
        p.println(sbuff[i]);
        }
        System.out.println("Message queue sent successfully");
    s.close();
    }
}