import java.util.Date;
import java.util.function.Supplier;

public class SuplierDemo {
    public static void main(String[] args) {
        Supplier<Date> suplier =()-> new Date();
        System.out.println(suplier.get());
    }
}
