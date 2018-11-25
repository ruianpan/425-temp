package com.company;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class filter {
    public void main(String[] args){
        try {

            InetAddress from = InetAddress.getByName(args[0]);
            int localport = Integer.parseInt(args[1]);
            InetAddress to = InetAddress.getByName(args[2]);
            int toport = Integer.parseInt(args[3]);
            ServerSocket fromsock = new ServerSocket(localport);
            Socket tosock = new Socket(to, toport);
            while(true){

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
