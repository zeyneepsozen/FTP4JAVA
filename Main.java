package com.company;

import it.sauronsoftware.ftp4j.*;
import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FTPClient client = new FTPClient();
        Menu menu = new Menu(client);
        Scanner scan = new Scanner(System.in);
        try {
            client.connect("ftp.host.com");
            client.login("username", "mypassword");
            client.setPassive(false);
            while (1) {
                menu.yazdir();
                int i = scan.nextInt();
                if (i == 10) break;
                else menu.islemler(i);
            }
            System.out.println("Operations terminated...");
            client.disconnect(true);
        }
         catch(Exception e){
                e.printStackTrace();
             }
        }
    }
