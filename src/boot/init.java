package boot;

import com.IP;

/**
 * 서버가 시작될 때 필요한 시스템을 초기화 합니다.
 */
public class init {
    public static void main (String[] args) {
        System.out.println("boot server...");
        IP ip = new IP();
    }
}