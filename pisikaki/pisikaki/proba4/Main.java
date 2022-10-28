import java.util.List;

class Main{
    public static void main(String[] args){
        String fname = "cimek.txt";
        
        List<String> sorok = FileUtils.readLines(fname);

        int counter = 0;

        for(String s : sorok){
            String[] darabok = s.split(":");
            if(darabok[0].contains("A5")){
                System.out.println("x");
            }
            

            if(darabok[0].contains("A5") && darabok[1].contains("B8") && darabok[2].contains("F9")){
                System.out.println(darabok[0] + " " + darabok[1] + " " + darabok[2]);
                counter++;
            }
        }
        System.out.println(counter);
    }
}