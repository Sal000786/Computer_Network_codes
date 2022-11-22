import java.util.*;
import java.net.*;
import java.io.*;
public class UDP_client{
    public static void main(String args[]) throws Exception{
        try{
        DatagramSocket ds1=new DatagramSocket();
        InetAddress ip=InetAddress.getByName("127.0.0.1");
        byte[] sd=new byte[1024];
        String msg="heloo server this is udp client";
        sd=msg.getBytes();
        DatagramPacket pkt=new DatagramPacket(sd,sd.length,ip,8000);
        ds1.send(pkt);
        ds1.close();
         System.out.println("done");
        }
         catch(IOException e){System.out.println(e);}
    }
}