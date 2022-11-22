import java.util.*;
import java.io.*;
import java.net.*;
public class Just_Connection_client{
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        Socket s=new Socket("127.0.0.1",6666);
        System.out.println("client connected");
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        String sal;
        System.out.println("Enter message ");

        sal=sc.nextLine();
        dout.writeUTF(sal);
        dout.flush();
        dout.close();
        s.close();


    }
}