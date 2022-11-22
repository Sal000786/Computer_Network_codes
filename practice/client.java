import java.util.*;
import java.net.*;
import java.io.*;
public class client{
    public static void main(String args[])throws Exception{
    Scanner sc=new Scanner(System.in);
        Socket s=new Socket("127.0.0.1",6666);
        System.out.println("Connected");
        String sal="salman";
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        System.out.println("Enter the message ");
        sal=sc.nextLine();
        dout.writeUTF(sal);
        dout.flush();
        dout.close();

        s.close();
        
    }
}