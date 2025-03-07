package com;

import java.net.URI;
import java.net.http.*;

public class IP {
    private final String getIP = "https://api.ip.pe.kr/json/";
    private final HttpClient client = HttpClient.newHttpClient();

    public IP() {
        getPublicIP();
    }

    public void getPublicIP() {
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(getIP)).GET().build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("" + response.statusCode());
            System.out.println("" + response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
