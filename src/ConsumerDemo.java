import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer= s -> System.out.println(s);
        consumer.accept("hi");

        List<Employe> employeList = new ArrayList<Employe>();
        employeList.add(new Employe("juan",10000.0,0));
        employeList.add(new Employe("kD",5000.0,8));
        employeList.add(new Employe("DBook",3000.0,4));
        employeList.add(new Employe("B-Beal",500.0,7));

        Function<Employe, Double> function= employee ->(employee.salary*10)/100;

        Predicate<Integer> predicate= integer -> integer>=500;

        Consumer<Employe> cconsumer=employe -> {
            System.out.println(employe.name);
            System.out.println(employe.salary);
            System.out.println(employe.experience);
        };
        for(Employe e:employeList){
           double bonus=function.apply(e);

           if(predicate.test((int) bonus)){
               cconsumer.accept(e);
               System.out.println("bonus = " + bonus);
           }

        }



    }

}
