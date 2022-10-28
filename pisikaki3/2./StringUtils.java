public class StringUtils {
    public static String switchAtKukac(String s){
        String result = "";
        System.out.println("Szó: "  + s);

        if (s.contains("@")){
            int kukac = s.indexOf("@");

            result = s.substring(kukac) + s.substring(0, kukac);
            System.out.println("String hossza: " + result.length());
            System.out.print("Új String: ");
            return result;
        }
        else{
            System.out.println("String hossza: " + result.length());
            System.out.print("Új String: ");
            return result;
        }
    }
    
}
