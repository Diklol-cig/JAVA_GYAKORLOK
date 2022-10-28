import java.util.List;

class Main{
    public static void main(String[] args){
        Nevek nevek1 = new Nevek();

        System.out.println(nevek1);
    System.out.println(nevek1.size());
    System.out.println(nevek1.isEmpty());
    nevek1.append("Péter");
    nevek1.append("József");
    nevek1.append("Ajtony");
    System.out.println(nevek1);
    System.out.println(nevek1.size());
    System.out.println(nevek1.isEmpty());
    int count = nevek1.countHasLetterJ();
    System.out.println(count);
    nevek1.appendAll(List.of("Károly", "Ferenc"));
    System.out.println(nevek1);
    }
}