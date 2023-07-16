import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaIFunction {
    public static void main(String[] args) {
        Function<Integer,Integer> function=integer -> integer*integer;
        System.out.println(function.apply(10));

        Function<String,Integer>function1=string ->string.length();
        function1.apply("the answer");

        List<Employe> employeList = new ArrayList<Employe>();
        employeList.add(new Employe("juan",10000,0));
        employeList.add(new Employe("kD",5000,8));
        employeList.add(new Employe("DBook",3000,4));
        employeList.add(new Employe("B-Beal",500,7));

        Function<Employe,Integer> employeIntegerFunction= employe -> {
            if(employe.salary<1000){
                employe.salary= employe.salary *10;
            }
            return employe.salary;
        };
        for(Employe employee :employeList){
            employeIntegerFunction.apply(employee);
            System.out.println(employee.salary + " " + employee.name);
        }

    }
}
