import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Main{
    public static void main(String[] args){
        String fname = "hallgatok.csv";

        List<String> sorok = FileUtils.readLines(fname);

        List<String> nevek = new ArrayList<String>();
        List<String> result = new ArrayList<String>();
        String joSzak = "pti";
        for (String sor : sorok) {
            String[] darabok = sor.split(",");

            String szak = darabok[2].toLowerCase();
            //System.out.println(szak);
            
            if (szak.equals(joSzak)){
                //System.out.println(darabok[0]);

                nevek.add(darabok[0]);
                

            }
        }
        Collections.sort(nevek);
        //System.out.println(nevek.get(0).substring(0,1).toUpperCase() + nevek.get(0).substring(1).toLowerCase());
        for (int i = 0; i < nevek.size(); i++) {
            result.add(nevek.get(i).substring(0,1).toUpperCase() + nevek.get(i).substring(1).toLowerCase());
        }
        //System.out.println(nevek.toString().replace("[", "").replace("]",""));
        System.out.println(result.toString().replace("[", "").replace("]",""));
    }
}