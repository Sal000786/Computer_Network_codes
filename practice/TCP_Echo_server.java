import java.util.*;
import java.io.*;
import java.net.*;
public class TCP_Echo_server{
    public static void main(String args[]) throws Exception{
        ServerSocket ss=new ServerSocket(6666);
        System.out.println("waiting for the Client");
        Socket s=ss.accept();
        System.out.println(" Client connected ");
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=" ",str2=" ";
        while(!str.equals("stop"))
        {
            str=din.readUTF();
            System.out.println("Client says: "+str);
            System.out.println("Enter msg to client ");
            str2=br.readLine();
            dout.writeUTF(str2);
            dout.flush();

        }
            din.close();
            s.close();
            ss.close();
    }
}