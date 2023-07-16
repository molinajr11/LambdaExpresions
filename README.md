# LambdaExpresions
Anonymus function.
- no tiene nombre ni modificador de acceso
- no tiene tipo de retorno.
- no retorna nada.
# funcional interface. Single Abstract Method
- solo contiene un metodo abstracto pero permite cual quier cantidad de metodos default y staticos
Una inteface es una clase que solo contiene metodos abstractos y estos son los que solo se definen pero no la implementacion 
en una interface tenemos:
- metodos abstractos
- metodos default
- static methos.
Algunas interfaces funcionales son:
Interface->metodo abstracto
Runnable->run()
Callable->call()
Comparable -> compareTo()
ActionListener -> actionPerfomed()
- LAS EXPRECIONES LAMBDA SOLO PUEDEN IMPLEMENTAR METODOS FUNCIONALES
- las expresiones lambda en Java estan disenadas para invocar metodos de interfaces funcionales.
- En la programacion funcional pudemos crear nuestras propias interfaces funcionales y en los metodos podemos ponerlos a retornar algo o no si tipamos los metodos en la funcion lambda debemos usar el valor que se desea retornar.
# Pre defined function interface paquete java.util.function (8)
Estas interfaces funcionales se utilizan comunmente en programacion funcional y permiten pasar funciones como argumentos, devolver funciones como resultados y realizar operaciones funcionales en colecciones de datos.
# Predicate <T> (I): test()
- puede ser cualquier tipo Integer, String, Double ...
- Solo contiene un metodo abstracto que es test(): este metodo solo recive un paramentro y retorna true or false osea es metodo tipo boleano. 
- se usa cuando se quiere revisar condiciones

# Function <T,R> Tipo Retorno apply()
- Contiene el metodo abstracto apply() que toma el el parametro T y devuelve un resultado tipo R
util cuando se necesita realizar una transformacion o calculo en un objeto de entrada y obtener un resultado correspondiente. Puede ser utilizada en muchas situaciones, como mapeo de objetos, conversion de tipos de datos, aplicaciones de formulas matematicas

# Function Chaining  andThen() compose()
- El metodo andThen() es util cuando se requiere realizar una secuencia de operaciones en un valor de entrada y obtener un resultado compuesto. Permite combinar funciones de manera modular y concisa, lo que facilita la creacion de cadenas de operaciones mas complejas.
- El metodo compose() es util cuando deseas combinar funciones y aplicarlas en un orden especifico. Puedes encadenar multiples llamadas a compose() para combinar varias funciones en una secuencia especifica.

 # Consumer (i) <T> accept()
 - La interfaz Consumer es una interfaz funcional en Java que representa una operacion que acepta un solo argumento de entrada y no devuelve ningun resultado. Se utiliza principalmente para consumir o realizar operaciones en un objeto sin producir ningun resultado adicional.
 - es util cuando necesitas realizar una operacion en un objeto sin devolver ningun resultado. 
 -  Puedes usarlo en diferentes escenarios, como iterar sobre una coleccion de elementos y aplicar una operacion a cada elemento, o realizar alguna accion en un objeto sin necesidad de devolver un valor.
 # Suplier (i) <R> get()
 - Esta interfaz no toma ningun argumento y devuelve un resultado. Su unica funcion abstracta es get(), que se utiliza para obtener un resultado.
 - La interfaz Supplier se utiliza principalmente cuando necesitas generar o suministrar un valor sin ningun argumento de entrada. Puedes pensar en ella como una "fabrica" de valores, ya que proporciona un mecanismo para obtener valores bajo demanda.


