package com;

/**
 * 서버 컴퓨터에 대한 정보를 모니터링 합니다.
 */
public class ServerCom {
    private final String OS;

    public ServerCom() {
        this.OS = System.getProperty("os.name").toLowerCase();
        System.getProperties();
    }
}
