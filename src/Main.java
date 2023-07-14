public class Main {
    public static void main(String[] args) {
      /*  System.out.println("Hello world!");
        CabImpl cab = new CabImpl();
        cab.bookCab();*/
        Cab cab =()->System.out.println("Hello Cab");
        cab.bookCab();

        LambdaconArgumentos lamda= (source,destination)-> {
            System.out.println("De " + source + "hasta " + destination);
            return ("price:5000");
        };
        System.out.println(lamda.bookCab("medellin","bello"));
    }
}