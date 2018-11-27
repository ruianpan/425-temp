import java.net.*;
import java.io.*;
import java.util.*;

public class filter2 {
    public static void main(String[] args){
        try {
            System.out.println("begin filtering");
            InetAddress from = InetAddress.getByName(args[0]);
            int localport = Integer.parseInt(args[1]);
            InetAddress to = InetAddress.getByName(args[2]);
            int toport = Integer.parseInt(args[3]);
            ServerSocket fromsock = new ServerSocket(localport);
            Socket tosock = new Socket(to, toport);
            while(true){
                Socket ClientSocket = fromsock.accept();
                InputStream in = ClientSocket.getInputStream();
                DataInputStream clientData = new DataInputStream(in);
                String intuple = clientData.readUTF();

                float k = Float.parseFloat(intuple.split("\\s+")[0]);
                int v = Integer.parseInt(intuple.split("\\s+")[1]);

                System.out.println(k + ", " + v);
                int k_out = k-1;
                int v_out = v+5;
                String out_s = Integer.toString(k_out) + " " + Integer.toString(v_out);

                OutputStream os = tosock.getOutputStream();
                DataOutputStream out = new DataOutputStream(os);
                out.writeUTF(out_s);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
