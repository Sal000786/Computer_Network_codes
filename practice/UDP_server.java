// // import java.util.*;
// // import java.net.*;
// // import java.io.*;
// // public class UDP_server{
// //     public static void main(String args[]) throws Exception{
// //         DatagramSocket ss=new DatagramSocket(6666);
// //         byte[] rd=new byte[1024];
// //         DatagramPacket x=new DatagramPacket(rd,rd.length);
// //         System.out.println("done");
// //         ss.receive(x);
// //         InetAddress ip=x.getAddress();
// //         String msg=new String(rd,0,rd.length);
// //         System.out.println("Cleint="+msg);
// //         System.out.println("Cleint ip="+ip);

// //     }
// // }





import java.util.*;
import java.io.*;
// import java.net.*;

// public class UDP_server
// {
//     public static void main(String args[]) throws Exception 
//     {    try{
//             DatagramSocket ds=new DatagramSocket(8000);
//             byte[] rd=new byte[1024];
//             DatagramPacket rp=new DatagramPacket(rd,rd.length);
//             ds.receive(rp);
//             InetAddress ip=rp.getAddress();
//             String msg=new String(rd,0,rd.length);
//             System.out.println("client : "+msg);
//             System.out.println("client ip: "+ip);
//     }
//     catch(IOException e){System.out.println(e);}
//     }
// }
import java.net.*;

public class UDP_server
{
    public static void main(String args[]) throws Exception 
    {
         try
         {
            DatagramSocket ds=new DatagramSocket(8000);
            byte[] rd=new byte[1024];
            DatagramPacket rp=new DatagramPacket(rd,rd.length);
            ds.receive(rp);
            InetAddress ip=rp.getAddress();
            String msg=new String(rd,0,rd.length);
            System.out.println("client : "+msg);
            System.out.println("client ip: "+ip);

            
        } 
        catch(IOException e ){System.out.println(e);}
}
}