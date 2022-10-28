import java.util.ArrayList;
import java.util.List;

public class Nevek{
    private List<String> data;
    
    public Nevek(){
        this.data = new ArrayList<>();
    }

    public void append(String s) {
        this.data.add(s);
    }
    public void appendAll(List<String> adni){
        for(int i = 0; i < adni.size(); i++){
            this.data.add(adni.get(i));    
        }
    }

    public int size() {
        return data.size();
    }

    public Boolean isEmpty(){
        return this.size() == 0;
    }

    public int countHasLetterJ(){
        int count = 0;
        String input;
        for(int i=0; i<data.size(); i++){
            input = data.get(i);
            for(int j=0; j<input.length(); j++){
                if(input.toLowerCase().charAt(j)== 'j'){
                    count++;
                }
        }
    }
        return count;
    }



    @Override
    public String toString() {
        return "<" + this.data.toString() + "<";
    }
}