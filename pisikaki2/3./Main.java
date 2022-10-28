class Main{
    public static void main(String[] args){
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += Math.pow(i,i);
        }

        System.out.println(sum);
    }
}