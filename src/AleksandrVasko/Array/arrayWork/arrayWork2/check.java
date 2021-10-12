package AleksandrVasko.Array.arrayWork.arrayWork2;

/**
 * The type Check.
 */
public class check {
    /**
     * Check protocol string.
     *
     * @param url the url
     * @return the string
     */
    public static String checkProtocol(String url) {
        int a = url.indexOf(":");
        if (a == 5)
            return "https";
        else if (a == 4)
            return "http";
        else
            return "неизвестен";


    }

    /**
     * Check domain string.
     *
     * @param url the url
     * @return the string
     */
    public static String checkDomain(String url) {
        int a = url.indexOf('.');
        String s = url.substring(a +1, url.length());

        if (s.equals("ru") )
           return "ru";
           else if (s.equals("org") )
                return"org";
            else if (s.equals("com") )
                return "com";
            else
                return "неизвестен";



    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String[] urls = new String[]{"htt://javarush.ru", "http://wikipedia.org", "https://google.co"};
        for (int i = 0; i < urls.length; i++) {
            checkProtocol(urls[i]);
            checkDomain(urls[i]);
            System.out.println("Y URL - адреса - " + urls[i] + ", сетевой протокол - " + checkProtocol(urls[i]) + ", домен - " + checkDomain(urls[i]));
        }
    }
}
