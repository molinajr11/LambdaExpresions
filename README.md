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