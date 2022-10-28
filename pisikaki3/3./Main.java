public class Main{
    public static void main(String[] args){
        if(args.length != 3){
            System.out.println("Hibas parameterezes");
            System.exit(1);
        }
        int felso;
        int also;
        int step;

        System.out.println("Argumentumok: " + args[0] + " "+ args[1]+ " " + args[2]);
        int counter = 1;
        if(Integer.parseInt(args[0]) > Integer.parseInt(args[1])){
            felso = Integer.parseInt(args[0]);
            also = Integer.parseInt(args[1]);
            step = Integer.parseInt(args[2]);

            for (int i = also; i < felso; i += step){
                if(i == also){
                    System.out.print("Kimenet: ");
                    System.out.print(counter + ".elem: " + i + ", ");
                    counter++;
                }
                else{
                    System.out.print(counter + ".elem: " + i + ", ");
                    counter++;
                }
            }
        }
    }
}