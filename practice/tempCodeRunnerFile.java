
        DatagramPacket pkt=new DatagramPacket(sd,sd.length,ip,8000);
        ds1.send(pkt);
        ds1.close();
         System.out.println("done");
        }
         catch(IOException e){System.out.println(e);}
    }
}