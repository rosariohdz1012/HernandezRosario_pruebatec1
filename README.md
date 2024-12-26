
# Sistema de Gestion de Empleados 

## Prueba tecnica N° 1  

### Descripcion del proyecto 

Se creo una aplicación la cual comienza con un menú, que te pide ingresar una opción con los números 1,2,3,4,5,6. Y en cada número se encuentra un método con una acción a realizar de los cuales las siguientes opciones  que lo integran es agregar, listar, listar por cargo, actualizar, eliminar y salir. 

En la opción de listar nos muestra todos los empleados ya registrados.  

Y en la de listar por cargo solo muestra el empleado que coincide con el que se ah digitado. 

Se puede buscar un empleado ya sea por cargo o por id, y el que se integra en la parte de presentación es el de cargo que nos permite buscar un cargo .  

El de buscar id sirve para la modificación de un empleado. 

En las excepciones solo ingrese el que buscar un empleado con cargo y que no ingresen los datos como números en el salario, y se encuentra en la  

 

### Cuestiones Técnicas 

Tuve problema con equals ya que no estaba reconociendo y me estaba mostrando todo y cheque porque pero cada vez salían cosillas raras, entonces ya no quise seguir modificando.  

Lo integro porque en los últimos minutos medí cuenta lo del error o porque no realizaba dicha acción entonces al final si quedo y ya realizo la acción que tanto había estado esperando. 

 En mi proyecto cree una paquete que se llama bd donde se encuentra el archivo sql de la base de datos y la base de datos se llama empleado solo que lo puse en un paquete. 

 

Las tecnologías que se utilizaron fueron: 

-JDK 17 

-JAVA Persistente Api (JPA) 

-NetBeans 17 

-MySql SGBD 

 

### Supuestos 

Se integro una nueva capa que se llama presentación en la cual contiene toda la interfaz gráfica necesario para una amistosa interacción con el usuario.  

También se creó aquí mismo una clase llamada validar la cual contiene las validaciones sobre campos vacíos y que no sean numéricos en los datos que no tiene que llevar números con nombre, apellido y el cargo.
