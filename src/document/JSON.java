package document;

import java.util.HashMap;
import java.util.Stack;

public class JSON {
    private final HashMap<String, String> body = new HashMap<>();

    public JSON(String jsonBody) {

    }

    public String getValue(String key) {
        return body.get(key);
    }

    public String getString() {
        StringBuilder sb = new StringBuilder();
        return null;
    }

    /**
     * parse to String array, needed to trans HashMap
     * @param jsonBody is original JSON data form HTTP/HTTPS API
     */
    private String[] parse(String jsonBody) {
        Stack<String> bodyStack = new Stack<>();
        for(int i = 0; i < jsonBody.length(); i++) {
            if(jsonBody.charAt(i) == '{' || jsonBody.charAt(i) == '[') {

            }
        }

        return null;
    }

}
