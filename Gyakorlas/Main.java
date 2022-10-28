import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
    public static void main(String args[]){
       /*  Scanner sc = new Scanner(System.in);
        System.out.print("Szoveget: ");
        String s = sc.nextLine(); */

        String s = "Szeretem    a java       nyelvet  bazma";
        System.out.println(s);

        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();

        String lista[] = s.split(" ");

        System.out.println(lista[0]);

        for(int i=0; i<lista.length; i++){
            if(lista[i] == " "){
                continue;
            }
            else{
                list.add(lista[i]);
            }
        }
        System.out.println(list);

        for(int i=0; i<list.size()-1; i++){
            if(list.get(i) == list.get(i+1)){
                continue;
            }
            else{
                list2.add(list.get(i));
            }

        }
        list2.add(list.get(list.size()-1));
        System.out.println(list2.toString());
        //sc.close();
    }
}
