import java.net.*;
import java.io.*;

public class SlidingSender {
    public static void main(String a[]) throws Exception {
        ServerSocket ser = new ServerSocket(10);
        Socket s = ser.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String sndbuff[] = new String[8];
        PrintStream p;
        int pt = 0, win = 8, nf, fno, i;
        String ch;
        do {
            p = new PrintStream(s.getOutputStream());
            System.out.println("Enter the no. of frames : ");
            nf = Integer.parseInt(in.readLine());
            p.println(nf);
            if (nf <= win) {

                System.out.println("Enter " + nf + " Messages to be send\n");
                for (i = 1; i <= nf; i++) {
                    sndbuff[pt] = in.readLine();
                    p.println(sndbuff[pt]);
                    pt = ++pt % 8;
                }
                System.out.print("Acknowledgment received");
                fno = Integer.parseInt(in1.readLine());
                System.out.println(" for " + fno + " frames");
            }

            else {
                System.out.println("The no. of frames exceeds window size ");
                break;
            }
            System.out.print("\nDo you wants to send some more frames : ");
            ch = in.readLine();
            p.println(ch);
        } while (ch.equals("yes"));
        s.close();
    }
}