import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy szöveget: ");
        String line1 = sc.nextLine();

        System.out.println(line1);

        //String line2 = new String(line1);

        if (line1.contains("good") && line1.contains("bad")){
            String result = line1.replace("good", "tmp");
            result = result.replace("bad", "good");
            result = result.replace("tmp", "bad");

            System.out.println("Kimenet: " + result);
        }
        else{
            System.out.println("Kimenet: " + line1);
        }

        sc.close();
    }
}