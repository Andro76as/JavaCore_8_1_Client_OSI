package ru.netology.AndreyS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) throws UnknownHostException {
        String host = "localhost";
        int port = 80;
        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            out.println("Netology.ru");
            String resp = in.readLine();
            System.out.println(resp);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
