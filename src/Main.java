import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
      /*  System.out.println("Hello world!");
        CabImpl cab = new CabImpl();
        cab.bookCab();*/
        Cab cab = () -> System.out.println("Hello Cab");
        cab.bookCab();

        LambdaconArgumentos lamda = (source, destination) -> {
            System.out.println("De " + source + "hasta " + destination);
            return ("price:5000");
        };
        System.out.println(lamda.bookCab("medellin", "bello"));


        List<Integer> numList = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            numList.add(i);
        }
        Predicate<Integer> isEven = num -> num % 2 == 0;
        for (int n : numList) {
            if (isEven.test(n)) {
                System.out.println(n);
            }
        }
        String text = "Piensa en grande Se grande";
        Predicate<String> isGreaterThan = tex -> tex.length() > 5;
        System.out.println(isGreaterThan.test(text));

        List<Employe> listaEmployemployes = new ArrayList<Employe>();
        listaEmployemployes.add(new Employe("juan",100.0,3));
        listaEmployemployes.add(new Employe("esteban",1000.0,3));
        listaEmployemployes.add(new Employe("magda",800.0,5));

        Predicate <Employe> predicate=employe1 -> (employe1.salary>300 && employe1.experience>2);
        for (Employe e:listaEmployemployes) {
            if (predicate.test(e)) {
                System.out.println(e.name);
            }
        }

    }
}