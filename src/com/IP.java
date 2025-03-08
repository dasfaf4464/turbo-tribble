package com;

import document.JSON;

import java.net.URI;
import java.net.http.*;

public class IP {
    private final String getIP = "https://api.ip.pe.kr/json/";
    private final HttpClient client = HttpClient.newHttpClient();
    private String publicIP;
    private String privateIP;

    public IP() {
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(getIP)).GET().build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if(response.statusCode() == 200) {
                publicIP = new JSON(response.body()).getValue("ip");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getPublicIP() {
        return publicIP;
    }

    public String getPrivateIP() {
        return privateIP;
    }
}
