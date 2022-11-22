import java.util.*;
import java.io.*;
import java.net.*;
public class Queue_receiver{
public static void main(String args[])throws Exception
{
    Socket s=new Socket(InetAddress.getLocalHost(),6666);
    System.out.println("Connected");
    BufferedReader din
= new BufferedReader(new InputStreamReader(s.getInputStream()));
int size;
String rbuff[]=new String[8];
size=Integer.parseInt(din.readLine());
for(int i=0;i<size;i++)
{

rbuff[i]=din.readLine();
System.out.println("The received message is : "+rbuff[i]);
}
}
}