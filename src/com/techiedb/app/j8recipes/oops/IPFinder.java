package com.techiedb.app.j8recipes.oops;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPFinder {
    private String mHost;
    private Scanner mInput;
    private InetAddress mAddress;
    public IPFinder(String inHost, Scanner input){
        this.mHost = inHost;
        this.mInput = input;
    }
    /**
     * Method printIPAddress() used to print the IP's Address for input-host, and input-scanner.
     */
    public void printIPAddress(){
        System.out.println("\n\n Enter your host name: ");
        this.mHost = mInput.next();
        try{
            mAddress = InetAddress.getByName(mHost);
            System.out.println("IP address: " + mAddress.toString());
        } catch (UnknownHostException e) {
            e.printStackTrace();
            System.out.println("Could not find " + mHost);
        }
    }
    /**
     * Print LocatHost's Address
     */
    public void printLocalAddress(){
        try{
            mAddress = InetAddress.getLocalHost();
            System.out.println(mAddress);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            System.out.println("Could not find");
        }
    }
}
