public class MyMath{
    public static boolean isRightTriangle(int a, int b, int c){
        if ((a*a) + (b*b) == (c*c)){
            return true;
        }
        return false;
    }
}