import java.net.*;
import java.io.*;
import java.util.*;

public class filter2 {
    public static void main(String[] args){
        // System.out.println(args[0]);
            String intuple = args[0];
            float k = Float.parseFloat(intuple.split("\\s+")[0]);
            int v = Integer.parseInt(intuple.split("\\s+")[1]);
            int k_out = (int)(k*10000);
            int v_out = v;
            String out_s = Integer.toString(k_out) + " " + Integer.toString(v_out);
            System.out.println(out_s);
    }
}
