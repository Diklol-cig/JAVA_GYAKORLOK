import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.xml.validation.Validator;

class Main{
    public static void main(String args[]){
        String fname = "test.txt";
        List<String> sorok = FileUtils.readLines(fname);

        int sum = 0;
        int min = 0;
        int max = 0;
        int kiv;

        for (String sor : sorok) {
            System.out.println(sor + "asd ");
            System.out.println(sorok.split(" "));
        }
    }
}
