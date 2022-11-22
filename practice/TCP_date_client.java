import java.util.*;
import java.net.*;
import java.io.*;
public class TCP_date_client{
    public static void main(String args[]) throws Exception{
        Socket s=new Socket(InetAddress.getLocalHost(),6666);
        BufferedReader in=new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println(in.readLine());
    }
}