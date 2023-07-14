import java.util.function.Predicate;

public class JoinPredicates {
    public static void main(String[] args) {
    int a []={1,2,3,4,5,6,7,32,45,27,22,20,50,10,14};
        Predicate <Integer>predicate=integer -> integer%2==0;
        Predicate <Integer> predicate1= integer->integer>10;
        //and
        for(int i:a){
            if(predicate.and(predicate1).test(i)){
                System.out.println(i+ " Metodo and");
            }
        }

        // or
        for(int i:a){
            if(predicate.or(predicate1).test(i)){
                System.out.println(i+" Metodo Or");
            }
        }
        // negate
        for(int i:a){
            if(predicate.negate().test(i)){
                System.out.println(i+ " Metodo Negate");
            }
        }
    }
}
