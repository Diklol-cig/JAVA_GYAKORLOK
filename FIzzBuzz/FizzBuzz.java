class FizzBuzz{
    private int max;

    public FizzBuzz(int max){
        this.max = max;
    }

/*     public void setMax(int max) {
        this.max = max;
    } */

    public void start() {
        for (int i = 1; i <= this.max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0){
                System.out.println("Fizz");
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}