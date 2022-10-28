public class Main {
    public static void main(String[] args){
        if (args.length != 3){
            System.out.println("Pontosan 3 szamot adjon meg!");
            System.exit(1);
        }
        
        boolean result = MyMath.isRightTriangle(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        if (result == true) {
            System.out.println("A háromszög derékszögű!");
        }
        else{
            System.out.println("A háromszög nem derékszögű!");
        }
    }
}
