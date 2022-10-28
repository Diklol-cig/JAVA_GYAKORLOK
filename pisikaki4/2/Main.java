class Main{
    public static void main(String[] args){
        if (args.length != 1){
            System.out.println("Pont egy szamot");
            System.exit(1);
        }
        int aszam = Integer.parseInt(args[0]);
        if(aszam < 100){
            System.out.println("Haromjegyu szamot agyg");
            System.exit(2);
        }
        boolean result1 = MyMath.isArmstrong(aszam);

        System.out.println(result1);
    }

}