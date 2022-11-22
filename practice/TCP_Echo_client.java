import java.util.*;
import java.io.*;
import java.net.*;
public class TCP_Echo_client{
    public static void main(String args[]) throws Exception{
        Socket s=new Socket("127.0.0.1",6666);
        System.out.println("server connected");
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=" ",str2=" ";
        while(!str.equals("stop")){
            System.out.println("Enter msg to server ");
            str=br.readLine();
            dout.writeUTF(str);
            dout.flush();
            str2=din.readUTF();
            System.out.println("Server says "+str2);

        }
            dout.close();
            s.close();

    }
}