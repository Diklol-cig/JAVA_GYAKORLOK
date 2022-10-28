public class MyMath {
    public static Boolean isArmstrong(int n){
        String num = String.valueOf(n);

        char[] digits = num.toCharArray();


        int x = Character.getNumericValue(digits[0]);
        int y = Character.getNumericValue(digits[1]);
        int z = Character.getNumericValue(digits[2]);

        System.out.println(x + " " + y + " " + z);

        if ((z*z*z) + (x*x*x) + (y*y*y) == n){
            return true;
        }
        else{
            return false;
        }
    }
}
