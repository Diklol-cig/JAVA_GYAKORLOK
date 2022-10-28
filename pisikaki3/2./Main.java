import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Kerem a szot: ");
        String line = sc.nextLine();

        System.out.println(StringUtils.switchAtKukac(line));
        sc.close();
    }
}