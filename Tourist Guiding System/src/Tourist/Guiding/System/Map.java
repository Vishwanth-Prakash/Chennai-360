package Tourist.Guiding.System;

public class Map {
    Map(String url) {
        try {
            Runtime runtime = Runtime.getRuntime();
            runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
