package com;

import java.net.InetAddress;

public class Main {
    public static void main(String[] args) {
        System.out.println("Client d");
        InetAddress IP= null;
        try {
            IP = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println("IP of my system is := "+IP.getHostAddress());
        Dispatcher dispatcher = new Dispatcher();
        NIOSocketServer server = new NIOSocketServer(dispatcher);
        while(true){
            try
            {
                Thread.sleep(600000  );
            }
            catch( Exception e )
            {
                e.printStackTrace();
            }
        }

    }
}
